package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestK {
public static void main(String[] args) {
	ArrayList<Double> d = new ArrayList<Double>();
	d.add(2.4);
	d.add(2.5);
	d.add(1.56);
	d.add(2.47);
	
	ListIterator<Double> it = d.listIterator();
	System.out.println("-----------Forward");
	while(it.hasNext()) {
		Double r = it.next();
		System.out.println(r);
	}
	System.out.println("-----------Backward");
	while(it.hasPrevious()) {
		Double r = it.previous();
		System.out.println(r);
	}
}
}
