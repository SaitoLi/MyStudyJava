package com.lzz.reflect;

import java.lang.reflect.Field;

/*
 * ��ȡ��Ա���������ã�
 * 
 * 1.������
 * 		1).Field[] getFields():��ȡ���е�"�����ֶ�"
 * 		2).Field[] getDeclaredFields():��ȡ�����ֶΣ�������˽�С��ܱ�����Ĭ�ϡ����У�
 * 2.��ȡ�����ģ�
 * 		1).public Field getField(String fieldName):��ȡĳ��"���е�"�ֶΣ�
 * 		2).public Field getDeclaredField(String fieldName):��ȡĳ���ֶ�(������˽�е�)
 * 
 * 	 �����ֶε�ֵ��
 * 		Field --> public void set(Object obj,Object value):
 * 					����˵����
 * 					1.obj:Ҫ���õ��ֶ����ڵĶ���
 * 					2.value:ҪΪ�ֶ����õ�ֵ��
 * 
 */

public class Fields {
	public static void main(String[] args) throws Exception{
		
		//��ȡ����
		Class cla = Class.forName("com.lzz.reflect.Student");
		
		System.out.println("************��ȡ���й��е��ֶ�********************");
		Field[] fArray = cla.getFields();
		for(Field f : fArray){
			System.out.println(f);
		}
		
		System.out.println("************��ȡ�����ֶ�********************");
		fArray = cla.getDeclaredFields();
		for(Field f : fArray){
			System.out.println(f);
		}
		
		System.out.println("*************��ȡ�����ֶ�**������***********************************");
		Field f = cla.getField("grade");
		System.out.println(f);
		//��ȡһ������
		Object obj = cla.getConstructor().newInstance();//����Student����-->Student stu = new Student();
		//Ϊ�ֶ�����ֵ
		f.set(obj, "grade 4");//ΪStudent�����е�name���Ը�ֵ-->stu.grade = "grade 4"
		//��֤
		Student stu = (Student)obj;
		System.out.println("��֤grade��" + stu.grade);
		
		System.out.println("**************��ȡ˽���ֶ�****������********************************");
		
		f = cla.getDeclaredField("name");
		System.out.println(f);
		f.setAccessible(true);//�������䣬���˽���޶�
		f.set(obj, "����");
		f = cla.getDeclaredField("age");
		System.out.println(f);
		f.setAccessible(true);//�������䣬���˽���޶�
		f.set(obj, 16);
		f = cla.getDeclaredField("sex");
		System.out.println(f);
		f.setAccessible(true);//�������䣬���˽���޶�
		f.set(obj, "��");
		f = cla.getDeclaredField("phoneNum");
		System.out.println(f);
		f.setAccessible(true);//�������䣬���˽���޶�
		f.set(obj, "188 8888 8888");
		System.out.println("��֤��" + stu);
	}
}	
