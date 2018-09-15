package com.lzz.strategy;
/**
 * 上下文，持有IRunStrategy的引用
 * @author CunsiALIEN
 *
 */
public class ContextRunStrategy {
	private IRunStrategy iRunStrategy;
	
	public ContextRunStrategy(IRunStrategy iRunStrategy) {
		this.iRunStrategy = iRunStrategy;
	}
	/**
	 * 选择道路
	 * 通过实例化的iRunStrategy对象去调用所选择的逃跑路线
	 */
	public void choiceRoad() {
		iRunStrategy.escapeRoad();
	}
}
