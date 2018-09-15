package com.lzz.math;

import java.math.BigDecimal;

public class MyMath {
	/**
	 *   @author CunsiALIEN ʵ��׼ȷλ���������������
	 *   @param num Ҫ���������������������
	 * 	 @param scale Ҫ������С��λ
	 *   @return ������������������
	 */
	public static double round(double num , int scale) {
		BigDecimal bigA = new BigDecimal(num);
		BigDecimal bigB = new BigDecimal(1);
		return bigA.divide(bigB, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	public static void main(String[] args) {
		System.out.println(MyMath.round(19.8765, 2));
		System.out.println(MyMath.round(-15.5, 0));
	}
}

