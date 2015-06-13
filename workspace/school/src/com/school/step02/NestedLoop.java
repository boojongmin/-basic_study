package com.school.step02;

import java.util.Scanner;

public class NestedLoop {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();		
		for (int j = 1; j < 10; j++) {
			System.out.print(i + "*" + j + "=" + i*j);
			System.out.print('\t');
		}
	}


}
