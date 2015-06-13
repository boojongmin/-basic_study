package com.school.step08;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.DatatypeConverter;

public class FileInputStreamTest2 {
	public static void main(String[] args){
		String path = "E:/java_dev/workspace/school/src/com/school/step08/FileInputStreamTest.java";
		try(FileInputStream fis = new FileInputStream(path);
				FileOutputStream fos =  new FileOutputStream(path);
			){

			File file = new File(path);
			byte[] bytes = new byte[(int)file.length()];
			fis.read(bytes);
			String resultString = new String(bytes);
			System.out.println(resultString);
			System.out.println(resultString);
			
			String[] pathArr = path.split("\\."); 
			path = pathArr[0] + "(1)" + "." + pathArr[1];  
			fos.write(bytes);
			if(true) throw new EOFException("eof");
		}catch(Exception e){
			System.out.println("eof 오류 발생");
		}
	}
	


}
