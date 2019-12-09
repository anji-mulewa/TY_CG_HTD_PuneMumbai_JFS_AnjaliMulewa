package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestM {
public static void main(String[] args) {
	LinkedList<String> li = new LinkedList<String>();
	li.add("ab");
	li.add("cd");
	li.add("ef");
	
	System.out.println("----------For-loop------------");
	for(int i =0; i<3;i++) {
		String r = li.get(i);
		System.out.println(r);
	
	}
	
	System.out.println("-------for-each-----------");
	for(String r : li) {
		System.out.println(r);
	}
	System.out.println("----------Iterator-----");
	Iterator<String> it = li.iterator();
	while(it.hasNext()) {
		String r = it.next();
		System.out.println(r);
		}
	
	System.out.println("----listIterator----");
System.out.println("---------->Forward");
ListIterator<String> lit = li.listIterator();
while(lit.hasNext()) {
	String r = lit.next();
	System.out.println(r);
}
System.out.println("------------Backward");
while(lit.hasPrevious()) {
	String r = lit.previous();
	System.out.println(r);
}

}
}
