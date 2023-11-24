import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PrintName {
public static void main(String[] args) throws IOException {
    // Using buffered reader to input data from user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("Enter your name: ");
        String myname = reader.readLine(); // Store the input in the 'myname' variable
        System.out.println("Hello, " + myname);

        // Using Console to input data from user
        String name = System.console().readLine();
        System.out.println("Your name is " + name);
        
        // Using Scanner to input data from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine();
        System.out.println("My name is " + name1);
        scanner.close();
    }
}