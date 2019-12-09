package com.capgemini.array.generic;

public class TestG {
public static void main(String[] args) {
int[] i = Abc();
for(int k : i) {
	System.out.println(k);
}
}
static int[] Abc() {
	int a[]= {10,20,40,278};
	return a;
}

}
