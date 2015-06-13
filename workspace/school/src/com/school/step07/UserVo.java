package com.school.step07;

public class UserVo {
	String name;
	int age;
	String address;
	public UserVo(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return name + "/" + age + "/" +address;
	}
	
	
}
