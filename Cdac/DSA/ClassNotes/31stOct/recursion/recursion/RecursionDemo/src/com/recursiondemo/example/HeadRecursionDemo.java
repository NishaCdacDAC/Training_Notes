package com.recursiondemo.example;

public class HeadRecursionDemo {

	public static void doThis(int x) {
		
		if(x > 0) {
			doThis(x - 1);
			System.out.println(x);
		}
	}
}
