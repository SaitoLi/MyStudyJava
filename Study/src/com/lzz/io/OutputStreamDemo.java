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
		
		//方法一
//		output.write(data);
		
		//方法二
//		for(int i = 0; i < data.length ; i++) {
//			output.write(data[i]);
//		}
		
		//方法三
		output.write(data , 5 , 8);
		
		output.close();
	}
}
