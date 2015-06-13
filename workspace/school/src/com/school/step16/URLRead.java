package com.school.step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead {
    public static void main(String[] args) {
    		try {
				// URL 객체 생성
    			URL aURL = new URL("http://www.nate.com"); 

			// URL 객체에서 입력 스트림 생성
	    		BufferedReader in = 
						new BufferedReader(new InputStreamReader(
														aURL.openStream())); 
	    		String inputLine;
	
    			while ((inputLine = in.readLine()) != null) // 한행 씩 읽음
    				System.out.println(new String(inputLine.getBytes(), "UTF-8"));
	    		in.close();
	    	} catch (IOException e) {
    			System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
	    	}
	}
}
