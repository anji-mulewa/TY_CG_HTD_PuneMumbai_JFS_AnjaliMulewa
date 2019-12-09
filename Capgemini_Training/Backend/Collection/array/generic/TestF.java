package com.capgemini.array.generic;

public class TestF {
	public static void main(String[] args) {
		int[] m = { 10, 20, 50, 26 };
		receive(m);
		double[] d = { 12, 543, 68 };
		receive(d);
	}

	static void receive(int a[]) {
		for (int i : a) {
			System.out.println(i);
		}
	}

static void receive(double a[]) {
	for(double i:a) {
		System.out.println(i);
	}

}
}
