package com.school.step02;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {
	public static void main (String args[]) { 
		InputStreamReader rd = new InputStreamReader(System.in);
		// ���۷���Ÿ�� = ��� class
		// null;
		try {
			while (true) {
				int a = rd.read();
				if (a == -1)	// ctrl-z�� �ԷµǸ� read()�� -1�� ����
					break;
				System.out.println((char)a);	// �Էµ� ���� ���
			}  
		} 
		catch (IOException e) {
			System.out.println("�Է� ���� �߻�");
		}
	}
}
