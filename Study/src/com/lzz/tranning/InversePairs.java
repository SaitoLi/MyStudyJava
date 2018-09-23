package com.lzz.tranning;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字， 则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 
 * @author CunsiALIEN
 *
 */
public class InversePairs {
	/**
	 * 利用归并排序的思想，在出现逆序对的时候计数器+1即可
	 */
	private static long count = 0;

	public static int InversePairs_Solution(int[] array) {
		int[] temp = new int[array.length];
		merge(array, 0, array.length - 1, temp);
		return (int) count % 1000000007;
	} 

	public static void merge(int[] arr, int left, int right, int[] temp) {
		if (left < right) {
			int mid = (left + right) / 2;
			merge(arr, left, mid, temp);
			merge(arr, mid + 1, right, temp);
			mergeArray(arr, left, mid, right, temp);
		}
	}

	public static void mergeArray(int[] arr, int left, int mid, int right, int[] temp) {
		/**
		 * 归并已经拆分的部分
		 */
		int i = left;
		int j = mid + 1;
		int k = 0; // 复制数组的下标
		// 将需要合并的两部分中的元素按从小到大的顺序加入临时数组temp中
		while (i <= mid && j <= right) {
			if (arr[i] > arr[j]) {
				// 存在逆序对
				temp[k++] = arr[j++];
				//如果arr[i] > arr[j]，则左侧数组中i---mid个数都会比a[j]大
				count += mid - i + 1;
				count %= 1000000007; //防止count过大溢出而取余
			} else {
				temp[k++] = arr[i++];
			}
		}
		// 将剩下的部分加进temp
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= right) {
			temp[k++] = arr[j++];
		}
		// 合并数组
		for (int n = 0; n < k; n++) {
			arr[left + n] = temp[n];
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0 };
		System.out.println(InversePairs_Solution(array));
	}
}
