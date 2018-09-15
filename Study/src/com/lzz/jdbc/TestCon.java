package com.lzz.jdbc;

public class TestCon {
	public static void main(String[] args) throws Exception {
		JDBCDemo demo = new JDBCDemo();
		if(demo.getConnection() != null) {
			System.out.println("连接成功");
		}
		else {
			System.out.println("连接失败");
		}
		demo.close();
	}
}
