package com.lzz.tranning;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/**
 * Ϊ�˲����Ż��Ƽ�Ч��������ͷ��ÿ��Ҫ�洢�ʹ��������ݡ�����������һ�ֳ�����
 * ���Ƕ��û��������ǵ�ע��ʱ���Ⱥ�����ţ�����һ�����£�ÿ���û����в�ͬ��ϲ��ֵ��
 * ���ǻ���֪��ĳһ��ʱ����ע����û������������һ���û����У��ж����û�����������ϲ��ֵΪk��
 * ��ΪһЩ�����ԭ�򣬲������һ����ѯ���û�������ȫ������һ����ѯ���û�����(������L1<=L2<=R2<=R1)��
 * 
 * 
 * ��������: ���룺 ��1��Ϊn�����û��ĸ��� ��2��Ϊn����������i�������û����Ϊi���û���ĳ�����µ�ϲ�ö� ��3��Ϊһ��������q�����ѯ������
 * ��4�е��ڣ�3+q���У�ÿ�а���3������l,r,k����һ���ѯ�������Ϊl<=i<=r���û��ж���������ϲ��ֵΪk���û��ĸ����� ���ݷ�Χn <=
 * 300000,q<=300000 k������ �������: ����� һ��q�У�ÿ��һ����������ϲ��ֵΪk���û��ĸ���
 * 
 * @author CunsiALIEN
 *
 */
public class UserPreference {
	public static Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	public static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i[] = new int[n];
		for (int x = 0; x < n; x++) {
			i[x] = sc.nextInt();
		}
		addToMap(i);
		int q = sc.nextInt();
		for (int j = 0; j < q; j++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int k = sc.nextInt();
			userPreference(l, r, k);
		}
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		sc.close();
	}

	public static void addToMap(int[] i) {
		for (int x = 0; x < i.length; x++) {
			if (!map.containsKey(i[x])) {
				List<Integer> list = new LinkedList<>();
				list.add(x + 1);
				map.put(i[x], list);
			} else {
				List<Integer> list = map.get(i[x]);
				list.add(x + 1);
			}
		}
	}

	public static void userPreference(int l, int r, int k) {
		int count = 0;
		List<Integer> list = map.get(k);
		if (list != null) {
			for (Integer integer : list) {
				if (integer >= l && integer <= r) {
					count++;
				}
			}	
		}
		queue.add(count);
	}
}
