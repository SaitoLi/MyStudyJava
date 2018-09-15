package com.lzz.strategy;
/**
 * �����ģ�����IRunStrategy������
 * @author CunsiALIEN
 *
 */
public class ContextRunStrategy {
	private IRunStrategy iRunStrategy;
	
	public ContextRunStrategy(IRunStrategy iRunStrategy) {
		this.iRunStrategy = iRunStrategy;
	}
	/**
	 * ѡ���·
	 * ͨ��ʵ������iRunStrategy����ȥ������ѡ�������·��
	 */
	public void choiceRoad() {
		iRunStrategy.escapeRoad();
	}
}
