package com.lzz.tranning;

import java.util.HashSet;
import java.util.Scanner;

/**
 * ţţ�ִ�������й�����������һ������,���ţţ��Ҫ�������й����ߴ�DNA����s���ҳ����û�г�����DNA����s�е�DNAƬ�εĳ��ȡ� ����:s =
 * AGGTCTA �����а��������г���Ϊ1��('A','C','G','T')Ƭ��,���ǳ���Ϊ2��û��ȫ������,���������в�����"AA",�������2��
 * ��������: �������һ���ַ���s,�ַ�������length(1 �� length �� 2000),����ֻ����'A','C','G','T'�������ַ���
 * �������: ���һ��������,�����û�г�����DNA����s�е�DNAƬ�εĳ��ȡ�
 * 
 * @author CunsiALIEN
 *
 */
public class DNASequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sequence = sc.nextLine();
		/*
		 * DNA���еĳ��ȴ�1��ʼ�ƣ�ÿ�����ȵ�������Ϊ4^i
		   *   ʹ��HashSet���ظ������ʣ���������sequence�г���DNA���е����࣬
		   *   ���δ�ﵽ4^i��i��������
		 */
		for (int i = 1; i <= sequence.length(); i++) {
			HashSet<String> dnaSequence = new HashSet<String>();
			for (int j = 0; j <= sequence.length() - i; j++) {
				dnaSequence.add(sequence.substring(j, j + i));
			}
			if (dnaSequence.size() < Math.pow(4, i)) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}



