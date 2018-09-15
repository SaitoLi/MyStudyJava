package com.lzz.observer;
/**
 * 观察者接口，微信公众号的读者
 * @author CunsiALIEN
 *
 */
public interface IObserver {
	/**
	 * 接收新的内容
	 * @param info
	 */
	public void reciveContent(String info);
}
