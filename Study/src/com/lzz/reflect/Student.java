package com.lzz.reflect;

public class Student {
	private String name;
	private int age;
	private String sex;
	private String phoneNum;
	public String grade;
	
	
	public Student() {
		System.out.println("�޲ι��췽������");
	}
	
	public Student(String name , int age , String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		System.out.println("�вι��췽������");
		System.out.println("name:"+ name+" age:" + age +" sex:"+ sex);
	}

	protected Student(int age) {
		this.age = age;
		System.out.println("�ܱ����Ĺ��췽������");
		System.out.println("age:" + age);
	}
	
	private Student(String sex) {
		this.age = age;
		System.out.println("˽�еĹ��췽����sex������");
		System.out.println("age:" + age);
	}
	
	private Student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("˽�й��췽����name,age������");
		System.out.println("name:"+ name+" age:" + age);
	}
	
	 
	public String toString() {
		return "name : " + name + "  ,age : "+ age +" ,sex : " + sex 
				+ " ,phoneNum : "  + phoneNum + " ,grade : " + grade;
	}
}
