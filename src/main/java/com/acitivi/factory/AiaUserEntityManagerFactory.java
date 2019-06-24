/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.factory;

import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;

/** 
* @ClassName: UserEntityManagerFactory 
* @Description: 
* @author wangran
* @date Jun 24, 2019 7:16:03 PM 
*/
public class AiaUserEntityManagerFactory implements SessionFactory {

	@Override
	public Class<?> getSessionType() {
		return null;
	}

	@Override
	public Session openSession(CommandContext commandContext) {
		return null;
	}

}
