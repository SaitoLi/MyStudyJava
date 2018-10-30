package com.lzz.tranning;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ�
 * ���ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� 
 * �������{2,3,4,2,6,2,5,1}�Ļ�������������6���� 
 * {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� 
 * {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
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
	 *  ��������Ӧ���Ƕ��У���Ϊ�˵õ��������ڵ����ֵ����������Դ�����ɾ��Ԫ�أ����ʹ��˫�˶��С�
	 *  ԭ��
	 *  ��������Ԫ��k��������˫�˶����е�Ԫ����Ƚ�
	 *  1.ǰ���kС�ģ�ֱ���Ƴ����У���Ϊ���ٿ��ܳ�Ϊ���滬�����ڵ����ֵ��!��,
	 *  2.ǰ���k���X���Ƚ������±꣬�ж�X�Ƿ��Ѳ��ڴ���֮�ڣ������ˣ�ֱ���Ƴ�����
	 *  ���еĵ�һ��Ԫ���ǻ��������е����ֵ
	 *  
	 * @param num ��������
	 * @param size �������ڴ�С
	 * @return ���ػ����������ֵ�Ķ���
	 */
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<Integer>();
        if(size > num.length || size == 0) {
        	return list;
        }
        for(int i = 0 ; i < num.length ; i++) {
        	//  �Ӻ������ε��������бȵ�ǰnumֵС��Ԫ�أ�
            // ͬʱҲ�ܱ�֤������Ԫ��Ϊ��ǰ�������ֵ�±�  
        	while(queue.size() > 0 && num[queue.peekLast()] <= num[i]) {
        		queue.pollLast();
        	}
        	//  ��ǰ�����Ƴ�����Ԫ�����ڵ�λ��
            //  ������Ԫ�������Ӧ��num���ڴ����У���Ҫ���� 
        	while(queue.size() > 0 && i - queue.peekFirst() + 1 > size) {
        		queue.pollFirst();
        	}
        	queue.offerLast(i);
        	//  �����������׵�ַi���ڵ���sizeʱ�ſ�ʼд�봰�����ֵ
        	if(size != 0 && i + 1 >= size) {
        		list.add(num[queue.peekFirst()]);
        	}
        }
        return list;
    }
}
