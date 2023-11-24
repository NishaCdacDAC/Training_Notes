
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class UniqueElementsTreeSet {

    public static void main(String[] args) {
        // Create an ArrayList to store random integer values
        List<Integer> integerList = new ArrayList<>();
        
        // Generate and add random integers to the list
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomInt = random.nextInt(10); // Generates random integers from 0 to 9
            
            integerList.add(randomInt);
        }
        
        System.out.println("Original List: " + integerList);
        
        // Create a TreeSet to store unique elements in ascending order
        Set<Integer> uniqueSet = new TreeSet<>(integerList);
        
        System.out.println("Unique Elements in Ascending Order: " + uniqueSet);
    }
}