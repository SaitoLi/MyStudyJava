package com.lzz.reflect;

import java.lang.reflect.Field;

/*
 * 获取成员变量并调用：
 * 
 * 1.批量的
 * 		1).Field[] getFields():获取所有的"公有字段"
 * 		2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有；
 * 2.获取单个的：
 * 		1).public Field getField(String fieldName):获取某个"公有的"字段；
 * 		2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
 * 
 * 	 设置字段的值：
 * 		Field --> public void set(Object obj,Object value):
 * 					参数说明：
 * 					1.obj:要设置的字段所在的对象；
 * 					2.value:要为字段设置的值；
 * 
 */

public class Fields {
	public static void main(String[] args) throws Exception{
		
		//获取对象
		Class cla = Class.forName("com.lzz.reflect.Student");
		
		System.out.println("************获取所有公有的字段********************");
		Field[] fArray = cla.getFields();
		for(Field f : fArray){
			System.out.println(f);
		}
		
		System.out.println("************获取所有字段********************");
		fArray = cla.getDeclaredFields();
		for(Field f : fArray){
			System.out.println(f);
		}
		
		System.out.println("*************获取公有字段**并调用***********************************");
		Field f = cla.getField("grade");
		System.out.println(f);
		//获取一个对象
		Object obj = cla.getConstructor().newInstance();//产生Student对象-->Student stu = new Student();
		//为字段设置值
		f.set(obj, "grade 4");//为Student对象中的name属性赋值-->stu.grade = "grade 4"
		//验证
		Student stu = (Student)obj;
		System.out.println("验证grade：" + stu.grade);
		
		System.out.println("**************获取私有字段****并调用********************************");
		
		f = cla.getDeclaredField("name");
		System.out.println(f);
		f.setAccessible(true);//暴力反射，解除私有限定
		f.set(obj, "张三");
		f = cla.getDeclaredField("age");
		System.out.println(f);
		f.setAccessible(true);//暴力反射，解除私有限定
		f.set(obj, 16);
		f = cla.getDeclaredField("sex");
		System.out.println(f);
		f.setAccessible(true);//暴力反射，解除私有限定
		f.set(obj, "男");
		f = cla.getDeclaredField("phoneNum");
		System.out.println(f);
		f.setAccessible(true);//暴力反射，解除私有限定
		f.set(obj, "188 8888 8888");
		System.out.println("验证：" + stu);
	}
}	
