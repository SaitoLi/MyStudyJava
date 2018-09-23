package com.lzz.tranning;

import java.util.HashMap;
import java.util.Map;

/**
   *   统计一个数字在数组中出现的次数
 * @author CunsiALIEN
 *
 */
public class GetNumberOfK {
	public int GetNumberOfK_Solution(int[] array, int k) {
		if (array == null) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], 1);
			} else {
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		if (map.containsKey(k)) {
			return map.get(k);
		}
		return 0;
	}
}
