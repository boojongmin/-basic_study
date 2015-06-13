package com.school.step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.0.19", 8888);
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		while(true){
			String line = reader.readLine();
			if("bye".equals(line)){
				break;
			}
			writer.write(line);
		}
		writer.close();
		reader.close();
		isr.close();
		is.close();
		s.close();
		
	}

}
