package com.capgemini.seleniumjava.tddtest;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.seleniumjava.tdddemo.Calculator;

public class TestCalculator {
	Calculator cal = new Calculator();

	@Test
	public void addTest() {

		int a = 10;
		int b = 5;
		int expected = 15;
		int actual = cal.add(a, b);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void subtactTest() {
		int a = 20;
		int b= 1;
		int expected = 19;
		int actual = cal.subtract(a, b);
		Assert.assertEquals(expected, actual);
	}
}
