package com.lzz.observer;
/**
 * ΢�Ź��ںţ��۲���ģʽ��ʾ��
 * ���۲��ߵĽӿڣ����й��ں����ߵĹ�ͬ����
 * @author CunsiALIEN
 *
 */
public interface IWxServerSubject {
	//��ӹ۲���
	public void attchObserver(IObserver iObserve);
	//�Ƴ��۲���
	public void detachObserver(IObserver iObserver);
	//֪ͨ���й۲���
	public void notifyObserver();
}
