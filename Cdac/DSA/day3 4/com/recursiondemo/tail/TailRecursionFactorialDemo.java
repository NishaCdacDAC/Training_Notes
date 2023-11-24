package com.recursiondemo.tail;

public class TailRecursionFactorialDemo {
    public static void main(String[] args) {
        int n = 5;
        int factorial = calculateFactorialTailRecursion(n, 1);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    static int calculateFactorialTailRecursion(int n, int result) {
        if (n == 0) {
            return result; // Base case: Return the accumulated result.
        }
        return calculateFactorialTailRecursion(n - 1, n * result);
    }
}