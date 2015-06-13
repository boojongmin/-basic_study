package com.school.step06;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.chrono.JapaneseEra;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class WraperTest {
	public static void main(String[] args) {
//		String number = "100";
//		Integer intObject = new Integer(number);
//		System.out.println(intObject.intValue());
//		
////		int intValue = Integer.parseInt(number + "a");
////		System.out.println( intValue );
//		
//		String str1 = new String("test1");
//		String str2 = new String("test2");
//		System.out.println(str1.equals(str2));
//		
//		String param = "����=������&����=��&����=����";
//		String[] paramArray = param.split("&");
//		
//		for(String str : paramArray){
//			String key = str.split("=")[0];
//			String value = str.split("=")[1];
//			if(key != null && key.equals("����")){
//				System.out.println("���� : " + value);
//			}
//			if("����".equals(key)){
//				System.out.println("���� : " + value);
//			}
//		}
//		
//		Date date = new Date(900000000000L);
//		System.out.println(date);
//		
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.get(Calendar.MONTH ) + 1);
//		
		
		
		Calendar now = Calendar.getInstance();
		 
	    Calendar firstDate = Calendar.getInstance();
	    firstDate.clear();
		// 2012�� 12�� 25��. 12���� ǥ���ϱ� ���� month�� 11�� ����
	    firstDate.set(2012, 11, 25); 
	    firstDate.set(Calendar.HOUR_OF_DAY, 20); // ���� 8��
	    firstDate.set(Calendar.MINUTE, 30); // 30��
	    
	    int year = firstDate.get(Calendar.YEAR);
	    int month = firstDate.get(Calendar.MONTH)  + 1;
	    int day = firstDate.get(Calendar.DATE);
	    System.out.println(year + "-" + month + "-" + day);
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		Date nowDate = new Date();
		System.out.println( nowDate  );
		System.out.println( sdf.format(nowDate)  );
		
		System.out.println(new Date(0));
		ZoneId.getAvailableZoneIds().forEach(x -> System.out.println(x));
		
		System.out.println(LocalDateTime.ofInstant(nowDate.toInstant(), ZoneId.of("Egypt")));
		
	}
}