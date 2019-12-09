package com.capgemini.predicateExample;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		//Predicate<Integer> p = i-> i%2==0;
		Predicate<Integer> p = i -> {
			if(i%2==0) {
				return false;
			}else {
				return true;
			}
		};
boolean res = p.test(10);
System.out.println("Result is "+res);
	}
}
