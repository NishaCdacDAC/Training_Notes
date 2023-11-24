public class LinearSearch {
    public static int search(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int[] insertElement(int arr[], int element) {
        int newArray[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[arr.length] = element;
        return newArray;
    }

    public static void main(String[] args) {
        int arr[] = {15, 32, 24, 67, 49, 10};
        int element = 67;

        int position = search(arr, element);

        if (position != -1) {
            System.out.println("Position of " + element + " is " + position);
        } else {
            System.out.println("Element not Found");

            // Insert the element 50
            arr = insertElement(arr, 50);
            System.out.println("Element 50 inserted at the end");
        }
    }
}