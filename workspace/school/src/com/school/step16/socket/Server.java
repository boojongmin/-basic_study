package com.school.step16.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public Server(){
		System.out.println("Server Start");
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			Socket socket = serverSocket.accept();
			System.out.println("¼­¹ö accept µÊ");
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Server End");
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
