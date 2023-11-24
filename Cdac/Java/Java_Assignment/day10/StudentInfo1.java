package day10;
import java.util.InputMismatchException;
import java.util.Scanner;

class Student {
    private int rollno;
    private String name;
    private String city;

    public Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return ("Student with Roll: " + rollno + " Name: " + name + " and City: " + city);
    }
}

public class StudentInfo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Roll Number: ");
            int rollno = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter City: ");
            String city = scanner.nextLine();

            Student s = new Student(rollno, name, city);
            System.out.println(s);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a valid integer for Roll Number.");
        } catch (Exception e) {
            System.err.println("An error occurred. Please check your input.");
        } finally {
            scanner.close();
        }
    }
}