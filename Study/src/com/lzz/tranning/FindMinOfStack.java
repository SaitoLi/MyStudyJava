package com.lzz.tranning;

import java.util.Stack;

public class FindMinOfStack {

	Stack<Integer> dataStack = new Stack<Integer>();
	Stack<Integer> minStack = new Stack<Integer>();
	Integer min = 0;
	
	public void push(int node) {
        dataStack.push(node);
        if(minStack.isEmpty()) {
        	minStack.push(node);
        	min = node;
        }else {
        	min = minStack.peek();
        	if(node < min) {
        		minStack.push(node);
        		min = node;
        	}else {
        		minStack.push(min);
        	}
        }
    }
    
    public void pop() {
        dataStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int min() {
        return minStack.peek();
    }
}
