import java.util.ArrayList;
import java.util.List;

public class ArrayListPortion {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> originalList = new ArrayList<>();

        // Add some elements to the ArrayList
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        originalList.add("Fig");

        // Specify the starting and ending indexes to extract a portion of the list
        int startIndex = 1;
        int endIndex = 4;

        // Create a new ArrayList to store the extracted portion
        ArrayList<String> portionList = new ArrayList<>();

        // Iterate through the original list and copy elements to the extracted list
        for (int i = startIndex; i < endIndex; i++) {
            portionList.add(originalList.get(i));
        }

        // Print the extracted portion of the list
        System.out.println("Original List: " + originalList);
        System.out.println("PortionList: " + portionList);
    }
}