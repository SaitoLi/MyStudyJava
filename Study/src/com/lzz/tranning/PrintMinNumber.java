package com.lzz.tranning;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ������ ��ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * 
 * @author CunsiALIEN
 */
public class PrintMinNumber {
	/**
	 * ����ð�������˼�� 
	 * �Ƚ�������������Ԫ������ַ����Ĳ�ͬ���з�ʽ�Ĵ�С��
	 * ��С�������� �����ν�����Ԫ��ƴ��
	 * @param numbers
	 * @return
	 */
	public static String PrintMinNumber_Solution(int[] numbers) {
		if (numbers == null) {
			return null;
		}
		StringBuilder minNum = new StringBuilder();
		String pre;
		String last;
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				pre = numbers[i] + "" + numbers[j];
				last = numbers[j] + "" + numbers[i];
				if (pre.compareTo(last) > 0) {
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
			minNum.append(numbers[i]);
		}
		return minNum.toString();
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 32, 321 };
		System.out.println(PrintMinNumber_Solution(numbers));
	}
}
