package com.school.step05;

public class MssqlDatabaseImpl implements DatabaseInterface {

	@Override
	public void open() {
		System.out.println("MsSql Databse ����");
	}

	@Override
	public void use() {
		System.out.println("MsSql Database ����");
	}

	@Override
	public void close() {
		System.out.println("MsSql Database ����");
	}
	

}
