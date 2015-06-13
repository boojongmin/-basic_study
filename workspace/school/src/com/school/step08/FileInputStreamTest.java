package com.school.step08;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.DatatypeConverter;

public class FileInputStreamTest {
	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
		
			String path = "E:/java_dev/workspace/school/src/com/school/step08/FileInputStreamTest.java";
			fis = new FileInputStream(path);
			File file = new File(path);
			byte[] bytes = new byte[(int)file.length()];
	//		fis.read(bytes);
	//		String resultString = new String(bytes);
	//		System.out.println(resultString);
			//한글
			StringBuffer sb = new StringBuffer();
			while(true){
				int read = fis.read();
				if(read != -1){
					//byte read1 = 0b00000001;
					char c = (char)read;
					sb.append(c);
				}else{
					break;
				}
			}
			String resultString = sb.toString();
			System.out.println(resultString);
			
			String[] pathArr = path.split("\\."); 
			path = pathArr[0] + "(1)" + "." + pathArr[1];  
			fos = new FileOutputStream(path);
			fos.write(bytes);
			if(true) throw new EOFException("eof");
			
			
			//한글
		}catch(Exception e){
			System.out.println("eof 오류 발생");
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	


}
