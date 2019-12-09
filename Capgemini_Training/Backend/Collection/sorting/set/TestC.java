package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
public static void main(String[] args) {
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.add(15);
	lhs.add('A');
	lhs.add(2.4);
	lhs.add("Deepa");
	
	System.out.println("----for-each loop----");
	for(Object r : lhs) {
		System.out.println(r);
	}
	
	System.out.println("-----Iterator----");
	Iterator it = lhs.iterator(); 
	while(it.hasNext()) {
		Object r = it.next();
		System.out.println(r);
	}
}
}
