package com.capgemini.bean;

public class CarTest {
public static void main(String[] args) {
	Car c = new Car(20, "benz");
	System.out.println(c.getCost());
	System.out.println(c.getName());
}
}
