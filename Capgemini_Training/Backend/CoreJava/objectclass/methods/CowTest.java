package com.capgemini.objectclass.methods;

public class CowTest {

	public static void main(String[] args) {
Cow c = new Cow();
c.id=1;
c.name = "Ganga";

Cow d = new Cow();
d.id = 2;
d.name = "Tunga";

Cow e = new Cow();
e.id = 1;
e.name = "Ganga";

boolean result = c.equals(e);
System.out.println(result);
	}

}
