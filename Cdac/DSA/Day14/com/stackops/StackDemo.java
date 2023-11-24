package com.stackops;

public class StackDemo {
    private int arr[];
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a given size
    public StackDemo(int size) {
        arr = new int[size];
        top = -1; // Initialize the top pointer to -1 (empty stack)
        maxSize = size; // Store the maximum size of the stack
    }

    // Check whether the stack is empty
    public boolean isStackEmpty() {
        return top == -1;
    }

    // Check whether the stack is full
    public boolean isStackFull() {
        return top == maxSize - 1;
    }

    // Push a new item onto the stack
    public void push(int element) {
        if (isStackFull()) {
            System.out.println("Stack is full, cannot push " + element);
        } else {
            top++; // Increment the top pointer
            arr[top] = element; // Add the element to the stack
            System.out.println("Pushed " + element + " onto the stack.");
        }
    }

    // Pop (remove) the item from the top of the stack
    public Integer pop() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return null;
        } else {
            int item = arr[top]; // Get the item from the top of the stack
            top--; // Decrement the top pointer
            return item;
        }
    }

    // Display the elements in the stack
    public void displayStack() {
        if (isStackEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Elements in the stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}