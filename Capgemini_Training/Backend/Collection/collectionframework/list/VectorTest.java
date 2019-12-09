package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {
public static void main(String[] args) {
	Vector<Character> v = new Vector<Character>();
v.add('A');
v.add('P');
v.add('P');
v.add('L');
v.add('E');
	System.out.println("----------For-loop------------");
	for(int i =0; i<5;i++) {
		Character r = v.get(i);
		System.out.println(r);
	
	}
	
	System.out.println("-------for-each-----------");
	for(Character r : v) {
		System.out.println(r);
	}
	System.out.println("----------Iterator-----");
	Iterator<Character> it = v.iterator();
	while(it.hasNext()) {
		Character r = it.next();
		System.out.println(r);
		}
	
	System.out.println("----listIterator----");
System.out.println("---------->Forward");
ListIterator<Character> lit = v.listIterator();
while(lit.hasNext()) {
	Character r = lit.next();
	System.out.println(r);
}
System.out.println("------------Backward");
while(lit.hasPrevious()) {
	Object r = lit.previous();
	System.out.println(r);
}

}
}
