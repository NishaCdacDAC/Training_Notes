package com.recursiondemo.head;

public class HeadRecursionDemo {
    public static void main(String[] args) {
        int n = 5;
        headRecursion(n);
    }

    static void headRecursion(int n) {
        if (n == 0) {
            return;
        }
        headRecursion(n - 1); // Recursive call before printing
        System.out.print(n + " ");
    }
}