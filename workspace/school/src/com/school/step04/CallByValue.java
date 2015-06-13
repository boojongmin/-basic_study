package com.school.step04;

import com.school.store.Goods;

public class CallByValue extends Goods {
	public static void main(String[] args){
		Person person = new Person("ȫ�浿");
		int a = 30;
		
		person.setAge(a);
		System.out.println(a);
	}
}
