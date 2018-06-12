package com.axatp.java.se.study.aop;

import com.alibaba.fastjson.JSONObject;

public class UserImpl implements IUser{

	@Override
	public void createUser(UserInfo user) {
		System.out.println("创建用户：" + JSONObject.toJSONString(user));
	}

	@Override
	public void queryUser(UserInfo user) {
		System.out.println("查询用户：" + JSONObject.toJSONString(user));
	}

	@Override
	public void updateUser(UserInfo user) {
		System.out.println("更新用户：" + JSONObject.toJSONString(user));
	}

	@Override
	public void deleteUser(UserInfo user) {
		System.out.println("删除用户：" + JSONObject.toJSONString(user));
	}
	
}
