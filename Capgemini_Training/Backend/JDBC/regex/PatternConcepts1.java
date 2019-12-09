package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts1 {
	static Pattern pat;
	static Matcher mat;
	public static void main(String[] args) {
		pat=Pattern.compile("\\d");
		mat =pat.matcher("1");
		System.out.println("For pattern \\d: "+mat.matches());
		
		pat=Pattern.compile("\\d+");
		mat =pat.matcher("1234");
		System.out.println("For pattern \\d+: "+mat.matches());
		
		pat=Pattern.compile("\\d{0}");
		mat =pat.matcher("");
		System.out.println("For pattern \\d{x}: "+mat.matches());
		mat =pat.matcher("1234567");
		System.out.println("For pattern \\d{x}: "+mat.matches());
		
		
		pat=Pattern.compile("\\d{1,9}"); //it will take minimum of 1 digit and max 9 number of digits 
										 //greater than 9 digits it will return false
		mat =pat.matcher("123456");
		System.out.println("For pattern \\d{x,y}: "+mat.matches());
		mat =pat.matcher("1234567890");//false
		System.out.println("For pattern \\d{x,y}: "+mat.matches());

		pat=Pattern.compile("\\D");
		mat =pat.matcher("a");
		System.out.println("For pattern \\D: "+mat.matches());
		mat =pat.matcher(" ");
		System.out.println("For pattern \\D: "+mat.matches());
		mat =pat.matcher("1");
		System.out.println("For pattern \\D if i/p is a digit: "+mat.matches());

		pat=Pattern.compile("\\D+");
		mat =pat.matcher("abBc");
		System.out.println("For pattern \\D+: "+mat.matches());
		mat =pat.matcher(" ");
		System.out.println("For pattern \\D+ it takes single space also: "+mat.matches());

		pat=Pattern.compile("\\s");
		mat =pat.matcher(" ");
		System.out.println("For pattern \\s it takes only single space: "+mat.matches());

		pat=Pattern.compile("\\s+");
		mat =pat.matcher("   ");
		System.out.println("For pattern \\s it takes only multiple space: "+mat.matches());

		pat=Pattern.compile("\\S");
		mat =pat.matcher("@");
		System.out.println("For pattern \\S takes anything other than space(only single char): "+mat.matches());

		pat=Pattern.compile("\\S+");
		mat =pat.matcher("abc");
		System.out.println("For pattern \\S+ takes anything other than space(any number of char): "+mat.matches());

		pat=Pattern.compile("\\w");
		mat =pat.matcher("a");
		System.out.println("For pattern \\w represents single character: "+mat.matches()); // it does not represents space and special char

		pat=Pattern.compile("\\w+");
		mat =pat.matcher("abc");
		System.out.println("For pattern \\w represents multiple characters: "+mat.matches()); // it does not represents space and special char		
		
		pat=Pattern.compile("\\W");
		mat =pat.matcher("@");
		System.out.println("For pattern \\W represents (single char) anything other than char: "+mat.matches()); // it does not represent char

		pat=Pattern.compile("\\W+");
		mat =pat.matcher(" ");
		System.out.println("For pattern \\W+ represents (Multiple) anything but character: "+mat.matches()); // it does not represent char
		
	}
}
