package com.school.step05;

public class AbstractMain {
	public static void main(String[] args) {
//		AbstractAnimal aa = new AbstractAnimal();
		AbstractAnimal duck = new DuckAnimal();
		duck.soundTemplate(3, 
				"============== 오리 소리 시작 ==============", 
				"============== 오리 소리 종료 ==============");
		
		AbstractAnimal cow = new CowAnimal();
		cow.soundTemplate(5, 
				"============== 소 울음 시작 ==============", 
				"============== 소 울음 종료 ==============");

	}
}
