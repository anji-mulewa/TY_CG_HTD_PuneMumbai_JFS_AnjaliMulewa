package com.capgemini.array.generic;
interface PiValue{
	double getPi();
}
public class PiLambda {
public static void main(String[] args) {
	PiValue p = ()-> 3.142;
System.out.println("Pi value is "+p.getPi());
}
}
