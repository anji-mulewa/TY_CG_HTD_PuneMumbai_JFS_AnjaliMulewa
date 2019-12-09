package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestN {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add(9.6);
	v.add('M');
	v.add("Priya");
	v.add(2);
	

	System.out.println("----------For-loop------------");
	for(int i =0; i<3;i++) {
		Object r = v.get(i);
		System.out.println(r);
	
	}
	
	System.out.println("-------for-each-----------");
	for(Object r : v) {
		System.out.println(r);
	}
	System.out.println("----------Iterator-----");
	Iterator it = v.iterator();
	while(it.hasNext()) {
		Object r = it.next();
		System.out.println(r);
		}
	
	System.out.println("----listIterator----");
System.out.println("---------->Forward");
ListIterator lit = v.listIterator();
while(lit.hasNext()) {
	Object r = lit.next();
	System.out.println(r);
}
System.out.println("------------Backward");
while(lit.hasPrevious()) {
	Object r = lit.previous();
	System.out.println(r);
}

}
}
