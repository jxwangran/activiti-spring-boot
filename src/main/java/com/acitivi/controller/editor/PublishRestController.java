/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.controller.editor;

import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/** 
* @ClassName: PublishRest 
* @Description: 
* @author wangran
* @date Jun 24, 2019 11:08:20 AM 
*/
//@RestController
//@RequestMapping("service")
public class PublishRestController {
	
	@Autowired
	private RepositoryService repositoryService;

//	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
//	@ResponseStatus(value = HttpStatus.OK)
	public void uploadBpmnFile(@RequestParam("uploadfile") MultipartFile uploadfile) throws XMLStreamException, FactoryConfigurationError, IOException {
		String fileName = uploadfile.getName();
		XMLStreamReader streamReader = XMLInputFactory.newInstance().createXMLStreamReader(new InputStreamReader(uploadfile.getInputStream()));
		BpmnModel bpmnModel = new BpmnXMLConverter().convertToBpmnModel(streamReader);
		
		Model modelData = repositoryService.newModel();
		ObjectNode objNode = new ObjectMapper().createObjectNode();
		objNode.put(ModelDataJsonConstants.MODEL_NAME, bpmnModel.getMainProcess().getName());
		objNode.put(ModelDataJsonConstants.MODEL_REVISION, 1);
		modelData.setMetaInfo(objNode.toString());
		modelData.setName(bpmnModel.getMainProcess().getName());
		repositoryService.saveModel(modelData);
		
		BpmnJsonConverter bpmnConverter = new BpmnJsonConverter();
		ObjectNode bpmnNode	= bpmnConverter.convertToJson(bpmnModel);
		repositoryService.addModelEditorSource(modelData.getId(), bpmnNode.toString().getBytes("UTF-8"));
		
	}
	
}
