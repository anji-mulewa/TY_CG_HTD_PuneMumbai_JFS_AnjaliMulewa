package com.capgemini.array.generic;

interface Area {
	double areaOfCircle(double r);
}

public class AreaOfCircleTest {

	public static void main(String[] args) {
		Area a = r -> r * r * 3.142;
		double res = a.areaOfCircle(2.4);
		System.out.println("area of circle is " + res);
	}

}
