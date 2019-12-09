package com.capgemini.array.generic;

public class SquareLambdaInterface {
public static void main(String[] args) {
	SquareInterface s = a-> a*a;
	int i = s.sqr(10);
	System.out.println("Square is " +i);
}
}
