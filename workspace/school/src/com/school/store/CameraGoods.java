package com.school.store;

public class CameraGoods extends Goods {
	public String brand;
	public boolean digitalCondtion;
	
	public CameraGoods(String name, int price, String brand, boolean digitalCondition){
		super( name, price );
		this.brand = brand;
		this.digitalCondtion = digitalCondition;
	}
	
}
