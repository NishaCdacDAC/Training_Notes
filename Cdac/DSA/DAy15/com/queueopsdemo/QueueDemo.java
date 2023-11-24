package com.queueopsdemo;

public class QueueDemo {
    private int arr[];
    private int front;
    private int rear;
    private int maxSize;

    public QueueDemo(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
        maxSize = size;
    }

    // Determine whether the queue is empty
    public boolean isQueueEmpty() {
        return rear < front;
    }

    // Determine whether the queue is full
    public boolean isQueueFull() {
        return rear == maxSize - 1;
    }

    // Enqueue an item to the queue
    public void enqueue(int element) {
        if (isQueueFull()) {
            System.out.println("Queue is full, cannot enqueue " + element);
        } else {
            arr[++rear] = element;
            System.out.println("Enqueued " + element + " into the queue.");
        }
    }

    // Dequeue an item from the queue
    public Integer dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return null;
        } else {
            int item = arr[front++];
            return item;
        }
    }
}