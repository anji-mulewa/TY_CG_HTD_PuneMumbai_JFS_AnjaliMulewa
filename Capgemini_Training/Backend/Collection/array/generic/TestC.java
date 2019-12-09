package com.capgemini.array.generic;

public class TestC {
	public static void main(String[] args) {
		int a[] = {1,2,4,8,9};
		int[] b = {21,53,49};
		int []c = {35,856,487,5668};
		for(int i = 0; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		char ch[] = {'A','P','P','L','E'};
		for(int i = 0; i<ch.length ; i++) {
			System.out.println(ch[i]);
		}
		for(char a1:ch) {
			System.out.println(a1);
		}
	}
}
