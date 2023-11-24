package com.recursiondemo.main;

public class AppMain {

	public static void main(String[] args) {

		print(1);
		System.out.println("main() ends here");
	}
	
	static void print(int n) {
		
		if(n <= 3) {
			System.out.println(n);
			print(n+1);
		}
	}
}
