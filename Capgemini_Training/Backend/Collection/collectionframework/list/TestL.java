package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestL {
public static void main(String[] args) {
	LinkedList li = new LinkedList();
	
	li.add("Abcd");
	li.add(1);
	li.add(2.56);
	
	System.out.println("----------For-loop------------");
	for(int i =0; i<3;i++) {
		Object r = li.get(i);
		System.out.println(r);
	
	}
	
	System.out.println("-------for-each-----------");
	for(Object r : li) {
		System.out.println(r);
	}
	System.out.println("----------Iterator-----");
	Iterator it = li.iterator();
	while(it.hasNext()) {
		Object r = it.next();
		System.out.println(r);
		}
	
	System.out.println("----listIterator----");
System.out.println("---------->Forward");
ListIterator lit = li.listIterator();
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
