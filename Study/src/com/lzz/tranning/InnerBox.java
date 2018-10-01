package com.lzz.tranning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Bob有N个空盒子，第i个盒子是边长为a[i]的立方体，如果一个盒子的边长严格小于另一个盒子，并且大盒子里面没有其他小盒子，小盒子也没有放入其他大盒子中，那么这个小盒子可以放入大盒子。Bob可以根据条件任意的放盒子，因为他想看见最少数量的盒子。没有放入其他盒子的盒子是可以被看到的，请你帮Bob确定能看见盒子的最少数量。
 * 输入 输入有两行，第一行是N (1≤n≤5000) ，代表盒子的数量。 第二行有N个数字 a1,a2…an
 * (1≤ai≤10^9)。Ai是第i个盒子的边长。 输出 输出这个最小数量
 * 
 * @author CunsiALIEN
 *
 */
public class InnerBox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int count = innerBox(a);
		System.out.println(count);
		sc.close();
	}
	
	public static int innerBox(int[] arr) {
		int minBox = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(Integer x : arr) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			}
			else {
				map.put(x, 1);
			}
		}
		
		int[] counts = new int[map.size()];
		int index = 0;
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			counts[index++] = entry.getValue();
		}
		
		minBox += counts[index - 1];
		int max = minBox;
		for(int j = index - 1; j >= 0 ; j--) {
			if(counts[j] > minBox) {
				minBox += counts[j] - minBox;
			}
		}
		return minBox;
	}
}
