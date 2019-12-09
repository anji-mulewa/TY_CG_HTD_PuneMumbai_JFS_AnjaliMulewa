package com.capgemini.exception.second;

import java.io.File;
import java.io.IOException;

public class IOExceptionExample {
public static void main(String[] args) {
	System.out.println("Main started");
	File f = new File("anji.txt");
	File f1= new File("R:/anji1.txt");
	try {
		f.createNewFile();
		System.out.println("file created");
		f1.createNewFile();
	}
	catch(IOException e) {
		System.out.println("Sorry not able to create the file");
	}
	System.out.println("main ended");
}
}
