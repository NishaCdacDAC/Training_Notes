public class NumberPrinter implements Runnable {
    private final int threadNumber;

    public NumberPrinter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + threadNumber + ": " + i);
        }
    }

    public static void main(String[] args) {
        int numThreads = 5; // You can change this to the number of threads you want
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new NumberPrinter(i + 1));
            threads[i].start();
        }

        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join(); // Wait for all threads to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
