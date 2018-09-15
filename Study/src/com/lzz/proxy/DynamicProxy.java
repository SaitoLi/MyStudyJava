package com.lzz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  1��ÿһ����̬�����඼����Ҫʵ��InvocationHandler����ӿڣ�����ÿ���������ʵ������������һ��handler��
 *   ���Ե�����ͨ������������һ��������ʱ����������ĵ��þͻᱻת��Ϊ��InvocationHandler����ӿڵ� invoke���������е��á�
 *   ���ڻ��ڿ���
 *  InvocationHandler����ӿڵ�Ψһһ������ invoke ������
 * 	  	Object invoke(Object proxy, Method method, Object[] args) throws Throwable
 *    	���ǿ����������һ������������������ô�����������ֱ����
 * 	  
 *  Object invoke(Object proxy, Method method, Object[] args) throws Throwable
 * 	1) proxy:ָ��������������Ǹ���ʵ����
 *  2) method:ָ������������Ҫ������ʵ�����ĳ��������Method����
 *  3) args:ָ�����ǵ�����ʵ����ĳ������ʱ���ܵĲ���
 * 
 */
public class DynamicProxy implements InvocationHandler {
	// �����������Ҫ�������ʵ����
	private Player player;

	public DynamicProxy(Player player) {
		this.player = player;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("attend".equals(method.getName())) {
			System.out.println("ȷ���г�");
			System.out.println("Method:" + method);
			// ��������������ʵ����ķ���ʱ������Զ�����ת��������������handler�����invoke���������е���
			method.invoke(player, args);
			System.out.println("׼�����");
			System.out.println("==============================");
		} else {
			System.out.println("�ݳ�֮ǰ");
			System.out.println("Method:" + method);
			method.invoke(player, args);
			System.out.println("�ݳ�����");
		}
		return null;
	}
}
