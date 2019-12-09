package com.capgemini.thread;

public class TestA {
public static void main(String[] args) {

	System.out.println("main started");
	Pen p = new Pen();
	p.setDaemon(true);
	p.start();
		/*
		 * try { p.join(); } catch (InterruptedException e) { e.printStackTrace(); }
		 */
	Pen t= new Pen();
	t.setDaemon(true);
	t.start();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	/*
		 * try { t.join(); } catch (InterruptedException e) { e.printStackTrace(); }
		 */	
	System.out.println("Main ended");
}
}
