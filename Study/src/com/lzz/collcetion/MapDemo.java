package com.lzz.collcetion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		//HashMap���Key��Value����Ϊ�գ���Hashtable��Key��Value����Ϊ��
//		Map<String,Integer> map = new Hashtable<String,Integer>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("����", 5);
		map.put("����", 6);
		map.put("����", 7);
		map.put("����", 8);	
		map.put(null, 0);
		
		//Map����Iterator�ӿ�����ķ������£�
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		Iterator<Map.Entry<String,Integer>> ite = set.iterator();
		while(ite.hasNext()) {
			Map.Entry<String, Integer> ma = ite.next();
			System.out.println(ma.getKey() + "ս����  = " + ma.getValue());
		}
	}
}
