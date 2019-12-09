package com.capgemini.objectclass.methods;

public class ProductTest {

	public static void main(String[] args) {
Product p1 = new Product();
p1.id=1;
p1.brand="LG";
p1.cost=24500;
p1.name="Abc";
p1.type="LED";

Product p2 = new Product();
p2.id=1;
p2.brand="LG";
p2.cost=24500;
p2.name="Abc";
p2.type="LED";

boolean res= p1.equals(p2);
System.out.println(res);


	}

}
