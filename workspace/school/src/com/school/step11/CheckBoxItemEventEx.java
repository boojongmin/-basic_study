package com.school.step11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CheckBoxItemEventEx extends JFrame {
	Container contentPane;

	CheckBoxItemEventEx() {
		setTitle("예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new TextPanel(), BorderLayout.CENTER);
		
		
		setSize(400,500);
		setVisible(true);
	}
	
	class TextPanel extends JPanel{
		JTextArea ta = new JTextArea(10, 10);
		JButton btn = new JButton("실행");
		public TextPanel(){
			this.setLayout(new FlowLayout(FlowLayout.TRAILING));
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					try {
						String path = "E:\\java_dev\\workspace\\school\\src\\com\\school\\step11\\test.txt";
						File file = new File(path);
						byte[] bytes = new byte[(int)file.length()];
						FileInputStream fis = new FileInputStream(path);
						int read = fis.read(bytes);
						String txt = new String(bytes);
						ta.setText(txt);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			});
			add(new JLabel("버튼을 클릭하세요"));
			add(btn);
			add(ta);
			add(new JScrollPane(ta));			

		}
	}
	
	
	public static void main(String [] args) {
		new CheckBoxItemEventEx();
	}


}


