package com.capgemini.array.generic;

public class StringArray {
public static void main(String[] args) {
	String []s = {"Ab","Cd","Ef"};
	receive(s);
	
}

 static void receive(String[] a) {
 	for(String i:a) {
 		System.out.println(i);
 	}
}
}
