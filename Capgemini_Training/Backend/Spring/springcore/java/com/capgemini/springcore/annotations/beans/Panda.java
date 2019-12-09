package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Panda implements Animal {

	@Override
	public void eat() {
		System.out.println("Panda eats bamboo");
	}

	@Override
	public void sound() {
		System.out.println("Panda Squeaks");
	}

	@Override
	public void walk() {
		System.out.println("Panda is walking....");
	}

}
