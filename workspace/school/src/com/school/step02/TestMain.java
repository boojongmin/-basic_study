package com.school.step02;

public class TestMain {

	public static void main(String[] args) {
		
		int a = 1 + 1 * 3;
		
		a = ++a * 3; // a = (a = a + 1) * 3
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
//		a++; // 5   a = a + 1
		
		System.out.println(a);
		
		int a2 = 10;
		String str = false ? "hello" : "bye";
		System.out.println(str);
		

	}

}
