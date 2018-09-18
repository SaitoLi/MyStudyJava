package com.lzz.tranning;

import java.util.ArrayList;

public class PrintMatrix {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int bottom = matrix.length - 1 ;
	    ArrayList<Integer> list = new ArrayList<>();
		while((top<bottom)&&(left<right)) {
			for(int i = left ; i <= right ; i++) {
				list.add(matrix[top][i]);
			}
			for(int i = top + 1 ; i <= bottom ; i++) {
				list.add(matrix[i][right]);
			}
			for(int i = right - 1 ; i >= left ; i--) {
				list.add(matrix[bottom][i]);
			}
			for(int i = bottom - 1 ; i > top ; i--) {
				list.add(matrix[i][left]);
			}
			left++;
			right--;
			top++;
			bottom--;
		}
		if((top==bottom)&&(left<right)) {
			for(int i = left ; i <= right; i++) {
				list.add(matrix[top][i]);
			}
		}
		if((top<bottom)&&(left==right)) {
			for(int i = top ; i <= bottom; i++) {
				list.add(matrix[i][left]);
			}
		}
		if((top==bottom)&&(left==right)) {
			list.add(matrix[left][bottom]);
		}
		
		return list;
	}
}
