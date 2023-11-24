package com.recursiondemo.main;

import com.recursiondemo.example.Factorial;

public class FactorialMain {

	public static void main(String[] args) {
	
		int ans = Factorial.fact(5);
		
		System.out.println("Factorial of 5 : " + ans);
	}
}
