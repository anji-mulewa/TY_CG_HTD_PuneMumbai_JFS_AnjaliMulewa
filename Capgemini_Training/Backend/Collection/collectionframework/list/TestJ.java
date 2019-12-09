package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJ {
public static void main(String[] args) {
	ArrayList<Double> d = new ArrayList<Double>();
	d.add(2.4);
	d.add(2.5);
	d.add(1.56);
	d.add(2.47);
	
	Iterator<Double> it = d.iterator(); //iterator is of type double
	while(it.hasNext()) {
		Double r = it.next(); // as iterator is of type double the next() method will return Double type
		System.out.println(r);
	}
}
}
