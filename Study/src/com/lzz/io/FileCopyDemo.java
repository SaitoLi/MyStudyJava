package com.lzz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
//123
public class FileCopyDemo {
	public static void main(String[] args) throws Exception{
		if(args.length != 2) { //��ʼ����������2λ
			System.out.println("����ִ�д���!");
			System.exit(1);//�����˳�
		}
		long start = System.currentTimeMillis();
		
		//���������ȷ�������ļ���֤
		File inFile = new File(args[0]);
		if(!inFile.exists()) {
			System.out.println("Դ�ļ������ڡ�");
			System.exit(1);
		}
		
		//��������ļ�������Ŀ¼�Ƿ����
		File outFile = new File(args[1]);
		if(!outFile.getParentFile().exists()) {  //���·��������
			outFile.getParentFile().mkdirs();  //����·��
		}
		
		//ʵ���ļ����ݵĿ���
		InputStream input = new FileInputStream(inFile);
		OutputStream output = new FileOutputStream(outFile);
		//ʵ���ļ�����
		int	temp = 0;  //����ÿ�δ�ȡ�����ݸ���
		byte data[] = new byte[1024];  //ÿ�ζ�ȥ1024���ֽ�
		
		//��ÿ�ζ�ȡ�����ݱ����ֽ�����������ض�ȡ�ĸ���
		while((temp = input.read(data)) != -1) {
			output.write(data, 0, temp);
		}
		output.flush();
		output.close();
		long end = System.currentTimeMillis();
		System.out.println("����������ʱ�䣺" + (end - start));
	}
}
