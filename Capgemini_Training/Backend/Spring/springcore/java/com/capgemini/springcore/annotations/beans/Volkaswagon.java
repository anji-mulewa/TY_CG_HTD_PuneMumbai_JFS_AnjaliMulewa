package com.capgemini.springcore.annotations.beans;

import com.capgemini.springcore.interfaces.Engine;

public class Volkaswagon implements Engine {

	@Override
	public int getCC() {
		return 1500;
	}

	@Override
	public String getType() {
		return "abcd xyz";
	}

}
