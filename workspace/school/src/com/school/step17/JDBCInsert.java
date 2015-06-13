package com.school.step17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//사용할 driver 선택
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://192.168.0.19:3306/chatting";
		String userid = "student";
		String password = "1234";
		//연결
		Connection conn = DriverManager.getConnection(url, userid, password);		
		//사용
		conn.setAutoCommit(false);
		Statement st = conn.createStatement();
		String sql ="insert into chatting(userid, message) values('boojongmin', 'hello')";
		// executeUpdate - delete insert update    => return type int     
		// executeQuery - select                   => return type ResultSet
		int count = st.executeUpdate(sql);
		//transaction commit 실행
		conn.commit();
		
		//종료
		st.close();
		conn.close();
	}
}
