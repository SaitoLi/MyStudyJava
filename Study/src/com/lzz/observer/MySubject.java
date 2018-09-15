package com.lzz.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * һ������Ĺ��ںţ����۲��ߣ�MySubject �����������ж��ߵ��б���Ϣobservers �Լ��·���������newContent
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
			System.out.println("�µĹ�ע��" + ((ReaderObserver)iObserver).getName());
		}
		else {
			System.out.println("�û�" + ((ReaderObserver)iObserver).getName() + "�ѹ�ע���ں�");
		}
	}

	@Override
	public void detachObserver(IObserver iObserver) {
		if (observers.contains(iObserver)) {
			observers.remove(iObserver);
			System.out.println("�û�" + ((ReaderObserver)iObserver).getName() + "��ȡ����ע");
		}else {
			System.out.println("�û�" + ((ReaderObserver)iObserver).getName() + "û�й�ע���ں�");
		}
	}

	@Override
	public void notifyObserver() {
		for(IObserver iObserver : observers) {
			iObserver.reciveContent(newContent);
		}
	}
	
	/**
	 * ���ںŷ����µ�����
	 */
	public void submitContent(String newContent) {
		this.newContent = newContent;
		this.notifyObserver();
	}
}
