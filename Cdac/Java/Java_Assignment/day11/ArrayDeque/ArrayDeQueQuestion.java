import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class ArrayDeQueQuestion{  
    public static void main(String[] args) {
    ArrayDeque<String> animals = new ArrayDeque<>(); // Create an ArrayDeque of strings
     animals.addFirst("Lion");//Read 2 values from the user and add them to the beginning of ArrayDeque
     animals.addFirst("Tiger");
     animals.addLast("Leopard");//Read one value from the user and add it to the end of the ArrayDeque
      // Use iterator() to iterate over the elements in this deque
      System.out.println("Iterating over the elements in the deque:");
      Iterator<String> iterator = animals.iterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }
      // Use descendingIterator() to iterate over the elements in reverse order
      System.out.println("Iterating over the elements in reverse order:");
      Iterator<String> descendingIterator = animals.descendingIterator();
      while (descendingIterator.hasNext()) {
          System.out.println(descendingIterator.next());
      }
        // Convert ArrayDeque to an array and return it
        String[] array = animals.toArray(new String[animals.size()]);
        System.out.println("Array converted from ArrayDeque:");
        for (String element : array) {
            System.out.println(element);
        }
        // Use clone() to create a copy of the ArrayDeque
        Deque<String> clonedDeque = ((ArrayDeque<String>) animals).clone();
        System.out.println("Cloned ArrayDeque:");
        for (String element : clonedDeque) {
            System.out.println(element);
        }
        // Search for an element in the ArrayDeque using contains()
        String searchElement = "Lion";
        boolean containsElement = animals.contains(searchElement);
        System.out.println("Does the ArrayDeque contain '" + searchElement + "': " + containsElement);
       // Display the length of the ArrayDeque (size)
        System.out.println("Length of the ArrayDeque: " + animals.size());
    }
}