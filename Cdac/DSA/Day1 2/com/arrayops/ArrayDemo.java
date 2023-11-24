package com.arrayops;

import java.util.Scanner;

public class ArrayDemo {
    private int[] array = new int[10];
    private int size = 0;

    public void acceptValue(int value) {
        if (size < array.length) {
            array[size] = value;
            size++;
            System.out.println("Value " + value + " added to the array.");
        } else {
            System.out.println("Array is full. Cannot add more values.");
        }
    }

    public void traverseArray() {
        System.out.println("Traversing the array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}