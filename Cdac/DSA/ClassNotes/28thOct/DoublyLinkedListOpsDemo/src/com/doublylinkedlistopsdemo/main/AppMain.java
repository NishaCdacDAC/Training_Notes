package com.doublylinkedlistopsdemo.main;

import com.doublylinkedlistopsdemo.ops.DoublyLinkedListDemo;

public class AppMain {

	public static void main(String[] args) {
	
		DoublyLinkedListDemo obj = new DoublyLinkedListDemo();
		obj.addNodeAtEnd(10);
		obj.addNodeAtEnd(20);
		obj.addNodeAtEnd(30);
		obj.addNodeAtEnd(40);
		
		System.out.println("Current elements present in the list are : ");
		obj.traverseList();
		
//		System.out.println("Current elements present in the list in reverse direction are : ");
//		obj.traverseListInReverse();

		obj.addNodeAfterGivenNode(40, 50);
		
		System.out.println("Now , current elements present in the list are : ");
		obj.traverseList();
		
		obj.deleteGivenNode(100);
		
		obj.deleteGivenNode(50);
		System.out.println("Now , current elements present in the list are : ");
		obj.traverseList();
		
		obj.deleteGivenNode(30);
		System.out.println("Now , current elements present in the list are : ");
		obj.traverseList();
		
		obj.deleteGivenNode(10);
		System.out.println("Now , current elements present in the list are : ");
		obj.traverseList();
	}
}




