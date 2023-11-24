package com.recursiondemo.example;

public class IndirectRecursionDemo {

	public static void method1(int x) {
		
		if(x > 0) {
			System.out.println(x);
			method2(x - 1);
		}
	}
	
	public static void method2(int x) {
		
		if(x > 0) {
			System.out.println(x);
			method1(x/2);
		}
	}
}
