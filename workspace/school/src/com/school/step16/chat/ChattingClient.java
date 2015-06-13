package com.school.step16.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingClient {
	public ChattingClient(){
		System.out.println("家南 矫累");
		try {
			Socket socket = new Socket("127.0.0.1", 5000);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true){
				Scanner scanner = new Scanner(System.in);
				String message = scanner.next();
				System.out.println(message);
				out.println(message);
				out.flush();
				String serverMessage = reader.readLine();
				System.out.println(serverMessage);
				
				if("bye".equals(message)){
					out.close();
					reader.close();
					socket.close();
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("家南 辆丰");
	}
	
	public static void main(String[] args) {
		new ChattingClient();
	}

}
