import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap to store student data (PRN as key, Name as value)
        TreeMap<String, String> studentTreeMap = new TreeMap<>();

        // Accept PRN and Name of 3 students and store in the TreeMap
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter PRN for student " + (i + 1) + ": ");
            String prn = scanner.next();
            System.out.print("Enter Name for student " + (i + 1) + ": ");
            String name = scanner.next();
            studentTreeMap.put(prn, name);
        }
        // Accept a PRN from the user and check if it exists in the TreeMap
        System.out.print("Enter PRN to search/add: ");
        String prn = scanner.next();
        if (studentTreeMap.containsKey(prn)) {
            // If it exists, get and display the student's name
            String name = studentTreeMap.get(prn);
            System.out.println("Student's Name: " + name);
        } else {
            // If it doesn't exist, prompt for the name and add it to the collection
            System.out.print("Enter Name to add: ");
            String name = scanner.next();
            studentTreeMap.put(prn, name);
            System.out.println("Data added to the collection.");
        }
     // Display all elements in the TreeMap
     System.out.println("Student Data in the TreeMap:");
     for (Map.Entry<String, String> entry : studentTreeMap.entrySet()) {
         System.out.println("PRN: " + entry.getKey() + ", Name: " + entry.getValue());
     }
        scanner.close();   // Close the scanner
    }
}