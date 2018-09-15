package com.lzz.tranning;

public class ReOrderArray {
	public void reOrderArray(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] % 2 == 0) {
				continue;
			} else {
				int begin = i;
				while (array[begin] % 2 != 0 && begin > 0) {
					begin--;
				}
				if (begin >= 0) {
					int temp = array[begin];
					if (temp % 2 == 0) {
						for (int j = begin + 1; j <= i; j++) {
							array[j - 1] = array[j];
						}
						array[i] = temp;
					}
					else {
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		ReOrderArray roa = new ReOrderArray();
		roa.reOrderArray(a);
		for (int m = 0; m < a.length; m++) {
			System.out.println(a[m]);
		}
	}
}
