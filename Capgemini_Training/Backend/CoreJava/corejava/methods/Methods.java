package com.capgemini.corejava.methods;

public class Methods {
    int y = 34;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		System.out.println("Area = " + areaOfSquare(10));
		//int area = new Methods().areaOfRectangle(1,2);
		//System.out.println(area);
		System.out.println(new Methods().areaOfRectangle(1,2));
	}
	public static void print() {
		System.out.println("print() method");
	}
	 public static int areaOfSquare(int side)
	 {
		return side*side;
	 }
	 public int areaOfRectangle(int l, int b) {
		 return l*b;
	 }
}
