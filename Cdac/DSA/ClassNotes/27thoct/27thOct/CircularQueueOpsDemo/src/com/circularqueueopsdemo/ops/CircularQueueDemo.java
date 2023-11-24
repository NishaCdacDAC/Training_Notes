package com.circularqueueopsdemo.ops;

public class CircularQueueDemo {

	private int[] arr;
	private int capacity;
	private int front,rear;
	
	public CircularQueueDemo(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front = rear = -1;
	}
	
	public boolean isQueueFull() {
		if((rear + 1) % capacity == front)
			return true;
		else
			return false;
	}
	
	public boolean isQueueEmpty() {
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}
	
	public void traverseQueue() {
		int i;
		
		if(isQueueEmpty()) {
			System.out.println("queue is empty , can not be traversed");
			return;
		}
		
		for(i = front ; i != rear ; i = (i + 1) % capacity) {
			System.out.print(arr[i] + " ");
		}
		
			System.out.print(arr[i]);
		
		System.out.println();
	}
	
	public void enqueue(int element) {
		if(isQueueFull()) {
			System.out.println("queue is full , can not enqueue an element");
			return;
		}
			
		if(isQueueEmpty()) {
			front = rear = 0;
			arr[rear] = element;
			System.out.println("This is the 1st element added in the queue");
			return;
		}
		
		rear = (rear + 1) % capacity;
		arr[rear] = element;
		System.out.println("element enqueued");
	}
	
	public Integer dequeue() {
		if(isQueueEmpty()) {
			System.out.println("queue is empty , can not dequeue");
			return null;
		}
		
		if(front == rear) {
			int element = arr[front];
			front = rear = -1;
			return element;
		}
		
		int element = arr[front];
		front = (front + 1) % capacity;
		return element;
	}
}









