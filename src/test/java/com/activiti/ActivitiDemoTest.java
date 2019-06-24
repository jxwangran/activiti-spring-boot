/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.activiti;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.editor.language.json.converter.BpmnJsonConverterUtil;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.apache.tomcat.util.security.MD5Encoder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import com.acitivi.App;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @ClassName: ActivitiTest
 * @Description:
 * @author wangran
 * @date Jun 19, 2019 2:58:56 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
// , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
public class ActivitiDemoTest {

	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private RepositoryService reposioryService;
	@Autowired
	private HistoryService historyService;
	@Autowired
	private ManagementService managementService;
	@Autowired
	private IdentityService identityService;

	@Test
	public void startProcessTest() {
		List<ProcessDefinition> processDefinitionList = reposioryService.createProcessDefinitionQuery().list();

		// ProcessInstance pInstance =
		// runtimeService.startProcessInstanceByKey("myProcess");
		// System.err.println(pInstance.getProcessDefinitionName());

		processDefinitionList.stream().forEach(
				m -> System.err.println("id : " + m.getId() + " ,name : " + m.getName() + " , key :" + m.getKey()));

		List<Task> taskList = taskService.createTaskQuery().processDefinitionKey("myProcess").list();
		System.err.println("size : " + taskList.size());
		// taskList.stream().forEach(m -> {
		// System.err.println(m.getName());
		// taskService.complete(m.getId());
		// System.err.println("流程完成");
		// });

		System.err.println("流程实例：" + runtimeService.createProcessInstanceQuery().count());

		ProcessInstance pInstance = runtimeService.createProcessInstanceQuery().singleResult();

		List<Execution> execution = runtimeService.createExecutionQuery().processInstanceId(pInstance.getId()).list();

		execution.stream().forEach(m -> runtimeService.setVariable(m.getId(), "days", 5));

		execution.stream()
				.forEach(m -> System.err.println(m.getId() + "的参数为：" + runtimeService.getVariable(m.getId(), "days")));

		Assert.assertNotNull(taskList);

		List<HistoricProcessInstance> instanceList = historyService.createHistoricProcessInstanceQuery().list();

		Assert.assertNotNull(instanceList);

		long hisFinishedCount = historyService.createHistoricProcessInstanceQuery().finished().count();

		System.err.println("finished 的流程实例为： " + hisFinishedCount);

		Long hisFinishedTaskCount = historyService.createHistoricTaskInstanceQuery().finished().count();

		System.err.println("finished 的任务为： " + hisFinishedTaskCount);

	}

	@Test
	public void serviceTest() {
		ProcessDefinition processDefinition = reposioryService.createProcessDefinitionQuery()
				.processDefinitionKey("serviceProcess6").singleResult();
		runtimeService.startProcessInstanceById(processDefinition.getId());

		List<Task> taskList = taskService.createTaskQuery().processDefinitionId(processDefinition.getId()).list();

		for (Task task : taskList) {
			if (task.getTaskDefinitionKey().equals("usertask1")) {
				taskService.complete(task.getId());
			}
		}

		long count = managementService.createJobQuery().count();
		// 前一个任务执行完成后调用定时任务
		System.err.println("job 的数量为： " + count);
		System.err.println("job 的数量为： " + count);
	}

	@Test
	public void engineTest() {
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		RepositoryService reService = engine.getRepositoryService();
		DeploymentBuilder builder = reService.createDeployment();
		// 部署流程描述文件
		// builder.addBytes(resourceName, bytes);
		Deployment deployment = builder.deploy();
		// 查找流程定义文件
		ProcessDefinition pDefinition = reService.createProcessDefinitionQuery().deploymentId(deployment.getId())
				.singleResult();

		// BpmnXMLConverter converter = new BpmnXMLConverter();
	}

	@Test
	public void upLoadTest() throws Exception {
		System.err.println("开始");
		File file = new File("/Users/wangran/GYL/activiti-my-app/src/main/resources/processes/VacationProcesses2.bpmn");
		FileInputStream fileInputStream = new FileInputStream(file);
		XMLStreamReader streamReader = XMLInputFactory.newInstance().createXMLStreamReader(fileInputStream);
		BpmnModel bpmnModel = new BpmnXMLConverter().convertToBpmnModel(streamReader);

		Model modelData = reposioryService.newModel();
		ObjectNode objNode = new ObjectMapper().createObjectNode();
		objNode.put(ModelDataJsonConstants.MODEL_NAME, bpmnModel.getMainProcess().getName());
		objNode.put(ModelDataJsonConstants.MODEL_REVISION, 1);
		modelData.setMetaInfo(objNode.toString());
		modelData.setName(bpmnModel.getMainProcess().getName());
		reposioryService.saveModel(modelData);

		BpmnJsonConverter bpmnConverter = new BpmnJsonConverter();
		ObjectNode bpmnNode = bpmnConverter.convertToJson(bpmnModel);
		reposioryService.addModelEditorSource(modelData.getId(), bpmnNode.toString().getBytes("UTF-8"));
		System.err.println("结束");
	}
	
	@Test
	public void userPasswordCheck() {
		boolean isTrue = identityService.checkPassword("237", DigestUtils.md5DigestAsHex("123456".getBytes()));
		Assert.assertNotEquals(isTrue, true);
	}
	
}
