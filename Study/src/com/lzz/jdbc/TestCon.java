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
//			System.out.println("���ӳɹ�");
//		}
//		else {
//			System.out.println("����ʧ��");
//		}
		long end = System.currentTimeMillis();
		System.out.println("��ʱ��" + (end - start));
		demo1.close();
		demo2.close();
		demo3.close();
		demo4.close();
	}
}
