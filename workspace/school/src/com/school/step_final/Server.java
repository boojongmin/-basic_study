package com.school.step_final;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class Server implements Runnable {
	
	@Override
	public void run(){
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			while(true){
				Socket socket = serverSocket.accept();
				String host = socket.getInetAddress().getHostName() ;
				System.out.println("소켓 연결됨 : " + host);
				Thread t = new Thread(new ServerRunable(socket));
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("서버 시작");
		new Server();
		System.out.println("서버 종료");
	}
	
}

class ServerRunable implements Runnable {
	private JDBCInsert jdbcInsert = new JDBCInsert();
	
	Socket socket;
	public ServerRunable(Socket socket){
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			
			while(true){
				String clientMessage = reader.readLine();
				if(clientMessage == null) break;
				
				String host = socket.getInetAddress().getHostName() ;
				System.out.println(host +  " >> " + clientMessage);
				
				try {
					jdbcInsert.insertChatLog(host, clientMessage);
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
			}
			reader.close();
			isr.close();
			is.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}