class PrimeNumberThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        int num = 2;

        while (count < 25) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime: " + num);
                count++;
            }

            num++;
        }
    }
}

class FibonacciNumberThread extends Thread {
    @Override
    public void run() {
        int n = 50;
        long[] fibonacci = new long[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.println("Fibonacci: " + fibonacci[i]);

            if (i == 25) {
                try {
                    System.out.println("Fibonacci thread sleeping...");
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        PrimeNumberThread primeThread = new PrimeNumberThread();
        FibonacciNumberThread fibonacciThread = new FibonacciNumberThread();

        primeThread.start();
        fibonacciThread.start();
    }
}
