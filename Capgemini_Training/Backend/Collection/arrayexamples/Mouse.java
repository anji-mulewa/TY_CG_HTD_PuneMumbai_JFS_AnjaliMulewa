package com.capgemini.arrayexamples;

public class Mouse {
	void onlyOdd(int[] a) {
		for(int i:a) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	void walk(double[] a) {
		for (double d : a) {
			System.out.println(d);
		}
	}

	void run(int[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
