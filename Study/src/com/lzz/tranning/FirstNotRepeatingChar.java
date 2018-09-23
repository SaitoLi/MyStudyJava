package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)�� 
 * �ҵ���һ��ֻ����һ�ε��ַ�,����������λ�ã� 
 * ���û���򷵻� -1����Ҫ���ִ�Сд��
 * @author CunsiALIEN
 */
public class FirstNotRepeatingChar {
	/**
	 * �����ظ��ַ����±����list����list[0]��Ϊ����
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
