package org.tnsif.methodoverloading;

public class MethodOverloadingExecutor {
	public static void main (String[] args) {
	
		MethodOveroadingExample sc = new MethodOveroadingExample();
		System.out.println(sc.multiplication(12, 3));
		System.out.println(sc.multiplication(12.5f, 3.0f));
		System.out.println(sc.multiplication(1.5f, 3));
		System.out.println(sc.multiplication(12, 3.0f));
	}

}
