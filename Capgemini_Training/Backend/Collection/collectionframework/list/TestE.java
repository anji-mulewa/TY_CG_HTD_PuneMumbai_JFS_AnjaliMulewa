package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestE {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	
	al.add(24);
	al.add("abcd");
	al.add(2.9);
	al.add('F');

	System.out.println(al); //in ArrayList toString method is overridden
}
}
