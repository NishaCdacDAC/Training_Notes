public class ExponentRecursion {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 6;
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static int power(int base, int exponent) {
        // Base case: 3^0 is 1
        if (exponent == 0) {
            return 1;
        } else {
            // Recursive case: 3^n = 3 * 3^(n-1)
            return base * power(base, exponent - 1);
        }
    }
}