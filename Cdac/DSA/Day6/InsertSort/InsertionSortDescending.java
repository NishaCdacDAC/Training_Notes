public class InsertionSortDescending {
    // Method to perform descending order insertion sort
    public void sort(int arr[]) {
        int n = arr.length;

        // Start iterating from the second element to the end of the array
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to be inserted at the right position
            int j = i - 1; // Index of the previous element

            // Compare the current element with the elements to its left and shift them to the right
            // until the correct position for the current element is found
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j]; // Move the element to the right
                j = j - 1;
            }
            arr[j + 1] = key; // Insert the current element in its correct position
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
    int[] arr = {8, 7, 5, 9, 1, 6, 2, 4, 3};

    System.out.println("Original Array:");
    printArray(arr); // Display the original array

    // Create an instance of the InsertionSortDescending class for performing descending order insertion sort
    InsertionSortDescending ob = new InsertionSortDescending();

    // Sort the array in descending order using the insertion sort algorithm
    ob.sort(arr);

    System.out.println("\nSorted Array in Descending Order:");
    printArray(arr); // Display the sorted array
}
}




