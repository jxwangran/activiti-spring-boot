package com.acitivi.dao;

import com.acitivi.po.AdminUserAuthPO;

public interface AdminUserAuthPOMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * adminuserauth
	 * @mbggenerated Tue Oct 16 19:37:27 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * adminuserauth
	 * @mbggenerated Tue Oct 16 19:37:27 CST 2018
	 */
	int insert(AdminUserAuthPO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * adminuserauth
	 * @mbggenerated Tue Oct 16 19:37:27 CST 2018
	 */
	int insertSelective(AdminUserAuthPO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * adminuserauth
	 * @mbggenerated Tue Oct 16 19:37:27 CST 2018
	 */
	AdminUserAuthPO selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * adminuserauth
	 * @mbggenerated Tue Oct 16 19:37:27 CST 2018
	 */
	int updateByPrimaryKeySelective(AdminUserAuthPO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table
	 * adminuserauth
	 * @mbggenerated Tue Oct 16 19:37:27 CST 2018
	 */
	int updateByPrimaryKey(AdminUserAuthPO record);

}
