package com.lzz.tranning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Bob��N���պ��ӣ���i�������Ǳ߳�Ϊa[i]�������壬���һ�����ӵı߳��ϸ�С����һ�����ӣ����Ҵ��������û������С���ӣ�С����Ҳû�з�������������У���ô���С���ӿ��Է������ӡ�Bob���Ը�����������ķź��ӣ���Ϊ���뿴�����������ĺ��ӡ�û�з����������ӵĺ����ǿ��Ա������ģ������Bobȷ���ܿ������ӵ�����������
 * ���� ���������У���һ����N (1��n��5000) ��������ӵ������� �ڶ�����N������ a1,a2��an
 * (1��ai��10^9)��Ai�ǵ�i�����ӵı߳��� ��� ��������С����
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
