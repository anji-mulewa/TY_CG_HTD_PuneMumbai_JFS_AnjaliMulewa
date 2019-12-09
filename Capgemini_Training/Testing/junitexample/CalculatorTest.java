package com.capgemini.junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculator= null;
	
	@BeforeEach
	public void createOject() {
	 calculator= new Calculator();
	}
	
	@Test
	public void sumTest() {
	int i = calculator.sum(10, 10);
	assertEquals(20, i);
	}
	
	@Test
	public void testSumForNegative() {
	int i = calculator.sum(10, -100);
	assertEquals(-90, i);
	}
	
	
	@Test
	public void multiplyTest() {
		double d = calculator.multiply(10, 10);
		assertEquals(100, d);
	}
	
	@Test
	public void subtractTest() {
		int i = calculator.subtract(20, 10);
		assertEquals(10, i);
	} 

	@Test
	public void divisonTest() {
		int d = calculator.divison(20, 2);
		assertEquals(10, d);
	}
	
	@Test
	public void testDivByZero() {
		assertThrows(ArithmeticException.class, () ->calculator.divison(10, 0));
	}
	
	
	@Test
	public void factorialTest() {
		int i = calculator.factorial(4);
		assertEquals(24, i);
	}
	
	@Test
	public void factorialZeroTest() {
		int i = calculator.factorial(0);
		assertEquals(1, i);
	}
	
	@Test
	public void factorialNegativeTest() {
		int i = calculator.factorial(-6);
		assertEquals(1, i);
	}
}
