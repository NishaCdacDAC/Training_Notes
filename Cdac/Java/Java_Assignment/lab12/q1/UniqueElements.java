import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.List;
import java.util.Set;

public class UniqueElements{

    public static void main(String[] args) {
        // Create an ArrayList to store random integer values
        List<Integer> integerList = new ArrayList<>();
        
        // Or you can use LinkedList instead
        // List<Integer> integerList = new LinkedList<>();
        
        // Generate and add random integers to the list
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomInt = random.nextInt(10); // Generates random integers from 0 to 9
            integerList.add(randomInt);
        }
        
        System.out.println("Original List: " + integerList);
        
        // Create a HashSet to store unique elements
        Set<Integer> uniqueSet = new HashSet<>(integerList);
        
        System.out.println("Unique Elements: " + uniqueSet);
    }
}