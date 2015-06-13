package com.school.step_final;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatPanel extends JPanel {
	private Client client = new Client();
	
	public ChatPanel(){
		setLayout(new BorderLayout());
		
		JTextArea ta = new JTextArea();
		ta.setEditable(false);
		JTextField tf = new JTextField();
		
		add( new JScrollPane(ta), BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		
		//event µî·Ï
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = tf.getText();
				try {
					client.sendMessage(message);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				ta.append( message + "\n"  );
				tf.setText("");
				
			}
		});
	}

}
