package com.lzz.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class ToByteArray {
	public static void main(String[] args) throws Exception{
		File fileA = new File("f:" + File.separator + "demo" + File.separator + "test.txt");
		File fileB = new File("f:" + File.separator + "demo" + File.separator + "test2.txt");

		InputStream inputA = new FileInputStream(fileA);
		InputStream inputB = new FileInputStream(fileB);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		int temp = 0;
		while ((temp = inputA.read()) != -1) {
			output.write(temp);
		}
		while ((temp = inputB.read()) != -1) {
			output.write(temp);
		}
		
		//将所有的内容都保存到内存输入流里，显示效果是两个文件的内容进行了合并
		byte[] data = output.toByteArray();
		
		output.close();
		inputA.close();
		inputB.close();
		System.out.println(new String(data));
	}
}
