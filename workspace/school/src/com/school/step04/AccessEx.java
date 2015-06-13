package com.school.step04;


public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.setB(10);
//		aClass.c = 10;
		TestClass test = new TestClass();
		test.c = 10;
	}
}

