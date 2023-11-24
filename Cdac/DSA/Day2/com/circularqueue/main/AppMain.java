package com.circularqueue.main;
import com.circularqueue.ops.CircularQueue;

public class AppMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        // Add elements to the queue
        queue.enqueue(10);
        queue.enqueue(25);
        queue.enqueue(38);
        queue.enqueue(45);
        queue.enqueue(60);

        // Display current elements
        queue.displayElements();

        // Add 70 to the queue
        queue.enqueue(70);

        // Remove 2 elements and display the elements
        queue.dequeue();
        queue.dequeue();
        queue.displayElements();

        // Add 90 to the queue and display the elements
        queue.enqueue(90);
        queue.displayElements();
    }
}