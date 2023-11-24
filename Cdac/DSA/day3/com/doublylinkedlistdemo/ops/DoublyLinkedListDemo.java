package com.doublylinkedlistdemo.ops;

public class DoublyLinkedListDemo {

    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfterLastNode(int data) {
        if (tail == null) {
            System.out.println("List is empty. Cannot insert after the last node.");
            return;
        }
        Node newNode = new Node(data);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null; // List becomes empty
                    }
                } else {
                    current.prev.next = current.next;
                    if (current != tail) {
                        current.next.prev = current.prev;
                    } else {
                        tail = current.prev;
                    }
                }
                System.out.println("Deleted " + data + " from the list.");
                return;
            }
            current = current.next;
        }
        System.out.println("Node with data " + data + " not found in the list.");
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}