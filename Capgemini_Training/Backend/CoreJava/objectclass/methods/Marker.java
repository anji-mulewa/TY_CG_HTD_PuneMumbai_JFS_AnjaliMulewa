package com.capgemini.objectclass.methods;

public class Marker implements Cloneable{
	String name;
	int id;
	public Marker(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
