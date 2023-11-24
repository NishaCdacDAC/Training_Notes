public class BinarySearch {
    public int search(int arr[], int start, int end, int element) {
        if (start == end) {
            if (arr[start] == element)
                return start;
            else
                return -1;
        }

        int mid = (start + end) / 2;

        if (element == arr[mid])
            return mid;

        if (element > arr[mid])
            return search(arr, (mid + 1), end, element);
        else
            return search(arr, start, (mid - 1), element);
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int arr[] = {15, 26, 37, 38, 49, 103}; // Sorted array in ascending order
        int n, element;
        n = arr.length - 1;
        element = 33;

        int result = obj.search(arr, 0, n, element);

        if (result != -1) {
            System.out.println("Position of " + element + " is " + result);
        } else {
            System.out.println("Element Not Found");
        }
    }
}