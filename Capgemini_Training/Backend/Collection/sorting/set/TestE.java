package com.capgemini.sorting.set;

import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(15);
		ts.add(2);
		ts.add(9);
		ts.add(10);
		ts.add(null);
		
		System.out.println("---for each loop---");
		for(Object r : ts) {
			System.out.println(r);
		}
	}

}
