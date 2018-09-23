package com.lzz.tranning;

/**
 * ��ֻ����������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ������������7��
 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 * @author CunsiALIEN
 */
public class GetUglyNumber {
	/**
	 * ĳ�������϶���ǰ�������2,3,5����;
	 * ֻ��Ҫ��ǰ�������ɼ��ɡ�1,2,3,4,5,6,8,9,10,12,15......
	 * @param index ��index������
	 * @return
	 */
	public static int GetUglyNumber_Solution(int index) {
		if(index == 0) {
			return 0 ; 
		}
		int[] uglyNums = new int[index];
		uglyNums[0] = 1; //1�ǵ�һ������
		
		/*
		 * �����Ķ�����1��������ֻ��2 3 5,���Ƴ�����=����*����,�ٶ�������������Ϊ:a1,a2,a3.......an 
		 * ���Կ��Խ���������(a1����)���Էֳ�3��,�ض�����: 
		 * ����2�������������:2*a1, 2*a2, 2*a3 ..... 
		 * ����3�������������:3*a1, 3*a2, 3*a3 ..... 
		 * ����5�������������:5*a1, 5*a2, 5*a3 ..... 
		 * ����3�����еĸ���������Ϊn��,������֪a1 = 1��,�������������кϲ���һ���������м��� 
		 * ������multi2,multi3,multi5ʵ�ʾ��Ǻϲ����������������д�������ֶ�����  
		 * ������֪�󵽽��,�ٰ�������������֪,����һ�����......ֱ��Ŀ��������
		 */
		int multi2 = 0;   
		int multi3 = 0;
		int multi5 = 0;
		
		for(int i = 1 ; i < uglyNums.length; i++) {
			int min = min(uglyNums[multi2]*2,uglyNums[multi3]*3,uglyNums[multi5]*5);
			uglyNums[i] = min;

			if(uglyNums[multi2]*2 == uglyNums[i]) {
				multi2++;
			}
			if(uglyNums[multi3]*3 == uglyNums[i]) {
				multi3++;
			}
			if(uglyNums[multi5]*5 == uglyNums[i]) {
				multi5++;
			}
		}
		return uglyNums[uglyNums.length - 1];
	}
	
	public static int min(int a, int b, int c) {
		int min = a < b ? a :b;
		return min < c ? min : c;
	}
	
	public static void main(String[] args) {
		int index = 20;
		System.out.println(GetUglyNumber_Solution(index));
	}
}
