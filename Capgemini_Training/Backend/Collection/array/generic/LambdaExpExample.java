package com.capgemini.array.generic;
interface Sum{
	int add(int a , int b);
}
public class LambdaExpExample {
public static void main(String[] args) {
	Sum f = (a,b)->a+b;
	int j = f.add(10, 20);
	System.out.println("Sum is "+j);
}
}
