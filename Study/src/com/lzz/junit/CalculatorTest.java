package com.lzz.junit;

import org.junit.Test;

import junit.framework.Assert;


public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		int result = cal.add(1, 2);
		Assert.assertEquals(result, 3);
	}
	
	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		int result = cal.sub(3, 2);
		Assert.assertEquals(result, 1);
	}
}
