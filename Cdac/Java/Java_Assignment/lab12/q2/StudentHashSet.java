import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Student {
    private int rollno;
    private String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    @Override
   public boolean equals(Object s)
   {
    Student s1= (Student)s;
   return this.rollno == s1.rollno;

   }

    @Override
    public int hashCode() {
        return rollno;
    }
}

public class StudentHashSet{
    public static void main(String[] args) {
        // Create an ArrayList of Student objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Jerry"));
        studentList.add(new Student(2, "Neethu"));
        studentList.add(new Student(3, "Mini")); 
        studentList.add(new Student(4, "Mariam"));
        studentList.add(new Student(5, "Nisha"));// Duplicate
        studentList.add(new Student(5, "Nisha")); // Duplicate

        // Display unique elements using HashSet
        HashSet<Student> uniqueStudents = new HashSet<>(studentList);
        System.out.println("Unique Students (HashSet):");
        for (Student student : uniqueStudents) {
            System.out.println("Roll No: " + student.getRollno() + ", Name: " + student.getName());
        }
    }
}