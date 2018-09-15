package com.lzz.proxy;

public class ProxyPeople {
	/*
	 *    静态代理模式
	 */
	private TruePlayer player;
	
	public ProxyPeople (TruePlayer player) {
		this.player = player;
	}
	
	public void attend() {
		System.out.println("安排时间,邀请演员");
		System.out.println("有档期");
		player.attend();
	}
	
	public void play() {
		System.out.println("出发");
		System.out.println("到达目的地");
		player.play();
		System.out.println("活动结束");
	}
}
