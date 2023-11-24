package com.arrayopsdemo.entity;

public class ArrayDemo {

	private int[] arr;
	private int size_of_array;
	
	public ArrayDemo(int[] arr , int size_of_array) {
		this.arr = arr;
		this.size_of_array = size_of_array;
	}
	
	public boolean isArrayEmpty() {
		if(size_of_array == 0)
			return true;
		else
			return false;
	}
	
	public boolean isArrayFull() {
		if(size_of_array == arr.length)
			return true;
		else
			return false;
	}
	
	public void traverseArray() {
		
		if(isArrayEmpty()) {
			System.out.println("Array is empty , can not show elements");
			return;
		}
		
		for(int i = 0 ; i < size_of_array ; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
	public void addNewElement(int element , int position) {
		
		if(position <= 0 || position > arr.length) {
			System.out.println("invalid position entered");
			return;
		}
		
		if(isArrayFull()) {
			System.out.println("Array is full , can not add new element");
			return;
		}
		
		for(int i = size_of_array - 1 ; i >= position - 1 ; i--) {
			arr[i+1] = arr[i];
		}
		
		arr[position - 1] = element;
		size_of_array++;
	}
	
	public void deleteElement(int position) {
		
		if(position <= 0 || position > arr.length) {
			System.out.println("invalid position entered");
			return;
		}
		
		if(isArrayEmpty()) {
			System.out.println("Array is empty , can not delete element");
			return;
		}
		
		for(int i = position - 1 ; i < size_of_array ; i++) {
			arr[i] = arr[i + 1];
		}
		
		size_of_array--;
	}
}











