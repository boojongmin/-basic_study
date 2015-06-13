package com.school.step04;
public class Person{
	public String name;
	public int age;
	public Person(String name) {
		this.name = name;
	}
	public void setAge(int n) {
		this.age = n;
		n++;
	}
	
}