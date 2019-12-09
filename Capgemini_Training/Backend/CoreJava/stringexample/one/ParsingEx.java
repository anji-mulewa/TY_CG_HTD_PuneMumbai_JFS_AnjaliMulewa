package com.capgemini.stringexample.one;

public class ParsingEx {
public static void main(String[] args) {
//	String a= "90.0";
	String c="90";
	String b="100";
	System.out.println(c+b); 
	//int i = Integer.parseInt(a);// number format exception as a is 90.0 which is double 
	int j= Integer.parseInt(b);
	int i = Integer.parseInt(c);
	System.out.println(i+j);
	String d= "2.42";
	float f= Float.parseFloat(d);
	String bol= "true";

}
}
