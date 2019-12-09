package com.capgemini.arraylist;


import java.util.ArrayList;
import java.util.Collections;

public class TestC {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add('A');
	al.add('M');
	al.add('Z');
	al.add('X');

	
	Collections.sort(al);
	System.out.println("Sort o/p  "+al);
	Collections.shuffle(al);
	System.out.println("Shuffle o/p  "+al);
}
}
