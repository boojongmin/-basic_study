package com.school.step16.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingSever {
	public ChattingSever(){
		System.out.println("서버 시작");
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			Socket socket = serverSocket.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			System.out.println(socket.isConnected());
			while(true){
				String message = reader.readLine();
				if(message == null) break;
				
				System.out.println("from client : " + message);
				out.println("from client : " + message);
				out.flush();
			}
			reader.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("서버 종료");
	}
	public static void main(String[] args) {
		new ChattingSever();
	}

}
