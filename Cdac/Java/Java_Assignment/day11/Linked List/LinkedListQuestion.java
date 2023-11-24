import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListQuestion {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // ii) Read a value from the user and add it to the end of the list, repeat 3 times
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a value to add to the end of the list: ");
            int value = scanner.nextInt();
            integerList.addLast(value);
        }

        // iv) Using ListIterator() iterate the values and display
        System.out.println("Values in the list using ListIterator:");
        ListIterator<Integer> listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // v) Read a value from the user and add it to the beginning of the list, repeat 2 times
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter a value to add to the beginning of the list: ");
            int value = scanner.nextInt();
            integerList.addFirst(value);
        }

        // vi) Using ListIterator() iterate the values and display
        System.out.println("Values in the list using ListIterator after adding to the beginning:");
        listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        scanner.close();
    }
}