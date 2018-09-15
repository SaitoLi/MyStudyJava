package com.lzz.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class LowToUpper {
	public static void main(String[] args) throws Exception{
		String str = "Hello World!!";
		//ͨ���ڴ������ʵ�ִ�Сдת�����Ƚ����ݱ������ڴ������棬�ٴ�����ȡ��ÿһ������
		
		//������Ҫ��ȡ���������õ��ڴ����������棬��������ת��
		InputStream input = new ByteArrayInputStream(str.getBytes());
		//Ϊ���ܹ������е��ڴ�������ȡ��������ʹ��ByteArrayOutputStream
		OutputStream out = new ByteArrayOutputStream();
		
		int temp = 0;
		while((temp = input.read()) != -1) {
			out.write(Character.toUpperCase(temp));
		}
		
		System.out.println(out);
		input.close();
		out.close();
	}
}
