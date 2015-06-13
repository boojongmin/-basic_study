package com.school.step05;

public class OracleDatabaseImpl implements DatabaseInterface {

	@Override
	public void open() {
		System.out.println("오라클 Databse 열림");
	}

	@Override
	public void use() {
		System.out.println("오라클 Database 사용됨");
	}

	@Override
	public void close() {
		System.out.println("오라클 Database 닫힘");
	}
	

}
