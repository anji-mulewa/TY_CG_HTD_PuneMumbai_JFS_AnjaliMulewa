package com.capgemini.predicateExample;

import java.util.function.Function;

public class TestB {
	public static void main(String[] args) {
		Function<Integer , Integer> f = i-> i*i;
		
		//Integer ans = f.apply(5);
		int ans = f.apply(5); // auto-unboxing
		System.out.println("Result is "+ans);
	}

}
