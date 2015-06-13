package com.school.step09.gui01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyAppExtends extends JFrame {
	
	public MyAppExtends(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyAppExtends");
		setSize(600, 400);
		
		setLayout(new BorderLayout(10, 20));
		
		//button»ý¼º
		JButton button1 = new JButton("west");
		JButton button2 = new JButton("east");
		JButton button3 = new JButton("north");
		JButton button4 = new JButton("south");
		JButton button5 = new JButton("center");

//		Container contentPane = getContentPane();
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.NORTH);
		add(button4, BorderLayout.SOUTH);
		add(button5, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new MyAppExtends();
	}
}
