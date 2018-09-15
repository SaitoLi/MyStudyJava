package com.lzz.io;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo {
	public static void main(String[] args) throws Exception{
		File file = new File("f:" + File.separator + "demo" + File.separator + "test2.txt");
	
		if (file.exists()) {
			Reader input = new FileReader(file);
			
			char[] data = new char[1024];
			int len = input.read(data);
			System.out.println(new String(data ,0 ,len));
		}
	}
}
