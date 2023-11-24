/* Write a main() method that will create an object of type MarkProcess and call the methods in it to declare the result.*/
class IllegalMarkException extends Exception {
    public IllegalMarkException() {
        super("Illegal Mark");
    }
}

class MarkProcess {
    private int regno;
    private int marks;

    public MarkProcess(int regno, int marks) {
        this.regno = regno;
        this.marks = marks;
    }

    public void validation() throws IllegalMarkException {
        if (marks < 0) {
            throw new IllegalMarkException();
        }
    }

    public String result() {
        if (marks >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    public static void main(String[] args) {
        try {
            MarkProcess student1 = new MarkProcess(101, 60);
            student1.validation();
            System.out.println("Student 1 Result: " + student1.result());
        } catch (IllegalMarkException e) {
            System.err.println("Error for Student 1: " + e.getMessage());
        }

        try {
            MarkProcess student2 = new MarkProcess(102, -10);
            student2.validation();
            System.out.println("Student 2 Result: " + student2.result());
        } catch (IllegalMarkException e) {
            System.err.println("Error for Student 2: " + e.getMessage());
        }
    }
}

