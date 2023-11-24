import java.util.ArrayList;

public class ArrayListSearch {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Fig");

        // Element to search for
        String searchElement = "Car";

        // Using the contains method to search for the element
        boolean found = arrayList.contains(searchElement);

        // Print the search result
        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Search Element: " + searchElement);

        if (found) {
            System.out.println("The element was found in the ArrayList.");
        } else {
            System.out.println("The element was not found in the ArrayList.");
        }
    }
}