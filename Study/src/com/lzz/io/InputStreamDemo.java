package com.lzz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class InputStreamDemo {
	public static void main(String[] args) throws Exception {
		File file = new File("f:" + File.separator + "demo" + File.separator + "test.txt");

		if (file.exists()) {
			InputStream input = new FileInputStream(file);

			byte[] data = new byte[1024];
			int foot = 0;  //字节数组的操作脚标
			int temp = 0;  //接收每次读取的字节数据
			while ((temp = input.read()) != -1) {
				data[foot++] = (byte) temp;
			}

			input.close();
			System.out.println("“" + new String(data,0,foot) + "”");
		}

	}
}
