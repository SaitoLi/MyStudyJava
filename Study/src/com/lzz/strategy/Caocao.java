package com.lzz.strategy;
/**
 * ѡ���·���û����ܲ�
 * @author CunsiALIEN
 *
 */
public class Caocao {
	public static void main(String[] args) {
		IRunStrategy iRunStrategy = new HuaRongRoad();
		ContextRunStrategy con = new ContextRunStrategy(iRunStrategy);
		con.choiceRoad();
	}
}
