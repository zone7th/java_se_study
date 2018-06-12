package com.axatp.java.se.study.aop;

/**
 * 
 * @Description: 用户操作检测
 * @author Martin
 * @date 2018年6月11日 上午11:06:10
 */
public class UserOperateCheck {
	
	/**
	 * 
	 * @Description: 允许操作
	 * @return
	 * @author Martin
	 * @date 2018年6月11日 上午11:08:31
	 */
	boolean isAllow(UserInfo user){
		if(null != user && "admin".equals(user.getName())){
			return true;
		}
		return false;
	}
	
}
