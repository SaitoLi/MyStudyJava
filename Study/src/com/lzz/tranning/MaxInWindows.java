package com.lzz.tranning;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： 
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， 
 * {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * @author CunsiALIEN
 *
 */
public class MaxInWindows {
	public static void main(String[] args) {
		MaxInWindows max = new MaxInWindows();
		int[] a = {2,3,4,2,6,2,5,1};
		ArrayList<Integer> list = max.maxInWindows(a,3);
		for(Integer integer: list) {
			System.out.print(integer + " ");
		}
	}
	
	/**
	 *  滑动窗口应当是队列，但为了得到滑动窗口的最大值，队列序可以从两端删除元素，因此使用双端队列。
	 *  原则：
	 *  对新来的元素k，将其与双端队列中的元素相比较
	 *  1.前面比k小的，直接移出队列（因为不再可能成为后面滑动窗口的最大值了!）,
	 *  2.前面比k大的X，比较两者下标，判断X是否已不在窗口之内，不在了，直接移出队列
	 *  队列的第一个元素是滑动窗口中的最大值
	 *  
	 * @param num 所求数组
	 * @param size 滑动窗口大小
	 * @return 返回滑动窗口最大值的队列
	 */
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<Integer>();
        if(size > num.length || size == 0) {
        	return list;
        }
        for(int i = 0 ; i < num.length ; i++) {
        	//  从后面依次弹出队列中比当前num值小的元素，
            // 同时也能保证队列首元素为当前窗口最大值下标  
        	while(queue.size() > 0 && num[queue.peekLast()] <= num[i]) {
        		queue.pollLast();
        	}
        	//  当前窗口移出队首元素所在的位置
            //  即队首元素坐标对应的num不在窗口中，需要弹出 
        	while(queue.size() > 0 && i - queue.peekFirst() + 1 > size) {
        		queue.pollFirst();
        	}
        	queue.offerLast(i);
        	//  当滑动窗口首地址i大于等于size时才开始写入窗口最大值
        	if(size != 0 && i + 1 >= size) {
        		list.add(num[queue.peekFirst()]);
        	}
        }
        return list;
    }
}
