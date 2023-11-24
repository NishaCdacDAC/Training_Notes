public class SelectionSort {
    // Method to perform Selection Sort
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // Iterate through the array for finding the smallest element and placing it in the correct position
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;

            // Find the index of the smallest element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            // Swap the smallest element with the current element (i)
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the elements of the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element of the array
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {26, 54, 93, 17, 77, 31, 44, 55, 20};

        System.out.println("Original Array:");
        printArray(arr); // Display the original array

        // Perform Selection Sort to sort the array in ascending order
        selectionSort(arr);

        System.out.println("\nSorted Array in Ascending Order:");
        printArray(arr); // Display the sorted array
    }
}