package com.circularqueue.ops;

public class CircularQueue { 
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        size = capacity;
        queue = new int[size];
        front = rear = -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + element);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else if (rear == size - 1) {
                rear = 0;
            } else {
                rear++;
            }
            queue[rear] = element;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // You can choose a different error value if needed.
        } else {
            int removedElement = queue[front];
            if (front == rear) {
                front = rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front++;
            }
            return removedElement;
        }
    }

    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Current elements in the queue: ");
            int i = front;
            do {
                System.out.print(queue[i] + " ");
                if (i == rear && rear != size - 1) {
                    break;
                }
                if (i == size - 1) {
                    i = 0;
                } else {
                    i++;
                }
            } while (i != (rear + 1) % size);
            System.out.println();
        }
    }
}