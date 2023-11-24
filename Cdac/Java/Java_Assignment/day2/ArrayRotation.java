import java.util.Scanner;

public class ArrayRotation 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of positions to rotate left: ");
        int rotateLeftBy = scanner.nextInt();
        rotateLeft(arr, rotateLeftBy);

        System.out.print("Enter the number of positions to rotate right: ");
        int rotateRightBy = scanner.nextInt();
        rotateRight(arr, rotateRightBy);

        System.out.println("Array after rotation:");
        printArray(arr);

        scanner.close();
    }

    public static void rotateLeft(int[] arr, int rotateBy) 
    {
        int n = arr.length;
        rotateBy %= n; // Ensure rotateBy is within the array size
        reverse(arr, 0, rotateBy - 1);
        reverse(arr, rotateBy, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void rotateRight(int[] arr, int rotateBy)
     {
        int n = arr.length;
        rotateBy %= n; // Ensure rotateBy is within the array size
        reverse(arr, 0, n - rotateBy - 1);
        reverse(arr, n - rotateBy, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) 
    {
        while (start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
