package com.arrayops;

public class ArrayDemo {
    private int[] array;

    public ArrayDemo(int size) {
        array = new int[size];
    }

    public void insertValue(int position, int value) {
        if (position < 0 || position >= array.length) {
            System.out.println("Invalid position. Element not inserted.");
        } else {
            array[position] = value;
            System.out.println("Value " + value + " inserted at position " + position);
        }
    }

    public void deleteElement(int position) {
        if (position < 0 || position >= array.length) {
            System.out.println("Invalid position. Element not deleted.");
        } else {
            array[position] = 0;
            System.out.println("Element at position " + position + " deleted.");
        }
    }

    public void deleteValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                array[i] = 0;
                System.out.println("Value " + value + " deleted from the array.");
            }
        }
    }

    public void traverseArray() {
        System.out.println("Traversing the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}