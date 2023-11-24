package com.recursiondemo.example;

public class TailRecursionDemo {

	public static void doThis(int x) {
		
		if(x > 0) {
			System.out.println(x);
			doThis(x - 1);
		}
	}
}
