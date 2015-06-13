package com.school.step07;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		System.out.println("key(apple) : " + dic.get("apple"));
		
		dic.put("baby", "�Ʊ�"); // "baby"�� key, "�Ʊ�"�� value
		dic.put("love", "���"); 
		dic.put("apple", "���");
		
		System.out.println("key(apple) : " + dic.get("apple"));
		System.out.println("key(nokey) : " + dic.get("nokey"));
		
		
		Map<String, UserVo> userMap = new HashMap();
		UserVo user1 = new UserVo("������", 0, "����....");
		UserVo user2 = new UserVo("������1", 10, "����....");
		UserVo user3 = new UserVo("������2", 20, "����....");
		
		userMap.put("������", user1);
		userMap.put("������1", user2);
		userMap.put("������2", user3);
		
		System.out.println(userMap.get("������1"));
		System.out.println(userMap.get("������4"));
		
		
		
		
	}
}


