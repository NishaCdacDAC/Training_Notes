
/*Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array)*/


public class FibonacciSeries 
{
    public static void main(String[] args)
     {
        int n = 10; // Change this value to the desired number of terms
        long[] fibonacciArray = new long[n];

     
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        for (int i = 2; i < n; i++) 
        {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

     
        System.out.println("Fibonacci Series up to the " + n + "th term:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(fibonacciArray[i] + " ");
        }
    }
}
