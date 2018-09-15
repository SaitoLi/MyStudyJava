package com.lzz.collcetion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		//HashMap里的Key和Value可以为空，而Hashtable的Key和Value不能为空
//		Map<String,Integer> map = new Hashtable<String,Integer>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("张三", 5);
		map.put("李四", 6);
		map.put("王五", 7);
		map.put("赵六", 8);	
		map.put(null, 0);
		
		//Map利用Iterator接口输出的方法如下：
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		Iterator<Map.Entry<String,Integer>> ite = set.iterator();
		while(ite.hasNext()) {
			Map.Entry<String, Integer> ma = ite.next();
			System.out.println(ma.getKey() + "战斗力  = " + ma.getValue());
		}
	}
}
