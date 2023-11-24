package com.recursiondemo.example;

public class SumOfNNaturalNumbers {

	public static int sum(int n) {
		if(n == 0)
			return 0;
		else
			return sum(n - 1) + n;
	}
}
