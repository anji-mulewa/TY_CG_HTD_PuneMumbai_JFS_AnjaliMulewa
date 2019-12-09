package com.capgemini.sorting.set;

import java.util.HashSet;

public class TestF {
public static void main(String[] args) {
	
	HashSet hs = new HashSet();
	hs.add(15);
	hs.add('A');
	hs.add(2.4);
	hs.add("Deepa");
	hs.add(15); 
	hs.add('A');
	hs.add(null);
	hs.add(null);
	
	
	System.out.println("----------Using for each loop--");
	for(Object r : hs) {
		System.out.println(r);
	}
}
}
