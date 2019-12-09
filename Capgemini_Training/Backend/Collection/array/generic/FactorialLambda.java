package com.capgemini.array.generic;
 interface fact{
	 int calculateFact(int a);
 }
public class FactorialLambda {
	public static void main(String[] args) {
		fact f = a-> {
			int f1=1;
			for(int i=1;i<=a;i++) {
				f1=f1*i;
		}	
			return f1;
		};
		int i = f.calculateFact(6);
		System.out.println("Factorial is "+i);
	}
}


