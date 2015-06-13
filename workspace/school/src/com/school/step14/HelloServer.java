package com.school.step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JLabel;

public class HelloServer {
	public void runServer(JLabel label) throws IOException{
		//1 ~ 65535 : 0 ~ 1023 X , 1024 ~ 65535 O
		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("socket is opened.");
		
		while(true){
			Socket s = serverSocket.accept();
			InputStream is = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String line = br.readLine();
//			System.out.println(line);
			label.setText( label.getText() + "\n" + line);
			
//			OutputStream out = s.getOutputStream();
//			OutputStreamWriter reader = new OutputStreamWriter(out);
//			BufferedWriter writer = new BufferedWriter(reader);
//			writer.write(line);
//			writer.flush();
			
//			is.close();
//			
//			writer.close();
//			writer.close();
//			out.close();
//			
//			s.close();
		}
	}
}
