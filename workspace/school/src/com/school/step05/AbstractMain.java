package com.school.step05;

public class AbstractMain {
	public static void main(String[] args) {
//		AbstractAnimal aa = new AbstractAnimal();
		AbstractAnimal duck = new DuckAnimal();
		duck.soundTemplate(3, 
				"============== ���� �Ҹ� ���� ==============", 
				"============== ���� �Ҹ� ���� ==============");
		
		AbstractAnimal cow = new CowAnimal();
		cow.soundTemplate(5, 
				"============== �� ���� ���� ==============", 
				"============== �� ���� ���� ==============");

	}
}
