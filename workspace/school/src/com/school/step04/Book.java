package com.school.step04;

import com.school.store.Goods;

public class Book extends Goods {
	String title;
	String author;
	int ISBN;
	
	public Book(String title, String author, int iSBN) {
		super("å", 1000);
		this.title = title;
		this.author = author;
		ISBN = iSBN;
	}

	public Book(){
		this("�ڹ�", "���ӽ�����", 1111);
	}

	public static void main(String[] args) {
		Book book = new Book();
	}

}
