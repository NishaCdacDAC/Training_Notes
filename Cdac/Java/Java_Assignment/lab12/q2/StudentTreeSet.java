
import java.util.ArrayList;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    private int rollno;
    private String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
		this.rollno = rollno;
	}
    public void setName(String name) {
		this.name = name;
	}

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student s1) {
        // Compare students based on their names for ascending order
        return this.name.compareTo(s1.name);
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name;
    }
}

public class StudentTreeSet {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Arya"));
        studentList.add(new Student(2, "Ben"));
        studentList.add(new Student(3, "Arya")); // Duplicate
        studentList.add(new Student(4, "Ann"));
        studentList.add(new Student(5, "Devi"));
        studentList.add(new Student(6, "Devi")); // Duplicate

        TreeSet<Student> uniqueStudents = new TreeSet<>(studentList);

        System.out.println("Unique Students in Ascending Order:");
        for (Student student : uniqueStudents) {
            System.out.println(student);
        }
    }
}