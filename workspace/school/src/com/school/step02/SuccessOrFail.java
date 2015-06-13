package com.school.step02;

import java.util.Scanner;

public class SuccessOrFail {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("점수를 입력하시오: ");
		int score = in.nextInt();
/*		if (score >= 80){
			System.out.println("축하합니다! 합격입니다1.");		
			System.out.println("축하합니다! 합격입니다2.");
		}else if(score >= 50){
			System.out.println("보류입니다.");
		}else{
			System.out.println("탈락입니다.");
		}*/
		
		switch(score){
			case 1 : 
				System.out.println("숫자 1을 입력해주셨습니다.");
				break;
			case 2 : 
				System.out.println("숫자 2를 입력해주셨습니다.");
				break;
			case 3 : 
				System.out.println("숫자 3를 입력해주셨습니다.");
				break;
			default :
				System.out.println("잘못된 숫자를 입력해주셨습니다.");
				break;
		}
		
	}
}
