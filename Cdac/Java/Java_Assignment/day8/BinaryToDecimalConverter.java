
/*Write a program to read a binary number and convert it to decimal number. 
Throw user defined exception named InvalidBinaryException if the number entered is not binary. */

import java.util.Scanner;

class InvalidBinaryException extends Exception {
    public InvalidBinaryException(String message) {
        super(message);
    }
}

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a binary number: ");
            String binaryString = scanner.nextLine();
            int decimalNumber = convertBinaryToDecimal(binaryString);
            System.out.println("Decimal equivalent: " + decimalNumber);
        } catch (InvalidBinaryException e) {
            System.err.println("Invalid binary input: " + e.getMessage());
        }
    }

    public static int convertBinaryToDecimal(String binary) throws InvalidBinaryException {
        // Check if the input string contains only 0s and 1s
        if (!binary.matches("[01]+")) {
            throw new InvalidBinaryException("Input contains non-binary characters.");
        }

        int decimalNumber = 0;
        int binaryLength = binary.length();

        // Convert binary to decimal using the place value
        for (int i = binaryLength - 1, power = 0; i >= 0; i--, power++) {
            char digit = binary.charAt(i);
            int bit = Character.getNumericValue(digit);
            decimalNumber += bit * Math.pow(2, power);
        }

        return decimalNumber;
    }
}

