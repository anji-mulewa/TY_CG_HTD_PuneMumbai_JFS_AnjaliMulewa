package com.capgemini.bean;

public class VanSingleTon {
private static final VanSingleTon ref = new VanSingleTon();
private VanSingleTon() {
	
}
public static VanSingleTon getVan() {
	return ref;
}
}
