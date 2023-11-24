package com.stackopsdemo.main;

import com.stackopsdemo.ops.StackDemo;

public class AppMain {

	public static void main(String[] args) {

		StackDemo obj = new StackDemo(5);
		
		obj.push(1233);
		obj.push(6500);
		obj.push(678);
		obj.push(789);
		obj.push(345);
		//obj.push(123);
		
		System.out.println("All elements from the stack are :- ");
		obj.displayStack();
		
		System.out.println("result of pop() : " + obj.pop());
		System.out.println("result of pop() : " + obj.pop());
		System.out.println("result of pop() : " + obj.pop());
		System.out.println("result of pop() : " + obj.pop());
		System.out.println("result of pop() : " + obj.pop());
		
		System.out.println("result of pop() : " + obj.pop());
	}
}
