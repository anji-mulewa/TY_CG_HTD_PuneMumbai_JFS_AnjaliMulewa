package com.capgemini.corejava.methods;

public class Car {
 String name;
 String color;
 double price;
 
public Car(String name, String color, double price) 
{
	this.name=name;
	this.color=color;
	this.price=price;
	
}
public Car(String name) {
	this.name = name;
}

public Car() {

}

	  public Car(double price) {

	this.price = price;
}
	  
public Car(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	
public Car( double price ,String name) {  // we can have constructor with same name , same number of 
	                                        //arguments and datatype but the arrangement of argument is different
		this.name = name;
		this.price = price;
	}
	@Override
	  public String toString() { 
		  return "Car [name=" + name + ", color= "+ color + ", price=" + price + "]"; 
		  }
	 

  

}
