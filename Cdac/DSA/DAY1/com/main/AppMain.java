package com.main;

import com.arrayops.ArrayOperations;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 0, 0, 0, 0, 0, 0};
        int size = 4; // Initial size

        ArrayOperations arrayOps = new ArrayOperations();
        arrayOps.traverseArray(array, size);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to insert in sorted order: ");
        int numberToInsert = scanner.nextInt();

        arrayOps.insertSorted(array, size, numberToInsert);
        size++; // Increase the size after insertion

        System.out.println("Array after insertion:");
        arrayOps.traverseArray(array, size);
    }
}