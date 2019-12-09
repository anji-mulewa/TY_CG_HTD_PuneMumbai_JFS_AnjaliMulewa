package com.capgemini.thread;

public class PVRTest {
public static void main(String[] args) {
	PVR a = new PVR();
	
	Paytm t1 = new Paytm(a);
	t1.start();
	
	Paytm t2 = new Paytm(a);
	t2.start();
	
	a.leaveMe();
}
}

//o/p is :
/*
0
0
Notify called
1

 */
