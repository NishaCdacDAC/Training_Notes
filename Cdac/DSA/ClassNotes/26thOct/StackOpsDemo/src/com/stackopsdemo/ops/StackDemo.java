package com.stackopsdemo.ops;

public class StackDemo {

	private int arr[];
	private int top;
	
	public StackDemo(int size) {
		arr = new int[size];
		top = -1;
	}
	
	public boolean isStackEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isStackFull() {
		if(top == arr.length - 1)
			return true;
		else
			return false;
	}
	
	public Integer peek() {
		if(isStackEmpty()) {
			System.out.println("Stack is empty , can not perform peek operation");
			return null;
		}
		
		return arr[top];
	}
	
	public void displayStack() {
		if(isStackEmpty()) {
			System.out.println("Stack is empty , can not display elements");
			return;
		}
		
		for(int i = top ; i >= 0 ; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public int count() {
		if(isStackEmpty())
			return 0;
		
		return top + 1;
	}
	
	public void push(int element) {
		
		if(isStackFull()) {
			System.out.println("Stack is full , can not push an element");
			return;
		}
		
		top++;
		arr[top] = element;
		System.out.println("element pushed onto the Stack");
	}
	
	public Integer pop() {
		
		if(isStackEmpty()) {
			System.out.println("Stack is empty , can not pop an element from the Stack");
			return null;
		}
		
		int item = arr[top];
		top--;
		return item;
	}
}









