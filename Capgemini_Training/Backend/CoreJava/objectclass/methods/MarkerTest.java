package com.capgemini.objectclass.methods;

public class MarkerTest {

	public static void main(String[] args) throws CloneNotSupportedException {
Marker m = new Marker("Camlin" , 1);
System.out.println("ID is "+m.id);
System.out.println("Name is "+m.name);

System.out.println("---------------------------------");

Object r = m.clone();
Marker k = (Marker) r;
System.out.println("ID is "+k.id);
System.out.println("Name is "+k.name);


	}

}
