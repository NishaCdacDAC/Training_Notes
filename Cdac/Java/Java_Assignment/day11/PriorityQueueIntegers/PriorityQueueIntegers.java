import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueIntegers{
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        Queue<Integer> queue = new PriorityQueue<>();

        // Add values to the queue
        queue.add(100);
        queue.add(80);
        queue.add(60);
        queue.add(120);
       System.out.println(" " + queue);
        System.out.println("Elements in the queue: ");
        // Use a loop to iterate and print the elements in the queue
        for (Integer element : queue) {
            System.out.println(" " + element);
        }

        // Use the poll method to remove and display elements until the queue is empty
        while (!queue.isEmpty()) {
            int frontElement = queue.poll();
            System.out.println("Removed element: " + frontElement);
        }

        System.out.println("Queue is now empty.");
    }
}