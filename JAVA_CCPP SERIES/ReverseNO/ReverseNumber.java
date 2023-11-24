public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123456;
        int reversed = reverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversed);
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Add the digit to the reversed number
            number = number / 10; // Remove the last digit from the original number
        }
        return reversed;
    }
}