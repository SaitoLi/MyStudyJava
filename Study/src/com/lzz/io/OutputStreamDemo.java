package com.lzz.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void main(String[] args) throws Exception{
		File file = new File("f:" + File.separator + "demo" + File.separator + "test.txt");
		
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		
		OutputStream output = new FileOutputStream(file,true);
		String str = "HAHAHAHAHAHAHAHAHA!\r\n";
		byte[] data = str.getBytes();
		
		//����һ
//		output.write(data);
		
		//������
//		for(int i = 0; i < data.length ; i++) {
//			output.write(data[i]);
//		}
		
		//������
		output.write(data , 5 , 8);
		
		output.close();
	}
}
