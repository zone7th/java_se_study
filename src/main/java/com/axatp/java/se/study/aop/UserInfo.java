package com.axatp.java.se.study.aop;

/**
 * 
 * @Description: 用户信息
 * @author Martin
 * @date 2018年6月11日 上午11:09:15
 */
public class UserInfo {
	private String name;
	
	private int age;
	
	private int sex;

	public UserInfo() {
		super();
	}

	public UserInfo(String name, int age, int sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
}
