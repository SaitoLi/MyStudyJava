package com.lzz.io;

import java.io.File;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("f:" + File.separator + "��Ƭ" + File.separator);
//		Scanner sc = new Scanner(System.in);
//		String opr = null;
//		if (!f.getParentFile().exists()) {
//			System.out.println("����·����" + f.getParentFile().mkdirs());
//			if (f.exists()) {
//				System.out.println("ɾ���ļ���" + f.delete());
//			} else {
//				System.out.println("�����ļ���" + f.createNewFile());
//			}
//		} else {
//			System.out.println("Ŀ¼�Ѵ���");
//		}
//		System.out.println("ѡ�������P/D��");
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
//			System.out.println("Ŀ¼��Ϣ��");
//			System.out.println(f);
//		} else if (op.equals("D")) {
//			System.out.println("ɾ��Ŀ¼��" + f.delete());
//		}else {
//			System.out.println("�������");
//		}
	}
}
