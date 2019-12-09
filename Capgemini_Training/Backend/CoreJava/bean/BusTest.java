package com.capgemini.bean;

public class BusTest {
public static void main(String[] args) {
	Bus b = new Bus("BEST",45);
	System.out.println("name is :" +b.getName());
	System.out.println("Seats are :"+b.getSeats());
}
}
