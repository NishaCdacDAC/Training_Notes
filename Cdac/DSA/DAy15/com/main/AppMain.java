package com.main;

import com.queueopsdemo.QueueDemo;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int queueSize = scanner.nextInt();

        QueueDemo queue = new QueueDemo(queueSize);

        System.out.println("Enter 5 inputs to enqueue:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Input " + (i + 1) + ": ");
            int input = scanner.nextInt();
            queue.enqueue(input);
        }

        System.out.print("Enter the number of elements to dequeue: ");
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            Integer dequeued = queue.dequeue();
            if (dequeued != null) {
                System.out.println("Dequeued: " + dequeued);
            }
        }

        System.out.println("Enter more elements to enqueue:");
        while (!queue.isQueueFull()) {
            System.out.print("Input: ");
            int input = scanner.nextInt();
            queue.enqueue(input);
        }

        System.out.println("Dequeue all the items from the queue:");
        while (!queue.isQueueEmpty()) {
            Integer dequeued = queue.dequeue();
            if (dequeued != null) {
                System.out.println("Dequeued: " + dequeued);
            }
        }
    }
}