package com.school.step10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerMouseEx2 extends JFrame {
	
	public ListenerMouseEx2(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLayout(new FlowLayout());
		JButton button = new JButton("button");
		
		JButton button2 = new JButton("button 2");
		add(button);
		add(button2);
		
		setVisible(true);
		
		//event 등록
//		button.addActionListener(new ExMouseListenerImpl2());
		button.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						JButton b = (JButton)e.getSource();
						b.setBackground(Color.orange);
					}
				});
		
		//button2에 lambda로 event 등록
		button2.addActionListener(e -> {
			JButton b = (JButton)e.getSource();
			b.setBackground(Color.magenta);
		});
		
		
		
	}
	
	public static void main(String[] args){
		new ListenerMouseEx2();
	}
}

//class ExMouseListenerImpl2 implements ActionListener {
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton)e.getSource();
//		b.setBackground(Color.orange);
//	}
//	
//}
