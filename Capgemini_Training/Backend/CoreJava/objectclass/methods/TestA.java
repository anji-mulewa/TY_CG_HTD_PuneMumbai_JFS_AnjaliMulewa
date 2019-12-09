package com.capgemini.objectclass.methods;

public class TestA {
public static void main(String[] args) {
	Pen p= new Pen();
	int i = p.hashCode(); // returns the memory location where the object  
	System.out.println(i);

	Pen p1 = new Pen();
	int j = p1.hashCode();
	System.out.println(j);
}
}
