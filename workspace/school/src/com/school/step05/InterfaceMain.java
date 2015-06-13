package com.school.step05;

public class InterfaceMain {
	public static void main(String[] args) {
		DatabaseInterface db = null;
		if("mssql".equals(args[0])){
			db = new MssqlDatabaseImpl();
		}else if("oracle".equals(args[0])){
			db = new OracleDatabaseImpl();
		}
		
		db.open();
		db.use();
		db.close();
	}
}
