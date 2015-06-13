package com.school.step_final;

import java.awt.BorderLayout;
import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class LogPanel extends JPanel{
	
	public LogPanel(){
		setLayout(new BorderLayout());
		String[] columnNames = { "순서", "아이디", "내용" };
		JDBCSelect jdbcSelect = new JDBCSelect();
		Object[][] datas = null;
		try {
			datas = jdbcSelect.selectChatLog();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		JTable table = new JTable(datas, columnNames);
		add( new JScrollPane(table) , BorderLayout.CENTER);
	}

}
