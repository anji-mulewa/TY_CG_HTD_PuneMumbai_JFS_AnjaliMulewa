package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts {
static Pattern pattern;
static Matcher matcher;
public static void main(String[] args) {
	pattern = Pattern.compile("\\d"); //can only take string input arguments
	matcher = pattern.matcher("1");
//	matcher=pattern.matcher("12345279");//will return false
	System.out.println("pattern \\d: "+matcher.matches()); 

	pattern = Pattern.compile("\\d+"); //can only take string input arguments and 
									   //matches i/p for more than one digit
//	matcher = pattern.matcher("1"); // will return true
	matcher=pattern.matcher("12345279"); // will return true 
	System.out.println("pattern \\d: "+matcher.matches());

	pattern = Pattern.compile("\\D"); //can only take string input arguments
	matcher = pattern.matcher("Abcde");//false
//	matcher=pattern.matcher("12345279");//will return true
	System.out.println("pattern \\D: "+matcher.matches()); 
	
	pattern = Pattern.compile("\\w"); // to check for single character that also includes digits
//	matcher = pattern.matcher("1"); // will rewturn true
	matcher = pattern.matcher("A");
	System.out.println("pattern \\w: "+matcher.matches());

	pattern = Pattern.compile("\\w+"); // to check for single character that also includes digits
//	matcher = pattern.matcher("1"); // will return true
	matcher = pattern.matcher("QWERTY");
	System.out.println("pattern \\w: "+matcher.matches());
	
	pattern = Pattern.compile("\\W+"); 
//	matcher = pattern.matcher("1"); // will return true
	matcher = pattern.matcher("");
	System.out.println("pattern \\W+: "+matcher.matches());
	
	
}
}
