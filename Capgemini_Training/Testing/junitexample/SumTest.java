package com.capgemini.junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void testAdd() {
		Sum s = new Sum();
		int i = s.add(10, 20);
		assertEquals(30, i);
	}

	@Test
	public void add1Test() {
		Sum s = new Sum();
		int j = s.add(10, 20, 30);
		assertEquals(60, j);
	}
}
