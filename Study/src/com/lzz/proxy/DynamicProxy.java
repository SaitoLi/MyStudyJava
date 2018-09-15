package com.lzz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  1、每一个动态代理类都必须要实现InvocationHandler这个接口，并且每个代理类的实例都关联到了一个handler，
 *   语言当我们通过代理对象调用一个方法的时候，这个方法的调用就会被转发为由InvocationHandler这个接口的 invoke方法来进行调用。
 *   进口环节考核
 *  InvocationHandler这个接口的唯一一个方法 invoke 方法：
 * 	  	Object invoke(Object proxy, Method method, Object[] args) throws Throwable
 *    	我们看到这个方法一共接受三个参数，那么这三个参数分别代表：
 * 	  
 *  Object invoke(Object proxy, Method method, Object[] args) throws Throwable
 * 	1) proxy:指代我们所代理的那个真实对象
 *  2) method:指代的是我们所要调用真实对象的某个方法的Method对象
 *  3) args:指代的是调用真实对象某个方法时接受的参数
 * 
 */
public class DynamicProxy implements InvocationHandler {
	// 这个就是我们要代理的真实对象
	private Player player;

	public DynamicProxy(Player player) {
		this.player = player;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if ("attend".equals(method.getName())) {
			System.out.println("确定行程");
			System.out.println("Method:" + method);
			// 当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
			method.invoke(player, args);
			System.out.println("准备完毕");
			System.out.println("==============================");
		} else {
			System.out.println("演出之前");
			System.out.println("Method:" + method);
			method.invoke(player, args);
			System.out.println("演出结束");
		}
		return null;
	}
}
