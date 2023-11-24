import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMapAdd {
    public static void main(String[] args) {
        // Create a HashMap to store student data (PRN as key, Name as value)
        Map<String, String> studentMap = new HashMap<>();

        // Accept PRN and Name of 3 students and store in the collection
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter PRN for student " + (i + 1) + ": ");
            String prn = scanner.next();
            System.out.print("Enter Name for student " + (i + 1) + ": ");
            String name = scanner.next();
            studentMap.put(prn, name);
        }

        // Accept a PRN from the user and check if it exists in the collection
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PRN to search/add: ");
        String prn = scanner.next();

        // Check if the PRN exists in the collection
        if (studentMap.containsKey(prn)) {
            // If it exists, get and display the student's name
            String name = studentMap.get(prn);
            System.out.println("Student's Name: " + name);
        } else {
            // If it doesn't exist, prompt for the name and add it to the collection
            System.out.print("Enter Name to add: ");
            String name = scanner.next();
            studentMap.put(prn, name);
            System.out.println("Data added to the collection.");
        }

        // Display all elements in the collection
        System.out.println("Student Data in the Collection:");
        for (Map.Entry<String, String> entry : studentMap.entrySet()) {
            System.out.println("PRN: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Close the scanner
        scanner.close();
    }
}