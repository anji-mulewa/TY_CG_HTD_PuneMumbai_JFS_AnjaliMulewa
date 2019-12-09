package com.capgemini.corejava.interfaces;

public class InterfaceExampleImpl implements InterfaceExample1 {

	@Override
	public void print() {
		System.out.println("Implemented print method of Interface");
	}

	@Override
	public void printNum() {
		System.out.println("printNum method implemented in InterfaceExampleImpl ");
	}

	/*
	 * @Override public static void show() {
	 * System.out.println("Static method of interface"); // we can have static
	 * concrete methods }
	 */
	@Override
	public void display() {
		System.out.println("Overriding of default Display method of interface");
	}

	public static void main(String[] args) {
		InterfaceExample1 ie = new InterfaceExampleImpl();
		new InterfaceExampleImpl().print();
		new InterfaceExampleImpl().display();
		//new InterfaceExampleImpl().printNum();
		ie.print();
		ie.printNum();
		InterfaceExample1.show();
		
	}

}
