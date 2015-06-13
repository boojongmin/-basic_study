package com.school.step10;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.school.step14.HelloServer;

public class ListenerKeyEx extends JFrame {
	public JLabel label;
	public ListenerKeyEx(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		GridLayout layout = new GridLayout(1, 2);
		setLayout(layout);
		//컴포넌트 선언
		JTextField text = new JTextField();
		this.label = new JLabel();
		//Container에 컴포넌트 등록
		add(text);
		add(label);
		
		setVisible(true);
		
		//listener 등록
		text.addKeyListener(new KeyExListener( label, text ));
	}
	
	public static void main(String[] args) throws IOException{
		ListenerKeyEx frame = new ListenerKeyEx();
		new HelloServer().runServer(frame.label);
	}
}

class KeyExListener implements KeyListener {
	JLabel text;
	JTextField textField;
	String message = "";

	public KeyExListener(JLabel text, JTextField textField) {
		this.text = text;
		this.textField = textField;
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if(KeyEvent.VK_ENTER == keyCode){
			String message = textField.getText();
			KeyClient client = new KeyClient();
			try{
				client.runClient(message);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		message += e.getKeyChar();
	}
}
