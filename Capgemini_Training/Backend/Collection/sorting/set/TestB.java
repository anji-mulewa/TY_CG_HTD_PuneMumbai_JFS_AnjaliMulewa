package com.capgemini.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
public static void main(String[] args) {
	HashSet<String> hs = new HashSet<String>();
	hs.add("Abc");
	hs.add("fhgg");
	hs.add("ab");
	System.out.println("----Iterator----");
	Iterator<String> it = hs.iterator();
	while(it.hasNext()) {
		String r = it.next();
		System.out.println(r);
	}
	
	System.out.println("---for each loop---");
	for(Object r : hs) {
		System.out.println(r);
	}

}
}
