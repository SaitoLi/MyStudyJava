package com.lzz.observer;
/**
 * �����࣬���Թ۲���ģʽ�£��Ƿ�ʵ����΢�Ź��ںŷ�����Ϣ���ѹ���
 * @author CunsiALIEN
 *
 */
public class Test {

	public static void main(String[] args) {
		IWxServerSubject iWxServerSubject = new MySubject();
		//�����û����۲��ߣ�
		ReaderObserver reader1 = new ReaderObserver("READER1");
		ReaderObserver reader2 = new ReaderObserver("READER2");
		ReaderObserver reader3 = new ReaderObserver("READER3");
		ReaderObserver reader4 = new ReaderObserver("READER4");
		//�û����Ĺ��ں�
		iWxServerSubject.attchObserver(reader1);
		iWxServerSubject.attchObserver(reader2);
		iWxServerSubject.attchObserver(reader3);
		//���ںţ����۲��ߣ������µ�����
		((MySubject)iWxServerSubject).submitContent("�۲���ģʽ����");
		//��������
		iWxServerSubject.detachObserver(reader2);
		iWxServerSubject.detachObserver(reader4);
		iWxServerSubject.attchObserver(reader4);
		iWxServerSubject.attchObserver(reader1);
		((MySubject)iWxServerSubject).submitContent("�۲���ģʽ����");
	}

}
