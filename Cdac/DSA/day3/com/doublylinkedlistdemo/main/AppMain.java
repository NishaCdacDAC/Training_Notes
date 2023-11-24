package com.doublylinkedlistdemo.main;

import com.doublylinkedlistdemo.ops.DoublyLinkedListDemo;

public class AppMain {
    public static void main(String[] args) {
        DoublyLinkedListDemo list = new DoublyLinkedListDemo();

        list.insertAtEnd(100);
        list.insertAtEnd(200);
        list.insertAtEnd(300);

        System.out.println("Current elements in the list:");
        list.displayList();

        list.insertAfterLastNode(400);
        System.out.println("Updated list after inserting 400:");
        list.displayList();

        list.deleteNode(400);
        list.deleteNode(400); // Attempt to delete 400 again
        System.out.println("Updated list after deleting 400:");
        list.displayList();

        list.deleteNode(200);
        System.out.println("Current elements present in the list:");
        list.displayList();
    }
}