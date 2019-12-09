package com.capgemini.bean;

public class VanTest {
public static void main(String[] args) {
	VanSingleTon v = VanSingleTon.getVan();
	System.out.println(v);
	
	VanSingleTon r = VanSingleTon.getVan();
	System.out.println(r);
	
	VanSingleTon t = VanSingleTon.getVan();
	System.out.println(t);
	
	
}
}
