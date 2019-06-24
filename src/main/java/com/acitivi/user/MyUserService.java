/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.user;

import java.util.List;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.GroupQuery;
import org.activiti.engine.identity.NativeGroupQuery;
import org.activiti.engine.identity.NativeUserQuery;
import org.activiti.engine.identity.Picture;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;

/** 
* @ClassName: MyUserService 
* @Description: 
* @author wangran
* @date Jun 24, 2019 4:03:38 PM 
*/
public class MyUserService implements IdentityService {

	@Override
	public User newUser(String userId) {
		return null;
	}

	@Override
	public void saveUser(User user) {
		
	}

	@Override
	public UserQuery createUserQuery() {
		return null;
	}

	@Override
	public NativeUserQuery createNativeUserQuery() {
		return null;
	}

	@Override
	public void deleteUser(String userId) {
		
	}

	@Override
	public Group newGroup(String groupId) {
		return null;
	}

	@Override
	public GroupQuery createGroupQuery() {
		return null;
	}

	@Override
	public NativeGroupQuery createNativeGroupQuery() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#saveGroup(org.activiti.engine.identity.Group)
	 */
	@Override
	public void saveGroup(Group group) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#deleteGroup(java.lang.String)
	 */
	@Override
	public void deleteGroup(String groupId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#createMembership(java.lang.String, java.lang.String)
	 */
	@Override
	public void createMembership(String userId, String groupId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#deleteMembership(java.lang.String, java.lang.String)
	 */
	@Override
	public void deleteMembership(String userId, String groupId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#checkPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean checkPassword(String userId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#setAuthenticatedUserId(java.lang.String)
	 */
	@Override
	public void setAuthenticatedUserId(String authenticatedUserId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#setUserPicture(java.lang.String, org.activiti.engine.identity.Picture)
	 */
	@Override
	public void setUserPicture(String userId, Picture picture) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#getUserPicture(java.lang.String)
	 */
	@Override
	public Picture getUserPicture(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#setUserInfo(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void setUserInfo(String userId, String key, String value) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#getUserInfo(java.lang.String, java.lang.String)
	 */
	@Override
	public String getUserInfo(String userId, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#getUserInfoKeys(java.lang.String)
	 */
	@Override
	public List<String> getUserInfoKeys(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.activiti.engine.IdentityService#deleteUserInfo(java.lang.String, java.lang.String)
	 */
	@Override
	public void deleteUserInfo(String userId, String key) {
		// TODO Auto-generated method stub
		
	}

	
	
}
