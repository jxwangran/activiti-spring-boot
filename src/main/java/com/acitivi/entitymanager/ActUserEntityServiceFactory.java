package com.acitivi.entitymanager;

import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;

public class ActUserEntityServiceFactory implements SessionFactory {
    

	@Override
	public Session openSession(CommandContext commandContext) {
		commandContext.getUserEntityManager();
		return null;
	}
	
	@Override
	public Class<?> getSessionType() {
		return null;
	}

}