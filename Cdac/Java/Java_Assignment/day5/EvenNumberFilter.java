import java.util.ArrayList;
import java.util.List;

public class EvenNumberFilter {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Use a lambda expression to filter and print even numbers
        System.out.println("Even numbers in the list:");
        numbers.stream()
               .filter(number -> number % 2 == 0)
               .forEach(System.out::println);
    }
}
