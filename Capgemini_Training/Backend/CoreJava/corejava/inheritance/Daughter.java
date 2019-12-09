package com.capgemini.corejava.inheritance;

public class Daughter extends Father implements InterfaceExample {
	String dname = "Sansa";

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.print();
		d.display();
		d.show();
	}

	@Override
	public void print() {
		System.out.println(dname + " " + fname + " " + lastname);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method in Daughter");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show method in Daughter");
	}
}
