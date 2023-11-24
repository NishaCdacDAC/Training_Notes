package com.arrayopsdemo.main;

import com.arrayopsdemo.entity.ArrayDemo;

public class AppMain {

	public static void main(String[] args) {
	
		int[] myarr = {10,20,30,40,50,0,0,0,0,0};
		ArrayDemo obj = new ArrayDemo(myarr,5);
		
		System.out.println("Current elements in the array : ");
		obj.traverseArray();
		
		obj.addNewElement(25, 3);
		System.out.println("After adding a new element , now elements"
				+ " in the array are :- ");
		obj.traverseArray();
		
		obj.addNewElement(35, 1);
		System.out.println("After adding a new element , now elements"
				+ " in the array are :- ");
		obj.traverseArray();
		
		obj.deleteElement(7);
		System.out.println("After deleting an element , now elements"
				+ " in the array are :- ");
		obj.traverseArray();
	}
}
