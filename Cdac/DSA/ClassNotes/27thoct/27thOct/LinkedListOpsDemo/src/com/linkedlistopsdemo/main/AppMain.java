package com.linkedlistopsdemo.main;

import com.linkedlistopsdemo.ops.LinkedListDemo;

public class AppMain {

	public static void main(String[] args) {
	
		LinkedListDemo obj = new LinkedListDemo();
		obj.insert(10);
		obj.insert(20);
		obj.insert(30);
		obj.insert(40);
		
		System.out.println("Current nodes in the list are :- ");
		obj.traverseList();
		
		obj.insert(30, 50);
		System.out.println("Now , current nodes in the list are :- ");
		obj.traverseList();
		
		obj.insert(40, 90);
		System.out.println("Now , current nodes in the list are :- ");
		obj.traverseList();
		
		obj.deleteByElement(10);
		System.out.println("Now , current nodes in the list are :- ");
		obj.traverseList();
	}
}
