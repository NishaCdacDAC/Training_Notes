package com.main;

import com.stackops.StackDemo;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int stackSize = scanner.nextInt();

        StackDemo stack = new StackDemo(stackSize);

        System.out.print("Enter the number of inputs (n): ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter input " + (i + 1) + ": ");
            int input = scanner.nextInt();
            stack.push(input);
        }

        System.out.print("Enter the number of elements to remove (k): ");
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            Integer popped = stack.pop();
            if (popped != null) {
                System.out.println("Popped: " + popped);
            }
        }

        stack.push(100);
        stack.push(200);

        System.out.println("Elements left in the stack:");
        stack.displayStack();
    }
}