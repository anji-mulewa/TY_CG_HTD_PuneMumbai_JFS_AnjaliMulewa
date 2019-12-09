package com.capgemini.objectclass.methods;

public class TestB {
public static void main(String[] args) {
	Pen p = new Pen();
	int add = p.hashCode();
	System.out.println(add);
	
	String a = p.toString(); // returns fully qualified path name along with 
							 // the hexadecimal value of the hashcode of the object  
	System.out.println(a);
	
	System.out.println(p); 
}
}
