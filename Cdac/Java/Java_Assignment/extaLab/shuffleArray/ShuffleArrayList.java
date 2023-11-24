import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("ArrayList:" +arrayList);
        
        // Shuffle the elements using Collections.shuffle()
        Collections.shuffle(arrayList);

        // Display the shuffled elements
        System.out.println("Shuffled ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}




