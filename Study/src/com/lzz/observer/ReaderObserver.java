package com.lzz.observer;
/**
 * һ����ͨ�û����۲��ߣ�
 * @author CunsiALIEN
 *
 */
public class ReaderObserver implements IObserver{
	private String name;  //�û�����
	public ReaderObserver(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public void reciveContent(String info) {
		System.out.println("�𾴵�" + this.name + "������ע�Ĺ��ںŷ������µ����ݣ�" +  info);
	} 
}
