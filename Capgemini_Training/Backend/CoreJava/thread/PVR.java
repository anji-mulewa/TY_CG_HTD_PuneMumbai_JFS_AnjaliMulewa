package com.capgemini.thread;

public class PVR {
	synchronized void confirm() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				wait();
				Thread.sleep(1000);
				System.out.println("Notify called in for");
				notify();
			
/*
*0
0
Notify called using leaveMe
Notify called in for
1
Notify called in for
1
Notify called in for
2
Notify called in for
2
Notify called in for
3
Notify called in for
3
Notify called in for
4
Notify called in for
4
Notify called in for
Notify called in for
				 */


			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void leaveMe() {
		System.out.println("Notify called using leaveMe");
		notify();
	}
}
