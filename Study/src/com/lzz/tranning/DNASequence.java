package com.lzz.tranning;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 牛牛又从生物科研工作者那里获得一个任务,这次牛牛需要帮助科研工作者从DNA序列s中找出最短没有出现在DNA序列s中的DNA片段的长度。 例如:s =
 * AGGTCTA 序列中包含了所有长度为1的('A','C','G','T')片段,但是长度为2的没有全部包含,例如序列中不包含"AA",所以输出2。
 * 输入描述: 输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 2000),其中只包含'A','C','G','T'这四种字符。
 * 输出描述: 输出一个正整数,即最短没有出现在DNA序列s中的DNA片段的长度。
 * 
 * @author CunsiALIEN
 *
 */
public class DNASequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sequence = sc.nextLine();
		/*
		 * DNA序列的长度从1开始计，每个长度的序列数为4^i
		   *   使用HashSet不重复的性质，计算序列sequence中出现DNA序列的种类，
		   *   如果未达到4^i，i即所求结果
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



