package com.recursiondemo.main;

public class AppMain2 {

	public static void main(String[] args) {
		
		int x = 2;
		show(x);
	}
	
	static void show(int n) {
		
		if(n == 0)
		return;
		
		System.out.println("before recursive call , "
				+ "show() called with parameter : " + n);
		show(n-1);	//recursive call
		System.out.println("after completing recursive call , "
				+ "show() called with parameter : " + n);
	}
}
