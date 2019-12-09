package com.capgemini.corejava.inheritance;

public class Son extends Father implements InterfaceExample{
	String sname = "Roob";

	public static void main(String[] args) {
		Son son = new Son();
		son.print();
		son.display();
		son.show();
	}

	@Override
	public void print() {
		System.out.println(sname + " " + fname + " " + lastname);
		super.print();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method in son");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show method in son");
	}
}
