package com.doublylinkedlistopsdemo.ops;

public class DoublyLinkedListDemo {

	private Node head;
	
	private class Node {
		private int data;
		private Node prev , next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void traverseList() {
		if(head == null) {
			System.out.println("list is empty , can not show elements");
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
	
	public void traverseListInReverse() {
		if(head == null) {
			System.out.println("list is empty , can not show elements");
			return;
		}
		
		if(head.next == null) {
			System.out.println(head.data);
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		
		System.out.println();
	}
	
	public void addNodeAtEnd(int element) {
		
		Node n = new Node(element);
		
		if(head == null) {
			head = n;
			System.out.println("This is 1st node added in the list");
			return;
		}
		
		if(head.next == null) {
			head.next = n;
			n.prev = head;
			System.out.println("new node added at end of the list");
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = n;
		n.prev = temp;
		System.out.println("new node added at end of the list");
		return;
	}
	
	public void addNodeAfterGivenNode(int existing_element , int new_element) {
		
		if(head == null) {
			System.out.println("list is empty , can not perform this operation");
			return;
		}
		
		Node n = new Node(new_element);
		
		if(head.data == existing_element && head.next == null) {
			head.next = n;
			n.prev = head;
			System.out.println("node added after the given node");
			return;
		}
		
		Node temp = head;
		while(temp != null && temp.data != existing_element) {
			temp = temp.next;
		}
		
		if(temp != null && temp.next == null) {
			temp.next = n;
			n.prev = temp;
			System.out.println("node added after the last node");
			return;
		}
		
		if(temp != null) {
			n.next = temp.next;
			temp.next.prev = n;
			temp.next = n;
			n.prev = temp;
			System.out.println("node added after the given node");
			return;
		}
		
		System.out.println("no such node with given element was found");
	}
	
	
	public void deleteGivenNode(int existing_element) {
		
		//if list is empty
		if(head == null) {
			System.out.println("list is empty , can not perform delete operation");
			return;
		}
		
		//if existing_element is at head node and head node is the only node in the list
		if(head.data == existing_element && head.next == null) {
			head = null;
			System.out.println("head node deleted");
			return;
		}
		
		//if existing_element is at head node and other nodes are also present in the list
		if(head.data == existing_element) {
			head = head.next;
			head.next.prev = null;
			System.out.println("node present after the given node is deleted");
			return;
		}
		
		Node temp = head;
		while(temp != null && temp.data != existing_element) {
			temp = temp.next;
		}
		
		//if existing_element is at last node
		if(temp != null && temp.next == null) {
			temp.prev.next = null;
			temp.prev = null;
			System.out.println("the last node was deleted");
			return;
		}
		
		//if existing_element is at some other nodes in the list
		if(temp != null) {
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			System.out.println("node present after the given node is deleted");
			return;
		}
		
		System.out.println("no such node with given element was found");
	}
}












