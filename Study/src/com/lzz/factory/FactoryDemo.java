package com.lzz.factory;

public class FactoryDemo {
	public static Fruit getInstance(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		/*
		 * �������ʵ�ֹ���ģʽ��
		 *    ʹ��Java������ƽ���ͣ���Ҫ��
		 *    ���������µĽӿ�ʵ���Ժ���Ҫ�޸Ĺ��������ݵ�����
		 */
		Fruit f = null;
		f = (Fruit) Class.forName(className).newInstance(); //������ƻ�ȡ����������ʵ��
		return f;
	}
}
