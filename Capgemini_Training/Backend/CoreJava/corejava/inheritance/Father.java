package com.capgemini.corejava.inheritance;

public class Father extends Grandfather {
	String fname = "Eddard";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Father().print();
		new Grandfather().print();

	}

	@Override

	public void print() {
		System.out.println(fname + " " + name + " " + lastname);
		super.print();
	}
}

