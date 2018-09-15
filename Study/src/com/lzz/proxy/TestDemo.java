package com.lzz.proxy;

public class TestDemo {
	public static void main(String[] args) {
		ProxyPeople proxyer = new ProxyPeople(new TruePlayer());
		proxyer.attend();
		proxyer.play();
	}
}
