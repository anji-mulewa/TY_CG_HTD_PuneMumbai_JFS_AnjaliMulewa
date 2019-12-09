package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestI {
public static void main(String[] args) {
	ArrayList<Double> d = new ArrayList<Double>();
	d.add(2.4);
	d.add(2.5);
	d.add(1.56);
	d.add(2.47);
	
	for(Double i : d) {
		System.out.println(i);
	}
}
}
