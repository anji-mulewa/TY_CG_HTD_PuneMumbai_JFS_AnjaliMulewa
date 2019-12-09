package com.capgemini.corejava.project;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Baby b=  new Baby();
Lays l= new Lays();
//Chips c= new Chips(); we cannot instantiate an interface i.e . we can't create object of interface
b.receive(l);
	}

}
