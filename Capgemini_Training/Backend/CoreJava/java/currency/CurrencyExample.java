package com.capgemini.java.currency;

import java.util.Currency;
import java.util.Set;

public class CurrencyExample {
	public static void main(String[] args) {

		Currency currencyCode1 = Currency.getInstance("INR");
		Currency currencyCode2 = Currency.getInstance("USD");

		String currencyCode1Symbol = currencyCode1.getSymbol();
		String currencyCode2Symbol = currencyCode2.getSymbol();

		System.out.println("Symbol for INR: " + currencyCode1Symbol);
		System.out.println("Symbol for USD: " + currencyCode2Symbol);
		System.out.println("--------------------");

		String currencyCode1DisplayName = currencyCode1.getDisplayName();
		String currencyCode2DisplayName = currencyCode2.getDisplayName();

		System.out.println("Display name for INR: " + currencyCode1DisplayName);
		System.out.println("Display name for USD: " + currencyCode2DisplayName);
		System.out.println("-----------------------");

		Set<Currency> currencies = Currency.getAvailableCurrencies();
		System.out.println(currencies);
		System.out.println("--------------");
		
		int currencyCode1DefaultFraction = currencyCode1.getDefaultFractionDigits();
		int currencyCode2DefaultFraction = currencyCode2.getDefaultFractionDigits();
		System.out.println("Default fraction digits for INR: "+currencyCode1DefaultFraction);
		System.out.println("Default fraction digits for USD: "+currencyCode2DefaultFraction);
		System.out.println("-----------------------");
	}

}
