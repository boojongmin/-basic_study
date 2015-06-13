package com.school.step04;
public class Main {
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		System.out.println(pc.age);
		System.out.println(pc.getAge());
		
		ParentClass pc2 = new ParentClass(99);
		System.out.println(pc2.age);
		System.out.println(pc2.getAge());
		
		pc2.setAge(102);
		System.out.println(pc2.age);
		System.out.println(pc2.getAge());
		
		
		ChildClass cc = new ChildClass();
		System.out.println(cc.age);
		cc.sound();
	}
}
