/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.entitymanager;

import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityImpl;
import org.activiti.engine.impl.persistence.entity.data.impl.MybatisUserDataManager;
import org.springframework.util.StringUtils;

import com.acitivi.dao.AdminUserPOMapper;
import com.acitivi.po.AdminUserPO;

/** 
* @ClassName: AdminUserDataManage 
* @Description: 
* @author wangran
* @date Jun 24, 2019 7:59:37 PM 
*/
public class AdminUserDataManager extends MybatisUserDataManager {

	private AdminUserPOMapper adminUserPOMapper;

	public AdminUserPOMapper getAdminUserPOMapper() {
		return adminUserPOMapper;
	}

	public void setAdminUserPOMapper(AdminUserPOMapper adminUserPOMapper) {
		this.adminUserPOMapper = adminUserPOMapper;
	}

	public AdminUserDataManager(ProcessEngineConfigurationImpl processEngineConfiguration) {
		super(processEngineConfiguration);
	}
	
	@Override
	public UserEntity findById(String entityId) {
		if(StringUtils.isEmpty(entityId)) {
			throw new RuntimeException("id不能为空！");
		}
		AdminUserPO adminUser = adminUserPOMapper.selectByPrimaryKey(Integer.valueOf(entityId));
		UserEntity entity = new UserEntityImpl();
		entity.setPassword(adminUser.getPassword());
		return entity;
	}
	
	
}
