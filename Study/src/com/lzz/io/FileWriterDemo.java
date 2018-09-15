package com.lzz.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {
	public static void main(String[] args) throws Exception {
File file = new File("f:" + File.separator + "demo" + File.separator + "test2.txt");
		
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		Writer out = new FileWriter(file);
		String str = "Hello World!";
		
		//Writer可以直接输出字符串（重点）
		out.write(str);
		out.close();
	}
}
