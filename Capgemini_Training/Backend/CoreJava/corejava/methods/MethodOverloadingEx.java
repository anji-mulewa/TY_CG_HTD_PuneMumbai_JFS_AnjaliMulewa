package com.capgemini.corejava.methods;

public class MethodOverloadingEx {
	
	public static void main(String []args)
	{
		System.out.println(add(5,6));
		System.out.println(add(5,6,7));
		System.out.println(add(5,6.5,7));
		System.out.println(add(5,6,7.5));
		
	}
	
	public  static int add(int i, int j) {
		return i+j;
	}
	
	public  static int add(int i, int j,int k) {
		return i+j+k;
	}
	
	
	public  static double add(int i, int j,double d) {
		return i+j+d;
	}
	
	public  static double add(int i,double d, int j) {
		return i+j+d;
	}
	
	public  static float add(int i,float f, int j) {
		return i+j+f;
	}
	
	
}
