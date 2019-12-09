package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("eating pedgree");
	}

	@Override
	public void sound() {
		System.out.println("Dog barks");
	}

	@Override
	public void walk() {
		System.out.println("Dog is runnning...");
	}

}
