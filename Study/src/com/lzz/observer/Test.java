package com.lzz.observer;
/**
 * 测试类，测试观察者模式下，是否实现了微信公众号发布消息提醒功能
 * @author CunsiALIEN
 *
 */
public class Test {

	public static void main(String[] args) {
		IWxServerSubject iWxServerSubject = new MySubject();
		//创建用户（观察者）
		ReaderObserver reader1 = new ReaderObserver("READER1");
		ReaderObserver reader2 = new ReaderObserver("READER2");
		ReaderObserver reader3 = new ReaderObserver("READER3");
		ReaderObserver reader4 = new ReaderObserver("READER4");
		//用户订阅公众号
		iWxServerSubject.attchObserver(reader1);
		iWxServerSubject.attchObserver(reader2);
		iWxServerSubject.attchObserver(reader3);
		//公众号（被观察者）发布新的内容
		((MySubject)iWxServerSubject).submitContent("观察者模式测试");
		//其他测试
		iWxServerSubject.detachObserver(reader2);
		iWxServerSubject.detachObserver(reader4);
		iWxServerSubject.attchObserver(reader4);
		iWxServerSubject.attchObserver(reader1);
		((MySubject)iWxServerSubject).submitContent("观察者模式测试");
	}

}
