public class BubbleSort{
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 6, 2, 4, 3, 7};
        System.out.print("Array in Given Order: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(arr);

        System.out.println("Sorted Array in Ascending Order:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}