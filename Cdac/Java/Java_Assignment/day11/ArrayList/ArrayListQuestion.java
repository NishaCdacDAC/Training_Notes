package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListQuestion{
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> integerList = new ArrayList<>();

        // Add values to the ArrayList
        integerList.add(100);
        integerList.add(80);
        integerList.add(60);
        integerList.add(120);

        // i) Use a foreach loop to iterate through the collection
        System.out.println("Using foreach loop:");
        for (int value : integerList) {
            System.out.println(value);
        }

        // ii) Use ListIterator() to iterate through the collection
        System.out.println("\nUsing ListIterator() forward:");
        ListIterator<Integer> listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // iii) Use ListIterator() to iterate through the collection in reverse order
        System.out.println("\nUsing ListIterator() in reverse order:");
        listIterator = integerList.listIterator(integerList.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}