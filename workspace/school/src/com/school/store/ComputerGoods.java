package com.school.store;

public class ComputerGoods extends Goods {
	public String os;
	public boolean notebookCondtion;
	
	public ComputerGoods(String name, int price, String os, boolean notebookCondition){
		super(name, price);
		this.os = os;
		this.notebookCondtion = notebookCondition;
	}
	

}
