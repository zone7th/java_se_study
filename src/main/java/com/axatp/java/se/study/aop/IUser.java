package com.axatp.java.se.study.aop;

/**
 * 
 * @Description: 用户
 * @author Martin
 * @date 2018年6月11日 上午11:00:33
 */
public interface IUser {
	/**
	 * 
	 * @Description: 创建用户
	 * @param userName
	 * @author Martin
	 * @date 2018年6月11日 上午11:03:37
	 */
	void createUser(UserInfo user);
	
	/**
	 * 
	 * @Description: 查询用户
	 * @param userName
	 * @author Martin
	 * @date 2018年6月11日 上午11:03:52
	 */
	void queryUser(UserInfo user);
	
	/**
	 * 
	 * @Description: 更新用户
	 * @param userName
	 * @author Martin
	 * @date 2018年6月11日 上午11:04:02
	 */
	void updateUser(UserInfo user);
	
	/**
	 * 
	 * @Description: 删除用户 
	 * @param userName
	 * @author Martin
	 * @date 2018年6月11日 上午11:04:11
	 */
	void deleteUser(UserInfo user);
	
}
