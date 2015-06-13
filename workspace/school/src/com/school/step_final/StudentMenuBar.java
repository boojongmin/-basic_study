package com.school.step_final;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class StudentMenuBar extends JMenuBar {
	private JFrame frame;
	
	public StudentMenuBar(JFrame frame){
		this.frame = frame;
		
		JMenuItem item1 = new JMenuItem("chat");
		JMenuItem item2 = new JMenuItem("log");
		JMenu menu = new JMenu("메뉴");
		menu.add(item1);
		menu.add(item2);
		this.add(menu);
		
		//event 등록
		item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(new ChatPanel());
				frame.setVisible(true);
			}
		});
		
		item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setContentPane(new LogPanel());
				frame.setVisible(true);
			}
		});
		
	}

}
