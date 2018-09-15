package com.lzz.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		Fruit f = null;
		try {
			f = FactoryDemo.getInstance("com.lzz.factory.Banana");  //直接产生对应类的对象
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		f.eat();
	}
}
