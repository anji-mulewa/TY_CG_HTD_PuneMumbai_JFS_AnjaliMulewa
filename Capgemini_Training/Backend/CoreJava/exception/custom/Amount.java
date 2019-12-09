package com.capgemini.exception.custom;

public class Amount {
void check(int val) throws InvalidLimitException {
	if(val>40000) {
		throw new InvalidLimitException();
	}
}
}
