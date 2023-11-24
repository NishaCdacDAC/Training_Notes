
import java.util.ArrayList;

public class PortionForEach{
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

        int currentIndex = 0;

        for (String element : originalList) {
            if (currentIndex >= startIndex && currentIndex < endIndex) {
                portionList.add(element);
            }
            currentIndex++;
        }

        // Print the extracted portion of the list
        System.out.println("Original List: " + originalList);
        System.out.println("Extracted List: " + portionList);
    }
}