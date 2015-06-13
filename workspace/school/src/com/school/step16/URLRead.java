package com.school.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead {
    public static void main(String[] args) {
    		try {
				// URL ��ü ����
    			URL aURL = new URL("http://www.nate.com"); 

			// URL ��ü���� �Է� ��Ʈ�� ����
	    		BufferedReader in = 
						new BufferedReader(new InputStreamReader(
														aURL.openStream())); 
	    		String inputLine;
	
    			while ((inputLine = in.readLine()) != null) // ���� �� ����
    				System.out.println(new String(inputLine.getBytes(), "UTF-8"));
	    		in.close();
	    	} catch (IOException e) {
    			System.out.println("URL���� �����͸� �д� �� ������ �߻��߽��ϴ�.");
	    	}
	}
}
