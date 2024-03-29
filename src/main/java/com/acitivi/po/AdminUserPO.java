package com.acitivi.po;

import java.util.Date;
import java.util.List;

public class AdminUserPO {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.Business_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Long business_Id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.UserName
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private String userName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.State
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Byte state;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.Password
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.MobileNo
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private String mobileNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.Gender
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private String gender;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.TrueName
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private String trueName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.City_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Integer city_Id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.LastLoginTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Date lastLoginTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.HireDate
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Date hireDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.EmployeeType
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Byte employeeType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.Nickname
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private String nickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.LastChangePasswordTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Date lastChangePasswordTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.CreateTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.CreateUser_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Integer createUser_Id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.LastUpdateTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Date lastUpdateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.LastUpdateUser_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private Integer lastUpdateUser_Id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * adminuser.IdCard
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	private String idCard;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.Id
	 * @return the value of adminuser.Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.Id
	 * @param id the value for adminuser.Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.Business_Id
	 * @return the value of adminuser.Business_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Long getBusiness_Id() {
		return business_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.Business_Id
	 * @param business_Id the value for adminuser.Business_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setBusiness_Id(Long business_Id) {
		this.business_Id = business_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.UserName
	 * @return the value of adminuser.UserName
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.UserName
	 * @param userName the value for adminuser.UserName
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.State
	 * @return the value of adminuser.State
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Byte getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.State
	 * @param state the value for adminuser.State
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setState(Byte state) {
		this.state = state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.Password
	 * @return the value of adminuser.Password
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.Password
	 * @param password the value for adminuser.Password
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.MobileNo
	 * @return the value of adminuser.MobileNo
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.MobileNo
	 * @param mobileNo the value for adminuser.MobileNo
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo == null ? null : mobileNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.Gender
	 * @return the value of adminuser.Gender
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.Gender
	 * @param gender the value for adminuser.Gender
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.TrueName
	 * @return the value of adminuser.TrueName
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.TrueName
	 * @param trueName the value for adminuser.TrueName
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setTrueName(String trueName) {
		this.trueName = trueName == null ? null : trueName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.City_Id
	 * @return the value of adminuser.City_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Integer getCity_Id() {
		return city_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.City_Id
	 * @param city_Id the value for adminuser.City_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setCity_Id(Integer city_Id) {
		this.city_Id = city_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.LastLoginTime
	 * @return the value of adminuser.LastLoginTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.LastLoginTime
	 * @param lastLoginTime the value for adminuser.LastLoginTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.HireDate
	 * @return the value of adminuser.HireDate
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Date getHireDate() {
		return hireDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.HireDate
	 * @param hireDate the value for adminuser.HireDate
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.EmployeeType
	 * @return the value of adminuser.EmployeeType
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Byte getEmployeeType() {
		return employeeType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.EmployeeType
	 * @param employeeType the value for adminuser.EmployeeType
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setEmployeeType(Byte employeeType) {
		this.employeeType = employeeType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.Nickname
	 * @return the value of adminuser.Nickname
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.Nickname
	 * @param nickname the value for adminuser.Nickname
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.LastChangePasswordTime
	 * @return the value of adminuser.LastChangePasswordTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Date getLastChangePasswordTime() {
		return lastChangePasswordTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.LastChangePasswordTime
	 * @param lastChangePasswordTime the value for adminuser.LastChangePasswordTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setLastChangePasswordTime(Date lastChangePasswordTime) {
		this.lastChangePasswordTime = lastChangePasswordTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.CreateTime
	 * @return the value of adminuser.CreateTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.CreateTime
	 * @param createTime the value for adminuser.CreateTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.CreateUser_Id
	 * @return the value of adminuser.CreateUser_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Integer getCreateUser_Id() {
		return createUser_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.CreateUser_Id
	 * @param createUser_Id the value for adminuser.CreateUser_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setCreateUser_Id(Integer createUser_Id) {
		this.createUser_Id = createUser_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.LastUpdateTime
	 * @return the value of adminuser.LastUpdateTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.LastUpdateTime
	 * @param lastUpdateTime the value for adminuser.LastUpdateTime
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.LastUpdateUser_Id
	 * @return the value of adminuser.LastUpdateUser_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public Integer getLastUpdateUser_Id() {
		return lastUpdateUser_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.LastUpdateUser_Id
	 * @param lastUpdateUser_Id the value for adminuser.LastUpdateUser_Id
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setLastUpdateUser_Id(Integer lastUpdateUser_Id) {
		this.lastUpdateUser_Id = lastUpdateUser_Id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database
	 * column adminuser.IdCard
	 * @return the value of adminuser.IdCard
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public String getIdCard() {
		return idCard;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database
	 * column adminuser.IdCard
	 * @param idCard the value for adminuser.IdCard
	 * @mbggenerated Wed Nov 28 14:28:20 CST 2018
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
	}

	private List<AdminUserAuthPO> authList;

	/**
	 * 获取authList
	 * @return authList authList
	 */
	public List<AdminUserAuthPO> getAuthList() {
		return authList;
	}

	/**
	 * 设置authList
	 * @param authList authList
	 */
	public void setAuthList(List<AdminUserAuthPO> authList) {
		this.authList = authList;
	}
}
