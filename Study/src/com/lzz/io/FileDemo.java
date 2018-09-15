package com.lzz.io;

import java.io.File;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("f:" + File.separator + "照片" + File.separator);
//		Scanner sc = new Scanner(System.in);
//		String opr = null;
//		if (!f.getParentFile().exists()) {
//			System.out.println("创建路径：" + f.getParentFile().mkdirs());
//			if (f.exists()) {
//				System.out.println("删除文件：" + f.delete());
//			} else {
//				System.out.println("创建文件：" + f.createNewFile());
//			}
//		} else {
//			System.out.println("目录已存在");
//		}
//		System.out.println("选择操作（P/D）");
//		opr = sc.nextLine();	
//		FileDemo.print(f,opr);
//		sc.close();
		FileDemo.print(f);//,"P"
	}

	public static void print(File f) {//, String op
		if (f.isDirectory()) {
			File result[] = f.listFiles();
			if (result != null) {
				for (int i = 0; i < result.length; i++) {
					print(result[i]);//,"P"
				}
			}
		}
		System.out.println(f);
//		if (op.equals("P")) {
//			System.out.println("目录信息：");
//			System.out.println(f);
//		} else if (op.equals("D")) {
//			System.out.println("删除目录：" + f.delete());
//		}else {
//			System.out.println("输入错误！");
//		}
	}
}
