package com.school;
public class UnicodeExample {
	public static void main(String[] args) {
//		char alphabet =  'A';
//		char a1 = 0xBD80;
//		char a2 = 0xC885;
//		char a3 = '\uBBFC';
//		int aa = 100;
//		aa =a3;
//		long la = 1000000000000000L;
//		double da = 1234E-4;
//		System.out.println(alphabet);
//		System.out.print(a1);
//		System.out.print(a2);
//		System.out.println(a3);
//		
		char[] as = new char[4];
		as[0] = 0xBD80;
		as[1] = 0xC885;
		as[2] = '\u0009';
		as[3] = 0xBBFC;
//		System.out.print(as[0]);
//		System.out.print(as[1]);
//		System.out.print(as[2]);
//		System.out.print(as[3]);
		System.out.println(">>>>>>>\n");
		
		for(int i=0; i < as.length; i++){
			System.out.print(as[i]);
		}
		System.out.println("\n>>>>>>");
		//foreach  for(type 변수명  : 콜렉션명(배열명) )
		for(char c : as){
			System.out.print(c);
		}
		
		
		
		
//		
////		System.out.print(as[4]);
//		boolean bool = true;
		
//		final int FINT = 100;
//
//		System.out.println(FINT);
//		
//		byte b1 = 125;
//		int int1 = 100000 + b1;
//		System.out.println(int1);
//		b1 = (byte)int1;
//		System.out.println(b1);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
