package com.lzz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
/**
 *  1、public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, 
 *  			InvocationHandler h) throws IllegalArgumentException
 *  
 *	loader:一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
 *
 *  interfaces:一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，
 *  			如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
 *  
 *  h:一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
 * 
 *
 */
public class TestDynamic {
	public static void main(String[] args) {
		//创建要代理的真实对象
		Player trueplayer = new TruePlayer();
		//把真实对象传入handler，通过真实对象来调用其方法
		InvocationHandler handler = new DynamicProxy(trueplayer);
		/*
         * 	通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 	第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
         * 	第二个参数realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 	第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */
		
		Player player = (Player) Proxy.newProxyInstance(handler.getClass().getClassLoader()
				, trueplayer.getClass().getInterfaces()	, handler);
		System.out.println(player.getClass().getName());
		player.attend();
		player.play();
	}
}
