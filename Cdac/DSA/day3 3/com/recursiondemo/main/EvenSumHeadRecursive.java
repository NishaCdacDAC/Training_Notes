package com.recursiondemo.main;

public class EvenSumHeadRecursive {
    public static void main(String[] args) {
        int n = 10;
        int sum = calculateSumOfFirstNEvens(n);
        System.out.println("The sum of the first " + n + " even numbers is: " + sum);
    }

    static int calculateSumOfFirstNEvens(int n) {
        if (n == 1) {
            return 2; // Base case: The first even number is 2.
        }

        int currentEven = 2 * n;
        int previousSum = calculateSumOfFirstNEvens(n - 1);

        return currentEven + previousSum;
    }

}
