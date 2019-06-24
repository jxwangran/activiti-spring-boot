/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

/** 
* @ClassName: MyJavaDelegateService 
* @Description: 
* @author wangran
* @date Jun 20, 2019 4:28:46 PM 
*/
public class MyJavaDelegateService implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) {
		System.err.println("MyJavaDelegateService定时任务");
	}
	
}
