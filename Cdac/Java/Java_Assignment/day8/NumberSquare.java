/*Write a program in java to read a number from user. If number is less than 10 and greater than 50 it generate the exception out of range. Else it displays the square of number.*/

import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class NumberSquare {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            displaySquare(number);
        } catch (OutOfRangeException e) {
            System.err.println("Out of Range: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid number.");
        }
    }

    public static void displaySquare(int number) throws OutOfRangeException {
        if (number < 10 || number > 50) {
            throw new OutOfRangeException("Number is out of range (less than 10 or greater than 50).");
        }

        int square = number * number;
        System.out.println("Square of the number: " + square);
    }
}

