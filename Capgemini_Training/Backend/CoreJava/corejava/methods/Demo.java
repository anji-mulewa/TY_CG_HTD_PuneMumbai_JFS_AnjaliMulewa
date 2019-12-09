package com.capgemini.corejava.methods;

public class Demo {
static Methods me1= new Methods();
Methods me2= new Methods();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods me = new Methods();
		Demo d1=new Demo();
		System.out.println(me);
		System.out.println(me1);
		//System.out.println(me2); cannot use non static inside static
		System.out.println(Methods.areaOfSquare(10));
		System.out.println(d1.me2.areaOfRectangle(10, 20));
		System.out.println(me1.areaOfRectangle(10, 20));
		int r=me.y;
		System.out.println(r);
	}

}
