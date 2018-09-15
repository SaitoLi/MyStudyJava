package com.lzz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {
	private Connection con;
	private String className = "com.mysql.jdbc.Driver";
	
	private String name = "root";
	private String password = "root";
	private String url = "jdbc:mysql://localhost:3306/myustb";
	
	public Connection getConnection() throws Exception {
		Class.forName(className);
		con = DriverManager.getConnection(url, name, password);
		return con;
	}
	
	public void close() throws Exception {
		if(con != null) {
			con.close();
			System.out.println("�����ѹر�");
		}else {
			System.out.println("���ݿ�δ���ӣ����Ȼ�ȡ����");
		}
	}
}
