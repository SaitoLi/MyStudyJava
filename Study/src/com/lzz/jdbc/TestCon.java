package com.lzz.jdbc;

public class TestCon {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		JDBCDemo demo1 = new JDBCDemo();
		JDBCDemo demo2 = new JDBCDemo();
		JDBCDemo demo3 = new JDBCDemo();
		JDBCDemo demo4 = new JDBCDemo();
		
		demo1.getConnection();
		demo2.getConnection();
		demo3.getConnection();
		demo4.getConnection();
//		if(demo.getConnection() != null) {
//			System.out.println("连接成功");
//		}
//		else {
//			System.out.println("连接失败");
//		}
		long end = System.currentTimeMillis();
		System.out.println("用时：" + (end - start));
		demo1.close();
		demo2.close();
		demo3.close();
		demo4.close();
	}
}
