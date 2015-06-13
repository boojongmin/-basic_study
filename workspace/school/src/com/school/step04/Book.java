package com.school.step04;

import com.school.store.Goods;

public class Book extends Goods {
	String title;
	String author;
	int ISBN;
	
	public Book(String title, String author, int iSBN) {
		super("책", 1000);
		this.title = title;
		this.author = author;
		ISBN = iSBN;
	}

	public Book(){
		this("자바", "제임스고슬링", 1111);
	}

	public static void main(String[] args) {
		Book book = new Book();
	}

}
