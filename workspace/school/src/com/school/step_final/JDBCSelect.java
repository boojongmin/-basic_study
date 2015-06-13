package com.school.step_final;

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
	
	public Object[][]  selectChatLog() throws ClassNotFoundException, SQLException {
		//사용할 driver 선택
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://192.168.0.19:3306/chatting";
		String userid = "student";
		String password = "1234";
		//연결
		Connection conn = DriverManager.getConnection(url, userid, password);		
		//사용
		String sql = "select uid, userid, message from chatting";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		List<Map> list = new ArrayList<>();
		
		while(rs.next()){
			Map<String, Object> map = new HashMap<>();
			map.put("uid", rs.getInt("uid"));
			map.put("userid", rs.getString("userid"));
			map.put("message", rs.getString("message"));
			list.add(map);
		}
		
		//종료
		rs.close();
		pstmt.close();
		
		conn.close();
		
		
		Object[][] result = new Object[list.size()][3];
		
		for(int i=0; i< list.size(); i ++){
			Map<String, Object> map = list.get(i);
			result[i][0] = map.get("uid");
			result[i][1] = map.get("userid");
			result[i][2] = map.get("message");
		}
		
		
		return result;
	}
}
