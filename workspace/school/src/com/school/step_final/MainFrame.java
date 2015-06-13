package com.school.step_final;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public MainFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 500);
		setJMenuBar(new StudentMenuBar(this));
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
		Thread t = new Thread(new Server());
		t.start();
	}

}
