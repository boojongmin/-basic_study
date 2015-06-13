package com.school.step17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCSelect {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//사용할 driver 선택
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://192.168.0.19:3306/chatting";
		String userid = "student";
		String password = "1234";
		//연결
		Connection conn = DriverManager.getConnection(url, userid, password);		
		//사용
		String sql = "select uid, userid, message from chatting where userid = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "boojongmin");
		
		ResultSet rs = pstmt.executeQuery();
		
		List<Map> list = new ArrayList<>();
		
		while(rs.next()){
			Map<String, Object> map = new HashMap<>();
			map.put("uid", rs.getInt("uid"));
			map.put("userid", rs.getString("userid"));
			map.put("message", rs.getString("message"));
			list.add(map);
			
//			int uid = rs.getInt("uid");
//			String clientid = rs.getString("userid");
//			String message = rs.getString("message");
			
//			String mf = String.format("%d > userid : %s > message : %s ", uid, clientid, message);
//			System.out.println(mf);
		}
		
		for(Map<String, Object> map : list){
			String mf = String.format("%d > userid : %s > message : %s ", 
										map.get("uid"), 
										map.get("userid"), 
										map.get("message"));
			System.out.println(mf);
		}
		
		//종료
		rs.close();
		pstmt.close();
		
		conn.close();
	}
}
