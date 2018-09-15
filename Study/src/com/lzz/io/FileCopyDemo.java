package com.lzz.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
//123
public class FileCopyDemo {
	public static void main(String[] args) throws Exception{
		if(args.length != 2) { //初始化参数不足2位
			System.out.println("命令执行错误!");
			System.exit(1);//程序退出
		}
		long start = System.currentTimeMillis();
		
		//输入参数正确，进行文件认证
		File inFile = new File(args[0]);
		if(!inFile.exists()) {
			System.out.println("源文件不存在。");
			System.exit(1);
		}
		
		//定义输出文件，考虑目录是否存在
		File outFile = new File(args[1]);
		if(!outFile.getParentFile().exists()) {  //如果路径不存在
			outFile.getParentFile().mkdirs();  //创建路径
		}
		
		//实现文件内容的拷贝
		InputStream input = new FileInputStream(inFile);
		OutputStream output = new FileOutputStream(outFile);
		//实现文件拷贝
		int	temp = 0;  //保存每次存取的数据个数
		byte data[] = new byte[1024];  //每次都去1024个字节
		
		//将每次读取的数据保存字节数组里，并返回读取的个数
		while((temp = input.read(data)) != -1) {
			output.write(data, 0, temp);
		}
		output.flush();
		output.close();
		long end = System.currentTimeMillis();
		System.out.println("拷贝所花费时间：" + (end - start));
	}
}
