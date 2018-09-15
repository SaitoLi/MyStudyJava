package com.lzz.factory;

public class FactoryDemo {
	public static Fruit getInstance(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*
		 * 反射机制实现工厂模式：
		 *    使用Java反射机制解耦和（重要）
		 *    解决了添加新的接口实现以后需要修改工厂中内容的问题
		 */
		Fruit f = null;
		f = (Fruit) Class.forName(className).newInstance(); //反射机制获取类名并创建实例
		return f;
	}
}
