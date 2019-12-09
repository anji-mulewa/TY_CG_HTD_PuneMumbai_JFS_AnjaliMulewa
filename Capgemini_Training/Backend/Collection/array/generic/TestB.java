package com.capgemini.array.generic;

public class TestB {
public static void main(String[] args) {
	int[] i= new int[4];
	i[0]=1;
	i[1]=2;
	i[2]=3;
	i[3]=4;
	
	int size = i.length;
	System.out.println("size is "+size);
	for(int j=0;j<i.length;j++) {
		System.out.println(i[j]);
	}
}
}
