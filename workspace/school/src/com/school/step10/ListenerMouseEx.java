package com.school.step10;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerMouseEx extends JFrame {
	
	public ListenerMouseEx(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLayout(new FlowLayout());
		JButton button = new JButton("button");
		add(button);
		
		setVisible(true);
		
		//event µî·Ï
		button.addMouseListener(new ExMouseListenerImpl());
	}
	
	public static void main(String[] args){
		new ListenerMouseEx();
	}
}

class ExMouseListenerImpl implements MouseListener {
	
//	JButton button;
//	
//	public ExMouseListenerImpl(JButton btn) {
//		this.button = btn;
//	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		this.button.setBackground(Color.green);
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.green);
	}

	@Override
	public void mouseExited(MouseEvent e) {
//		this.button.setBackground(Color.yellow);
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.yellow);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
		
	}
	
}
