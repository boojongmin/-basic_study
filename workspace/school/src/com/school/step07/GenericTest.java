package com.school.step07;

public class GenericTest<T> {
	public T gm;
	
	public void hello(T a){
		System.out.println(a);
	}
	
	public static void main(String[] args){
		GenericTest<AClass> g1 = new GenericTest<AClass>();
		g1.hello(new AClass());
		
		GenericTest<BClass> g2 = new GenericTest();
		g2.hello(new BClass());
	}
	

}

class AClass{
	@Override
	public String toString(){
		return "AClass";
	}
}

class BClass{
	@Override
	public String toString(){
		return "BClass";
	}
}


