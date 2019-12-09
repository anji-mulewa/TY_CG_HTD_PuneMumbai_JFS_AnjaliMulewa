package com.capgemini.studentapp.qspiders;

import com.capgemini.studentapp.jspiders.Angular;
import com.capgemini.studentapp.jspiders.React;

public class TestA {

	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQTP();
		Selenium s = new Selenium();
		s.teachSelenium();
		Angular a = new Angular();
		a.teachAngular();
		React r = new React();
		r.teachReact();
	}

}
