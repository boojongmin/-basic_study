package com.school.step_final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
	public void insertChatLog(String clientid, String message) throws ClassNotFoundException, SQLException {
		//����� driver ����
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://192.168.0.19:3306/chatting";
		String userid = "student";
		String password = "1234";
		//����
		Connection conn = DriverManager.getConnection(url, userid, password);		
		//���
		conn.setAutoCommit(false);
		Statement st = conn.createStatement();
		String sql ="insert into chatting(userid, message) values('" + clientid + "', '" + message + "')";
		// executeUpdate - delete insert update    => return type int     
		// executeQuery - select                   => return type ResultSet
		int count = st.executeUpdate(sql);
		//transaction commit ����
		conn.commit();
		
		//����
		st.close();
		conn.close();
	}
}
