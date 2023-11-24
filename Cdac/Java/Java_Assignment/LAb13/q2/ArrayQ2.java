import java.util.Arrays;

public class ArrayQ2 {

    public static <T> boolean areArraysEqual(T[] arr1, T[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 5, 4};

         String[] strArray1 = {"apple", "banana", "cherry"};
        String[] strArray2 = {"apple", "banana", "cherry"};
        String[] strArray3 = {"apple", "banana", "grape"};

        System.out.println("Arrays intArray1 and intArray2 are equal: " + areArraysEqual(intArray1, intArray2));
        System.out.println("Arrays intArray1 and intArray3 are equal: " + areArraysEqual(intArray1, intArray3));
        
        System.out.println("Arrays strArray1 and strArray2 are equal: " + areArraysEqual(strArray1, strArray2));
        System.out.println("Arrays strArray1 and strArray3 are equal: " + areArraysEqual(strArray1, strArray3));
    }
}