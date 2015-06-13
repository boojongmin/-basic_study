package com.school.step06;

import java.util.Properties;

public class Rect extends Object {
	int width;
	int height;
	public Rect(int width, int height) {
		this.width = width; 
		this.height = height;
	}
//	@Override
//	public boolean equals(Object p) {
//		if(p instanceof Rect){
//			Rect rect = (Rect)p;
//			if (width*height == rect.width*rect.height) 
//				return true;
////			else 
////				return false;
//		}
//		return false;
//	}
	
	
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		Rect d = null;
		if(a.equals(b)) 	System.out.println("a is equal to b");
		if(a.equals(c)) 	System.out.println("a is equal to c");
		if(b.equals(c)) 	System.out.println("b is equal to c");
		if(a.equals(d))     System.out.println("a is equal to d");
		if(d !=null && d.equals(a))  	System.out.println("null exception");
		Boolean bool = new Boolean("false");
		System.out.println(bool);
		Properties properties = System.getProperties();
		properties.forEach((x, y) -> {System.out.println("" + x + y);});
		System.out.println("Is exist : " +Boolean.getBoolean("java.runtime.name"));;
	}

}
