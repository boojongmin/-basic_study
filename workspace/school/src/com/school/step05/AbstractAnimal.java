package com.school.step05;

public abstract class AbstractAnimal {
	String name;
	
	public String getName(){
		return this.name;
	}
	public void soundTemplate(int count, String startMessage, String closeMessage){
		System.out.println(startMessage);
		for(int i=0; i < count; i++){
			sound();
		}
		System.out.println(closeMessage);
	}
	
	abstract void sound();

}
