package com.arrayops;

public class ArrayOperations {
    public void traverseArray(int[] array, int size) {
        System.out.println("Traversing the array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void insertSorted(int[] array, int size, int numberToInsert) {
        int i = size - 1;

        // Shift elements to the right to make room for the new element
        while (i >= 0 && array[i] > numberToInsert) {
            array[i + 1] = array[i];
            i--;
        }

        // Insert the new element
        array[i + 1] = numberToInsert;
    }
}