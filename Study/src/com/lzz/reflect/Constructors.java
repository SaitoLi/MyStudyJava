package com.lzz.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * ͨ��Class������Ի�ȡĳ�����еģ����췽������Ա��������Ա�����������ʳ�Ա��
 * 
 * 1.��ȡ���췽����
 * 		1).�����ķ�����
 * 			public Constructor[] getConstructors()������"���е�"���췽��
            public Constructor[] getDeclaredConstructors()����ȡ���еĹ��췽��(����˽�С��ܱ�����Ĭ�ϡ�����)
     
 * 		2).��ȡ�����ķ����������ã�
 * 			public Constructor getConstructor(Class... parameterTypes):��ȡ������"���е�"���췽����
 * 			public Constructor getDeclaredConstructor(Class... parameterTypes):��ȡ"ĳ�����췽��"������˽�еģ����ܱ�����Ĭ�ϡ����У�
 * 		
 * 			���ù��췽����
 * 			Constructor-->newInstance(Object... initargs)
 */

public class Constructors {
	public static void main(String[] args) throws Exception{

		//��ȡ����
		Class cla = Class.forName("com.lzz.reflect.Student");

		System.out.println("============���й��й��췽��===============");
		Constructor[] conArray = cla.getConstructors();
		for (Constructor c : conArray) {
			System.out.println(c);
		}

		System.out.println("============���й��췽��===============");
		conArray = cla.getDeclaredConstructors();
		for (Constructor c : conArray) {
			System.out.println(c);
		}

		System.out.println("============���е��޲ι��췽��===============");
		Constructor con = cla.getConstructor();
		System.out.println("con = " + con);
		Object obj = con.newInstance();

		System.out.println("============˽�й��췽��===============");
		con = cla.getDeclaredConstructor(String.class,int.class);
		System.out.println(con);
		con.setAccessible(true);  //�������ʣ����Է������η���
		obj = con.newInstance("����",16);
	}
}
