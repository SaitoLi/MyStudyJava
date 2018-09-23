package com.lzz.tranning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MITest {
	/**
	   * 输入数值序列i行(0<i)，每一行分别是进制和数值，以“#”分割。如：n#m, n是整数，代表n进制（1<n<17）,m是n进制下的数值.
	   *  输入序列以结束符”END”结束.
	 */
	private static Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();
	private static Map<Map<Integer,Integer>,Integer> map2 = new HashMap<Map<Integer,Integer>,Integer>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while(sc.hasNext()) {
			String str = sc.nextLine();
			if("END".equals(str)) {
				break;
			}
			String[] strNum = str.split("#");
			int[] num = new int[2];
			num[0] = Integer.parseInt(strNum[0]);
			num[1] = Integer.parseInt(strNum[1]);
			run(num[0],num[1]);
		}
		for(Entry<Map<Integer, Integer>, Integer> result : map2.entrySet()) {
			if(!list.contains(result.getValue())) {
				list.add(result.getValue());
			}
		}
		if(list == null) {
			System.out.println("None");
		}
		else {
			for(Integer k : list) {
				
			}
		}
	}
	
	
	public static void run(int n, int m) {
		int resultNum = Integer.parseInt(Integer.toString(m), n);
		map1.put(n, m);
		map2.put(map1,resultNum);
	}
}
