package com.school.step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class KeyClient {
	public void runClient(String message) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.0.19", 8888);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		writer.write(message);
		writer.close();
		s.close();
		
	}

}
