
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

    public String toString( ) {
        return ("Student with Roll: " + rollno + " Name: " + name + " and City: " + city);
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollno = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        
        // an anonymous (nameless) Student object and call the displayStudentInfo method
    Student s= new Student(rollno, name, city);
    System.out.println(s);
        scanner.close();
    }
}
