import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;

public class PriorityQueueStrings {
    public static void main(String[] args) {
        // Create a PriorityQueue of strings
        Queue<String> queue = new PriorityQueue<>();

        // Add values to the queue
        queue.add("pqr");
        queue.add("pcb");
        queue.add("plm");
        queue.add("pmn");

        System.out.println("Elements in the PriorityQueue:");

        // Use an iterator to iterate through the queue and display the elements
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}