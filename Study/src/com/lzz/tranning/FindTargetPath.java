package com.lzz.tranning;

import java.util.ArrayList;

import com.lzz.tranning.HasSubtree.TreeNode;

/**
 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·���� ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * (ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
 * 
 * @author CunsiALIEN
 *
 */
public final class FindTargetPath {
	/**
	 * ����˼���ڵ�ֵ�ĺ�Ϊ�����������ÿ��·����һ���ǴӸ��ڵ㵽Ҷ�ӽڵ㣬�����ݽṹ�дӸ��ڵ㵽Ҷ�ӽڵ�ı�����֮Ϊ������ȱ���DFS��
	 * ����������̿��Բ������������ʽ��DFS�������ڵ㡷���������������������һ�α�����ɺ�Ĵ���
	 * ��һ�α�����ɺ������������ֵǡ�õ��ڽڵ�ֵ֮�ͣ����������·�����һ���һ���ڵ㣨�Ա�Ѱ������·������
	 * �����������ֱ�ӻ���һ���ڵ㣬�����˵���ǰ�ڵ�ĸ��ڵ㣬����ø��ڵ����Һ��ӣ����������������������ˡ�
	 * ���ǻ��˵����ڵ㣬��ʱ��������Һ��ӣ��������������������DFS������
	 */
	//�����������·�������鼯��
	public ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
	//���һ��·���ļ���
	public ArrayList<Integer> path = new ArrayList<>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null) {  //�����Ϊ�գ����ؿռ���
			return pathList;
		}
		boolean isLeaf = root.left == null && root.right == null; //�жϽڵ�root�Ƿ�ΪҶ�ӽڵ�leaf
		path.add(root.val); //���ýڵ���뼯�ϣ���ӵ�·���У�
		if(isLeaf&&target==root.val) {
			pathList.add(new ArrayList<Integer>(path));
		}
		//�ݹ������������ ·����ֵ��==target ��·��
		if(root.val <= target && root.left != null) {
			FindPath(root.left,target-root.val);  
		}
		if(root.val <= target && root.right != null) {
			FindPath(root.right, target-root.val);
		}
		/**
		 * ����·����ֵ�Ƿ������������ֵ����Ҫ���ˣ���ʹ��remove�����Ƴ�·���ϵ����һ���ڵ㡣
		 */
		path.remove(path.size() - 1); //���˵����ڵ�
		return pathList;
	}
}
