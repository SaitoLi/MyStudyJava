package com.lzz.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class LowToUpper {
	public static void main(String[] args) throws Exception{
		String str = "Hello World!!";
		//通过内存操作流实现大小写转换，先将数据保存在内存流里面，再从里面取出每一个数据
		
		//将所有要读取的数据设置到内存输入流里面，利用向上转型
		InputStream input = new ByteArrayInputStream(str.getBytes());
		//为了能够将所有的内存流数据取出，可以使用ByteArrayOutputStream
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
