package com.lzz.observer;
/**
 * 微信公众号（观察者模式）示例
 * 被观察者的接口，所有公众号作者的共同属性
 * @author CunsiALIEN
 *
 */
public interface IWxServerSubject {
	//添加观察者
	public void attchObserver(IObserver iObserve);
	//移除观察者
	public void detachObserver(IObserver iObserver);
	//通知所有观察者
	public void notifyObserver();
}
