package com.lzz.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员；
 * 
 * 1.获取构造方法：
 * 		1).批量的方法：
 * 			public Constructor[] getConstructors()：所有"公有的"构造方法
            public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有)
     
 * 		2).获取单个的方法，并调用：
 * 			public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法：
 * 			public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有；
 * 		
 * 			调用构造方法：
 * 			Constructor-->newInstance(Object... initargs)
 */

public class Constructors {
	public static void main(String[] args) throws Exception{

		//获取对象
		Class cla = Class.forName("com.lzz.reflect.Student");

		System.out.println("============所有共有构造方法===============");
		Constructor[] conArray = cla.getConstructors();
		for (Constructor c : conArray) {
			System.out.println(c);
		}

		System.out.println("============所有构造方法===============");
		conArray = cla.getDeclaredConstructors();
		for (Constructor c : conArray) {
			System.out.println(c);
		}

		System.out.println("============公有的无参构造方法===============");
		Constructor con = cla.getConstructor();
		System.out.println("con = " + con);
		Object obj = con.newInstance();

		System.out.println("============私有构造方法===============");
		con = cla.getDeclaredConstructor(String.class,int.class);
		System.out.println(con);
		con.setAccessible(true);  //暴力访问（忽略访问修饰符）
		obj = con.newInstance("张三",16);
	}
}
