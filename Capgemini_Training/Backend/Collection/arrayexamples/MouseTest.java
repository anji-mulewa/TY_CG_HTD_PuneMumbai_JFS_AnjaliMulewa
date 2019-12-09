package com.capgemini.arrayexamples;

public class MouseTest {
public static void main(String[] args) {
	Mouse m = new Mouse();
	double d[] = {1.2,2.4,3.5};
	m.walk(d);
	int a[] = {10,20,50,70};
	m.run(a);
	System.out.println("--------------");
	m.onlyOdd(a);
	
}
}
