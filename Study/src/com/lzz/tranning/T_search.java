package com.lzz.tranning;
/**
 * 三分查找算法
 * @author CunsiALIEN
 *
 */
public class T_search {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 14, 16, 23, 26};
		T_search search = new T_search();
		int index = search.t_search(0, array.length - 1, 6, array);
		System.out.println(index);
	}
	
	public int t_search(int l, int r, int target , int[] a) {
		if(l <= r)
	    {
	        int mid1 = l + (r - l) / 3;
	        int mid2 = l + (r - l) * 2 / 3;
	        if(a[mid2] < target)
	            return t_search(mid2 + 1, r, target, a);
	        else if(a[mid1] < target && a[mid2] > target)
	            return t_search(mid1 + 1, mid2 - 1, target, a);
	        else if(a[mid1] > target)
	            return t_search(l, mid1 - 1, target, a);
	        else if(a[mid1] == target)
	            return mid1;
	        else if(a[mid2] == target)
	            return mid2;
	    }
	    return -1;
	}
}
