package com.school.step05;

public class OracleDatabaseImpl implements DatabaseInterface {

	@Override
	public void open() {
		System.out.println("����Ŭ Databse ����");
	}

	@Override
	public void use() {
		System.out.println("����Ŭ Database ����");
	}

	@Override
	public void close() {
		System.out.println("����Ŭ Database ����");
	}
	

}
