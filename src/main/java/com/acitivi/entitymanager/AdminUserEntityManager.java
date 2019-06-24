/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.entitymanager;

import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityManagerImpl;
import org.activiti.engine.impl.persistence.entity.data.UserDataManager;

/** 
* @ClassName: ActUserEntityService 
* @Description: 
* @author wangran
* @date Jun 24, 2019 6:06:40 PM 
*/
public class AdminUserEntityManager extends UserEntityManagerImpl {

	public AdminUserEntityManager(ProcessEngineConfigurationImpl processEngineConfiguration,
			UserDataManager userDataManager) {
		super(processEngineConfiguration, userDataManager);
	}

	public Boolean checkPassword(String userId, String password) {
		UserEntity entity = userDataManager.findById(userId);
		if (entity.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

}
