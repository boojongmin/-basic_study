package com.school.step02;

import java.util.Scanner;

public class SuccessOrFail {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�: ");
		int score = in.nextInt();
/*		if (score >= 80){
			System.out.println("�����մϴ�! �հ��Դϴ�1.");		
			System.out.println("�����մϴ�! �հ��Դϴ�2.");
		}else if(score >= 50){
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("Ż���Դϴ�.");
		}*/
		
		switch(score){
			case 1 : 
				System.out.println("���� 1�� �Է����ּ̽��ϴ�.");
				break;
			case 2 : 
				System.out.println("���� 2�� �Է����ּ̽��ϴ�.");
				break;
			case 3 : 
				System.out.println("���� 3�� �Է����ּ̽��ϴ�.");
				break;
			default :
				System.out.println("�߸��� ���ڸ� �Է����ּ̽��ϴ�.");
				break;
		}
		
	}
}
