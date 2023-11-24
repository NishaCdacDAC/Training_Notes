package com.linkedlistopsdemo.ops;

public class LinkedListDemo {

	private Node head;
	
	private class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void traverseList() {
		if(head == null) {
			System.out.println("list is empty , can not traverse");
			return;
		}
		
		if(head.next == null) {
			System.out.println(head.data);
			return;
		}
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public void insert(int element) {
		
		Node n = new Node(element);
		
		if(head == null) {
			head = n;
			System.out.println("first node added into the list");
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = n;
		System.out.println("new node added");
	}
	
	public void insert(int existing_element , int new_element) {
		
		if(head == null) {
			System.out.println("list is empty , can not add new node after the"
					+ " given node");
			return;
		}
		
		Node n = new Node(new_element);
		
		Node temp = head;
		
		while(temp != null && temp.data != existing_element) {
			temp = temp.next;
		}
		
		if(temp != null) {
			n.next = temp.next;
			temp.next = n;
			System.out.println("node added after the given node");
			return;
		}
		
		if(temp == null) {
			System.out.println("no such node found , hence the node was not added");
		}
	}
	
	public void deleteByElement(int element) {
		
		if(head == null) {
			System.out.println("list is empty , can not delete an element");
			return;
		}
		
		if(head.data == element) {
			head = head.next;
			System.out.println("node to be deleted was first node , deleted that node");
			return;
		}
		
		Node temp , prev;
		temp = prev = head;
		
		while(temp != null && temp.data != element) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp != null) {
			prev.next = temp.next;
			temp = null;
			System.out.println("deleted the node");
			return;
		}
		
		if(temp == null)
			System.out.println("no such node with given element was found");
	}
}








