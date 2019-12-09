package com.capgemini.coejava.basics;

public class IncrDecrOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		i = ++i; // preincre
		System.out.println(i);
		
        int k=j++; // post incre
        System.out.println(k);
        System.out.println(j);
        i = --i; // predecre
		System.out.println(i);
		
         k=j--;// post decre
        System.out.println(k);
        System.out.println(j);
	}

}
