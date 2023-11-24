package com.queueopsdemo.main;

import com.queueopsdemo.ops.QueueDemo;

public class QueueMain {

	public static void main(String[] args) {
	
		QueueDemo obj = new QueueDemo(4);
		
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		
		System.out.println("All elements in the queue are :- ");
		obj.displayQueue();
		
		System.out.println("Result of dequeue operation : " + 
		obj.dequeue());
		
		System.out.println("Now , all elements in the queue are :- ");
		obj.displayQueue();
		
		System.out.println("Result of dequeue operation : " + 
		obj.dequeue());
				
		System.out.println("Now , all elements in the queue are :- ");
		obj.displayQueue();
		
		System.out.println("total elements in the queue : " + 
		obj.count());
		
		System.out.println("result of peek() : " + obj.peek());
		
		obj.dequeue();
		obj.dequeue();
		
		System.out.println("Now , result of peek() : " + obj.peek());
	}
}
