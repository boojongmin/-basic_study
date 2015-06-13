package com.school.step07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ArrayListTest {
	public static void main(String[] args) {
		
		List list = new ArrayList<String>();
		
		System.out.println("add 전 : " + list.size() + "\tisEmpty : " + list.isEmpty());
		list.add("1");
		list.add("2");
		list.add("2");
		Object t1 = new Object();
		list.add(t1);
		System.out.println("add 후 : " +list.size() + "\tisEmpty : " + list.isEmpty());
		System.out.println(list.get(0));
		
//		int resultValue = 0;
//		for(int i=0; i < list.size(); i++){
//			resultValue += Integer.parseInt(list.get(i));
//		}		
//		System.out.println("결과값 : " + resultValue);
//		
//		Iterator<String> iterator = list.iterator();
//		
//		resultValue = 0;
//		while(iterator.hasNext()) {
//			String val = iterator.next();
//			resultValue += Integer.parseInt(val);
//		}
//		System.out.println("iterator 결과값 : " + resultValue);
//		
//		resultValue = 0;
		//foreach
//		for(String val : list){
//			resultValue += Integer.parseInt(val);
//		}
//		System.out.println("foreach 결과값 : " + resultValue);
//		
		
		boolean contains = list.contains(new String("2"));
		System.out.println("contains : " + contains);
		
		
		contains = list.contains(new Object());
		System.out.println("contains 2: " + contains);
		
		
		
		
		list.remove(1);
		System.out.println("엘리먼트 갯수 : " + list.size());
		
		list.clear();
		System.out.println("clear() 후 엘리먼트 갯수 : " + list.size());
		System.out.println("clear() 후 isEmpty() : " + list.isEmpty());
		
		
		
//		list.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String val) {
//				System.out.println("lambda : " + val);
//			}
//		});
		
//		list.stream().filter( String)x -> {x.equals("2");}).collect(Collectors.toList());
		
		
		
		
		
		
	}
}
