package com.school.step04;

public class ParentClass extends Object {
	//�������� ���ϰ� = ��ü�� �ּ�
	ParentClass(){
		age = 50;
	}
	ParentClass(int a){
		age = a;
	}
	
	
	//�ʵ� ����
	int age;
	//�޼��� ����
	// 1. ������ ����
	// 2. ������ ����ǰ� ���������� ��(�Ǵ� ��ü)�� ��ȯ
	
	int getAge(){
		return age;
	}
	
	void setAge(int a){
		age = a;
	}
	
	
	
	
}
