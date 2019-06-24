/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.service;

import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 
* @ClassName: ActivitiBaseService 
* @Description: 
* @author wangran
* @date Jun 19, 2019 2:46:27 PM 
*/
@Service
public class ActivitiBaseService {

	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private IdentityService identityService;
	@Autowired
	private RepositoryService reposioryService;
	@Autowired
	private ProcessEngine processEngine;
	@Autowired
	private HistoryService historyService;
	
	
	
}
