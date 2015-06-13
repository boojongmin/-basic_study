package com.school.step16.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public Client(){
		try {
			Socket socket = new Socket("127.0.0.1", 5000);
			OutputStream os = socket.getOutputStream();			
			PrintWriter out = new PrintWriter(os);
			out.print("서버에 문자를 전달.");
			out.flush();
			out.close();
			os.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
