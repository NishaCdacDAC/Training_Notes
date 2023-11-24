package com.recursiondemo.tail;

public class TailRecursionDemo {
    public static void main(String[] args) {
        int n = 5;
        tailRecursion(n, 1);
    }

    static void tailRecursion(int n, int current) {
        if (current > n) {
            return;
        }
        System.out.print(current + " "); // Print before the recursive call
        tailRecursion(n, current + 1);
    }
}