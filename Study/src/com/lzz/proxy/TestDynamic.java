package com.lzz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 *  1��public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, 
 *  			InvocationHandler h) throws IllegalArgumentException
 *  
 *	loader:һ��ClassLoader���󣬶��������ĸ�ClassLoader�����������ɵĴ��������м���
 *
 *  interfaces:һ��Interface��������飬��ʾ�����ҽ�Ҫ������Ҫ����Ķ����ṩһ��ʲô�ӿڣ�
 *  			������ṩ��һ��ӿڸ�������ô���������������ʵ���˸ýӿ�(��̬)�������Ҿ��ܵ�������ӿ��еķ�����
 *  
 *  h:һ��InvocationHandler���󣬱�ʾ���ǵ��������̬��������ڵ��÷�����ʱ�򣬻��������һ��InvocationHandler������
 * 
 *
 */
public class TestDynamic {
	public static void main(String[] args) {
		//����Ҫ�������ʵ����
		Player trueplayer = new TruePlayer();
		//����ʵ������handler��ͨ����ʵ�����������䷽��
		InvocationHandler handler = new DynamicProxy(trueplayer);
		/*
         * 	ͨ��Proxy��newProxyInstance�������������ǵĴ��������������������������
         * 	��һ������ handler.getClass().getClassLoader() ����������ʹ��handler������ClassLoader�������������ǵĴ������
         * 	�ڶ�������realSubject.getClass().getInterfaces()����������Ϊ��������ṩ�Ľӿ�����ʵ������ʵ�еĽӿڣ���ʾ��Ҫ������Ǹ���ʵ���������Ҿ��ܵ�������ӿ��еķ�����
         * 	����������handler�� �������ｫ������������������Ϸ��� InvocationHandler ���������
         */
		
		Player player = (Player) Proxy.newProxyInstance(handler.getClass().getClassLoader()
				, trueplayer.getClass().getInterfaces()	, handler);
		System.out.println(player.getClass().getName());
		player.attend();
		player.play();
	}
}
