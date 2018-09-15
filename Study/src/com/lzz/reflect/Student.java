package com.lzz.reflect;

public class Student {
	private String name;
	private int age;
	private String sex;
	private String phoneNum;
	public String grade;
	
	
	public Student() {
		System.out.println("无参构造方法调用");
	}
	
	public Student(String name , int age , String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		System.out.println("有参构造方法调用");
		System.out.println("name:"+ name+" age:" + age +" sex:"+ sex);
	}

	protected Student(int age) {
		this.age = age;
		System.out.println("受保护的构造方法调用");
		System.out.println("age:" + age);
	}
	
	private Student(String sex) {
		this.age = age;
		System.out.println("私有的构造方法（sex）调用");
		System.out.println("age:" + age);
	}
	
	private Student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("私有构造方法（name,age）调用");
		System.out.println("name:"+ name+" age:" + age);
	}
	
	 
	public String toString() {
		return "name : " + name + "  ,age : "+ age +" ,sex : " + sex 
				+ " ,phoneNum : "  + phoneNum + " ,grade : " + grade;
	}
}
