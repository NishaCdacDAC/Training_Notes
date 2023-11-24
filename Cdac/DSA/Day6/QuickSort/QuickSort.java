class QuickSort {
    
    int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start + 1;
        int j = end;

        while (true) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                break;
            }
        }

        // Swap pivot with arr[j]
        int temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;

        return j;
    }

    void quicksort(int arr[], int start, int end) {
        if (start < end) {
            int j = partition(arr, start, end);
            quicksort(arr, start, j - 1);
            quicksort(arr, j + 1, end);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {10, 8, 6, 12, 6, 15, 3, 9, 5, 20};

        System.out.println("Given Array");
        printArray(arr);

        QuickSort ob = new QuickSort();
        ob.quicksort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array in ascending order");
        printArray(arr);
    }
}