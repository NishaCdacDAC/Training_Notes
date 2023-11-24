package com.recursiondemo.example;

public class NestedDemo {

	public static int method(int n) {
		
		if(n > 50)
			return n - 10;
		else
			return method(method(n + 11));
	}
}
