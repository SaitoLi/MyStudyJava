package com.lzz.observer;
/**
 * 一个普通用户（观察者）
 * @author CunsiALIEN
 *
 */
public class ReaderObserver implements IObserver{
	private String name;  //用户姓名
	public ReaderObserver(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public void reciveContent(String info) {
		System.out.println("尊敬的" + this.name + "，您关注的公众号发布了新的内容：" +  info);
	} 
}
