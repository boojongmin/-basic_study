package com.school.step04;

public class ParentClass extends Object {
	//생성자의 리턴값 = 객체의 주소
	ParentClass(){
		age = 50;
	}
	ParentClass(int a){
		age = a;
	}
	
	
	//필드 선언
	int age;
	//메서드 선언
	// 1. 문장의 집합
	// 2. 문장이 실행되고 마지막에는 값(또는 객체)를 반환
	
	int getAge(){
		return age;
	}
	
	void setAge(int a){
		age = a;
	}
	
	
	
	
}
