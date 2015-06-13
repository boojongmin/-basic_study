package com.school.step10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ListenerMouseEx3 extends JFrame {
	
	public ListenerMouseEx3(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		setLayout(layout);
		
		JLabel label = new JLabel("hello");
		add(label);
		
		setVisible(true);
		
		//컴포넌트에 listener 연동
		addMouseListener(new Ex3Listener(label));
		
	}
	
	public static void main(String[] args){
		new ListenerMouseEx3();
	}
}

class Ex3Listener extends MouseAdapter {
	JLabel label;

	public Ex3Listener(JLabel label) {
		this.label = label;
	}
	
	@Override
	public void mouseClicked(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		label.setLocation(x, y);
	}
	
	
}
