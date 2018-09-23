package com.lzz.tranning;

/**
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣� ���������������һ������ԡ�����һ������,�����������е�����Ե�����P��
 * ����P��1000000007ȡģ�Ľ������� �����P%1000000007
 * 
 * @author CunsiALIEN
 *
 */
public class InversePairs {
	/**
	 * ���ù鲢�����˼�룬�ڳ�������Ե�ʱ�������+1����
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
		 * �鲢�Ѿ���ֵĲ���
		 */
		int i = left;
		int j = mid + 1;
		int k = 0; // ����������±�
		// ����Ҫ�ϲ����������е�Ԫ�ذ���С�����˳�������ʱ����temp��
		while (i <= mid && j <= right) {
			if (arr[i] > arr[j]) {
				// ���������
				temp[k++] = arr[j++];
				//���arr[i] > arr[j]�������������i---mid���������a[j]��
				count += mid - i + 1;
				count %= 1000000007; //��ֹcount���������ȡ��
			} else {
				temp[k++] = arr[i++];
			}
		}
		// ��ʣ�µĲ��ּӽ�temp
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= right) {
			temp[k++] = arr[j++];
		}
		// �ϲ�����
		for (int n = 0; n < k; n++) {
			arr[left + n] = temp[n];
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0 };
		System.out.println(InversePairs_Solution(array));
	}
}
