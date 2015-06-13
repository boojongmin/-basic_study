package com.school.step05;

public class DObject {
	public void draw(){
		System.out.println("DObject draw");
	}
	
	public static void main(String[] args){
		DObject dObject = new DObject();
		dObject.draw();
		
		Line line = new Line();
		line.draw();
		
		DObject dd = line;
		dd.draw();
		
		
	}
}
