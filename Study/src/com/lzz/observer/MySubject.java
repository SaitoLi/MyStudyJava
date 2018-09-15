package com.lzz.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * 一个具体的公众号（被观察者）MySubject 里面存放着所有读者的列表信息observers 以及新发布的内容newContent
 * 
 * @author CunsiALIEN
 *
 */
public class MySubject implements IWxServerSubject {
	private List<IObserver> observers = new ArrayList<>();
	private String newContent;

	@Override
	public void attchObserver(IObserver iObserver) {
		if (!observers.contains(iObserver)) {
			observers.add(iObserver);
			System.out.println("新的关注：" + ((ReaderObserver)iObserver).getName());
		}
		else {
			System.out.println("用户" + ((ReaderObserver)iObserver).getName() + "已关注公众号");
		}
	}

	@Override
	public void detachObserver(IObserver iObserver) {
		if (observers.contains(iObserver)) {
			observers.remove(iObserver);
			System.out.println("用户" + ((ReaderObserver)iObserver).getName() + "已取消关注");
		}else {
			System.out.println("用户" + ((ReaderObserver)iObserver).getName() + "没有关注公众号");
		}
	}

	@Override
	public void notifyObserver() {
		for(IObserver iObserver : observers) {
			iObserver.reciveContent(newContent);
		}
	}
	
	/**
	 * 公众号发布新的内容
	 */
	public void submitContent(String newContent) {
		this.newContent = newContent;
		this.notifyObserver();
	}
}
