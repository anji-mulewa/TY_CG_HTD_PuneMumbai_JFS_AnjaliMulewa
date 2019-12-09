package com.capgemini.corejava.casting;

public class UpDownCasting {

	public static void main(String[] args) {
		Pen p = new Marker(); // up casting-> parent reference to child object
		Marker m = (Marker) p; // down casting
		m.cost = 110;
		m.write();
		m.size = 1.2;
		m.color();

	}

}
