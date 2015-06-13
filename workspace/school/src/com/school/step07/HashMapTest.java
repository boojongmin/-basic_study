package com.school.step07;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		System.out.println("key(apple) : " + dic.get("apple"));
		
		dic.put("baby", "¾Æ±â"); // "baby"´Â key, "¾Æ±â"Àº value
		dic.put("love", "»ç¶û"); 
		dic.put("apple", "»ç°ú");
		
		System.out.println("key(apple) : " + dic.get("apple"));
		System.out.println("key(nokey) : " + dic.get("nokey"));
		
		
		Map<String, UserVo> userMap = new HashMap();
		UserVo user1 = new UserVo("ºÎÁ¾¹Î", 0, "¼ö¿ø....");
		UserVo user2 = new UserVo("ºÎÁ¾¹Î1", 10, "¼­¿ï....");
		UserVo user3 = new UserVo("ºÎÁ¾¹Î2", 20, "Á¦ÁÖ....");
		
		userMap.put("ºÎÁ¾¹Î", user1);
		userMap.put("ºÎÁ¾¹Î1", user2);
		userMap.put("ºÎÁ¾¹Î2", user3);
		
		System.out.println(userMap.get("ºÎÁ¾¹Î1"));
		System.out.println(userMap.get("ºÎÁ¾¹Î4"));
		
		
		
		
	}
}


