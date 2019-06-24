/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.entitymanager;

import java.util.List;
import java.util.Map;

import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.Picture;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityManager;

/** 
* @ClassName: AbstractAdminUserEntityManager 
* @Description: 
* @author wangran
* @date Jun 24, 2019 8:08:35 PM 
*/
public class AbstractAdminUserEntityManager implements UserEntityManager {

	@Override
	public UserEntity create() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.EntityManager#findById(java.lang.String)
	 */
	@Override
	public UserEntity findById(String entityId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.EntityManager#insert(org.activiti.engine.impl.persistence.entity.Entity)
	 */
	@Override
	public void insert(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.EntityManager#insert(org.activiti.engine.impl.persistence.entity.Entity, boolean)
	 */
	@Override
	public void insert(UserEntity entity, boolean fireCreateEvent) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.EntityManager#update(org.activiti.engine.impl.persistence.entity.Entity)
	 */
	@Override
	public UserEntity update(UserEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.EntityManager#update(org.activiti.engine.impl.persistence.entity.Entity, boolean)
	 */
	@Override
	public UserEntity update(UserEntity entity, boolean fireUpdateEvent) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.EntityManager#delete(java.lang.String)
	 */
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.EntityManager#delete(org.activiti.engine.impl.persistence.entity.Entity)
	 */
	@Override
	public void delete(UserEntity entity) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.EntityManager#delete(org.activiti.engine.impl.persistence.entity.Entity, boolean)
	 */
	@Override
	public void delete(UserEntity entity, boolean fireDeleteEvent) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#createNewUser(java.lang.String)
	 */
	@Override
	public User createNewUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#updateUser(org.activiti.engine.identity.User)
	 */
	@Override
	public void updateUser(User updatedUser) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#findUserByQueryCriteria(org.activiti.engine.impl.UserQueryImpl, org.activiti.engine.impl.Page)
	 */
	@Override
	public List<User> findUserByQueryCriteria(UserQueryImpl query, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#findUserCountByQueryCriteria(org.activiti.engine.impl.UserQueryImpl)
	 */
	@Override
	public long findUserCountByQueryCriteria(UserQueryImpl query) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#findGroupsByUser(java.lang.String)
	 */
	@Override
	public List<Group> findGroupsByUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#createNewUserQuery()
	 */
	@Override
	public UserQuery createNewUserQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#checkPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public Boolean checkPassword(String userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#findUsersByNativeQuery(java.util.Map, int, int)
	 */
	@Override
	public List<User> findUsersByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#findUserCountByNativeQuery(java.util.Map)
	 */
	@Override
	public long findUserCountByNativeQuery(Map<String, Object> parameterMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#isNewUser(org.activiti.engine.identity.User)
	 */
	@Override
	public boolean isNewUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#getUserPicture(java.lang.String)
	 */
	@Override
	public Picture getUserPicture(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#setUserPicture(java.lang.String, org.activiti.engine.identity.Picture)
	 */
	@Override
	public void setUserPicture(String userId, Picture picture) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.impl.persistence.entity.UserEntityManager#deletePicture(org.activiti.engine.identity.User)
	 */
	@Override
	public void deletePicture(User user) {
		// TODO Auto-generated method stub
		
	}

}
