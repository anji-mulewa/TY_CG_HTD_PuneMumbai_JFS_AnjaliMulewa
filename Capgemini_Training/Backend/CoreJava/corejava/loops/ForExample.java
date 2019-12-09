package com.capgemini.corejava.loops;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
	/*	for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Code outside for loop and i " + i);
		for (i = 1; i <= 10;) {
			System.out.println(i);
			i++;
		}
		System.out.println("Code outside for loop and i " + i);

		/*
		 * for (;;) { System.out.println(i++); } // System.out.println("hello"); cannot
		 * write this statement because it will be // unreachable code because of
		 * infinite loop
		 

		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("i is even");
			} else {
				System.out.println("i is odd");
			}
			//System.out.println(i);
		} */
		if(i%2==0) {
			for(;i<=20;i++) {
				System.out.println("even");
			}
		}
		else {
			System.out.println("odd");
		}
	}

}
