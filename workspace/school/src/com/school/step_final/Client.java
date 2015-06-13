package com.school.step_final;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	public void sendMessage(String message) throws UnknownHostException, IOException {
		Socket socket = new Socket("192.168.0.19", 9999);
		OutputStream os = socket.getOutputStream();
		PrintWriter out = new PrintWriter(os);
		out.println(message);
		out.flush();
		out.close();
		os.close();
		socket.close();
	}
}
