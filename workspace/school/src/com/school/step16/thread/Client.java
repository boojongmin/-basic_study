package com.school.step16.thread;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.19", 9999);
		OutputStream os = socket.getOutputStream();
		PrintWriter out = new PrintWriter(os);
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			String message = scanner.nextLine();
			if( "exit".equals(message) ) break;
			
			out.println(message);
			out.flush();
		}
		out.close();
		os.close();
		socket.close();
	}
}
