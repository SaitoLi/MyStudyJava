package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中 
 * 找到第一个只出现一次的字符,并返回它的位置； 
 * 如果没有则返回 -1（需要区分大小写）
 * @author CunsiALIEN
 */
public class FirstNotRepeatingChar {
	/**
	 * 将不重复字符的下标加入list排序，list[0]即为所求
	 * @param str
	 * @return
	 */
	public static int FirstNotRepeatingChar_Solution(String str) {
		if (str == "") {
			return -1;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		List<Integer> list = new ArrayList<>();
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				map.put(ch[i], map.get(ch[i]) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				list.add(str.indexOf(entry.getKey()));
			}
		}
		if (!list.isEmpty()) {
			Collections.sort(list);
			return list.get(0);
		}
		return -1;
	}

	public static void main(String[] args) {
		String str = "aabbccss";
		System.out.println(FirstNotRepeatingChar_Solution(str));
	}
}
