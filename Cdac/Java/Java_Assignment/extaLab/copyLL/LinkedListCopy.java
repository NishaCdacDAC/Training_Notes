import java.util.LinkedList;

public class LinkedListCopy{
    public static void main(String[] args) {
        // Create the original linked list
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        System.out.println("Linked List : " + originalList);
        // Create a new linked list and copy the original list into it
        LinkedList<Integer> copiedList = new LinkedList<>(originalList);

        // Display the copied linked list
        System.out.println("Copied Linked List: " + copiedList);
    }
}