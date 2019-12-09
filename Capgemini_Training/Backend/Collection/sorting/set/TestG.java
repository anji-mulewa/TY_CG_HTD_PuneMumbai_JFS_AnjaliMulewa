package com.capgemini.sorting.set;

import java.util.TreeSet;
import java.util.Iterator;

public class TestG {

public static void main(String[] args) {
	TreeSet<String> hs = new TreeSet<String>();
	hs.add("Anjali");
	hs.add("Snehal");
	hs.add("Mayuri");
	System.out.println("----Iterator----");
	Iterator<String> it = hs.iterator();
	while(it.hasNext()) {
		String r = it.next();
		System.out.println(r);
	}
	
}
}
