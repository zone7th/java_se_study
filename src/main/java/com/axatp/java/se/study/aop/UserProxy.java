package com.axatp.java.se.study.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserProxy implements InvocationHandler {
	
	private Object targetObject;

	public UserProxy(Object userImpl) {
		super();
		targetObject = userImpl;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		//判断是否有权限执行此操作
		UserInfo userInfo = (UserInfo) args[0];
		Object result = null;
		if(null != userInfo && "admin".equals(userInfo.getName())){
			System.out.println("权限验证通过");
			result = method.invoke(targetObject, args);
		}else{
			System.out.println("权限验证不通过");
		}
	       
	    return result;   
	}

}
