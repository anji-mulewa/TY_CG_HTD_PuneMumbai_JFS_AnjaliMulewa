package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestH {
public static void main(String[] args) {
	ArrayList<Double> d = new ArrayList<Double>();
	d.add(2.4);
	d.add(2.5);
	d.add(1.56);
	d.add(2.47);
	
//	d.add(2); // cte only double is allowed 
	for(int i = 0; i<4; i++) {
		Double r = d.get(i);
		System.out.println(r);
	}
}
}
