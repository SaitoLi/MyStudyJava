package com.lzz.proxy;

public class ProxyPeople {
	/*
	 *    ��̬����ģʽ
	 */
	private TruePlayer player;
	
	public ProxyPeople (TruePlayer player) {
		this.player = player;
	}
	
	public void attend() {
		System.out.println("����ʱ��,������Ա");
		System.out.println("�е���");
		player.attend();
	}
	
	public void play() {
		System.out.println("����");
		System.out.println("����Ŀ�ĵ�");
		player.play();
		System.out.println("�����");
	}
}
