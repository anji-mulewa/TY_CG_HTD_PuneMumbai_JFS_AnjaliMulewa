package com.capgemini.array.generic;
interface Message{
	void gm();
}
public class LambdaGm {
public static void main(String[] args) {
	Message g= ()-> System.out.println("Good morning");
g.gm();
}
}
