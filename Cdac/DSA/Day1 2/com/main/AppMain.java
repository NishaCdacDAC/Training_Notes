package com.main;

import com.arrayops.ArrayDemo;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a value to add to the array: ");
            int value = scanner.nextInt();
            arrayDemo.acceptValue(value);
        }

        arrayDemo.traverseArray();
    }
}