package com.axatp.java.se.study.aop;

import java.lang.reflect.Proxy;

/**
 * 
 * @Description: 切面测试
 * @author Martin
 * @date 2018年6月11日 下午2:03:42
 */
public class AopTest {
	
	public static void main(String[] args) {
	    UserImpl targetObject = new UserImpl();      
	    UserProxy proxy = new UserProxy(targetObject);   
	    //生成代理对象       
	    IUser object = (IUser)Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),    
	        targetObject.getClass().getInterfaces(), proxy);
	    
	    object.createUser(new UserInfo("admin", 18, 2));
	       
	    targetObject = new UserImpl();      
	    proxy = new UserProxy(targetObject);   
	    //生成代理对象       
	    object = (IUser)Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),    
		        targetObject.getClass().getInterfaces(), proxy); 
	    object.createUser(new UserInfo());
	}
	
}
