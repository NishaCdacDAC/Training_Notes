class Student {
    private String name;
    private int age;
    private String address;

    // Constructor with default values
    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    // Method to set name and age
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to set name, age, and address
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to print student information
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

public class MainStudent {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[10];

        // Initialize each student and print their information
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
            students[i].setInfo("Student" + (i + 1), 20 + i, "Address" + (i + 1));
            students[i].printInfo();
        }
    }
}
