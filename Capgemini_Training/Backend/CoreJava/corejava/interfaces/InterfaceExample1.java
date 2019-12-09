package com.capgemini.corejava.interfaces;
//@FunctionalInterface
public interface InterfaceExample1 {
	public void print();// it is by default abstract method so we can't declare the method

	public void printNum();

	default void display() {
		System.out.println("Default method of interface");
	}

	public static void show() {
		System.out.println("Static method of interface"); // we can have static concrete methods
	}

}
