public class FactorialThread{
    public static void main(String[] args) {
        int number = 6; 

        // Create a thread using a lambda expression
        Thread factorialThread = new Thread(() -> {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        });

        // Start the thread
        factorialThread.start();
    }
}