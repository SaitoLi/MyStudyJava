package com.lzz.strategy;
/**
 * 选择道路的用户：曹操
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
