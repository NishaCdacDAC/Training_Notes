import java.util.Arrays;

public class ArrayComparison {

    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 4, 6};

        String[] strArray1 = {"Lion", "Elephant", "Leopard"};
        String[] strArray2 = {"Lion", "Elepahnt", "Leopard"};
        String[] strArray3 = {"Lion", "Elephant", "Bear"};

        System.out.println("intArray1 and intArray2 are equal: " + areArraysEqual(intArray1, intArray2));
        System.out.println("intArray1 and intArray3 are equal: " + areArraysEqual(intArray1, intArray3));
        System.out.println("strArray1 and strArray2 are equal: " + areArraysEqual(strArray1, strArray2));
        System.out.println("strArray1 and strArray3 are equal: " + areArraysEqual(strArray1, strArray3));
    }
}