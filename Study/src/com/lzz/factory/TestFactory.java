package com.lzz.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		Fruit f = null;
		try {
			f = FactoryDemo.getInstance("com.lzz.factory.Banana");  //ֱ�Ӳ�����Ӧ��Ķ���
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		f.eat();
	}
}
