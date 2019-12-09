package com.capgemini.exception.second;

import java.io.File;
import java.io.IOException;

public class Bottle {


public void open() throws IOException , ClassNotFoundException {
	File f = new File("a.txt");
	f.createNewFile();

}
	
}
