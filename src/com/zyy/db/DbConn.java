package com.zyy.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConn {
	public static Connection getConn(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stutest", "root", "admin");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}