package com.lzz.jdbc;

public class TestCon {
	public static void main(String[] args) throws Exception {
		JDBCDemo demo = new JDBCDemo();
		if(demo.getConnection() != null) {
			System.out.println("���ӳɹ�");
		}
		else {
			System.out.println("����ʧ��");
		}
		demo.close();
	}
}
