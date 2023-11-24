package com.circularqueueopsdemo.main;

import com.circularqueueopsdemo.ops.CircularQueueDemo;

public class AppMain {

	public static void main(String[] args) {
	
		CircularQueueDemo obj = new CircularQueueDemo(5);
		
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		
		System.out.println("Current queue of elements is :- ");
		obj.traverseQueue();
		
		obj.enqueue(60);
		
		System.out.println("result of dequeue :- " + obj.dequeue());
		System.out.println("result of dequeue :- " + obj.dequeue());
		
		System.out.println("Current queue of elements is :- ");
		obj.traverseQueue();
		
		obj.enqueue(80);
		System.out.println("Current queue of elements is :- ");
		obj.traverseQueue();
		
		obj.enqueue(90);
		System.out.println("Current queue of elements is :- ");
		obj.traverseQueue();
		
		obj.enqueue(100);
	}
}
