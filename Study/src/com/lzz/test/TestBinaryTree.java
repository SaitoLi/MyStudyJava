package com.lzz.test;

import com.lzz.tranning.TreeOperation;

public class TestBinaryTree {
	public static void main(String[] args) {
		TreeOperation to = new TreeOperation();
		to.insert(15);
		to.insert(24);
		to.insert(11);
		to.insert(36);
		to.insert(5);
		to.insert(9);
		to.insert(1);
		to.insert(33);
		to.inOrder(to.getRoot());
		System.out.println();
		to.preOrder(to.getRoot());
		System.out.println();
		System.out.println(to.printByRow(to.getRoot()));
	}
}
