package com.recursiondemo.example;

public class TreeRecursionDemo {

	public static void doThis(int x) {
		
		if(x > 0) {
			System.out.println(x);
			doThis(x - 1);
			doThis(x - 1);
		}
	}
}
