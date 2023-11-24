class IllegalMarkRuntimeException extends RuntimeException {
    public IllegalMarkRuntimeException() {
        super("Illegal Mark");
    }
}

class MarkProcess1 {
    private int regno;
    private int marks;

    public MarkProcess1(int regno, int marks) {
        this.regno = regno;
        this.marks = marks;
    }

    public void validation() {
        if (marks < 0) {
            throw new IllegalMarkRuntimeException();
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
            MarkProcess1 student1 = new MarkProcess1(101, 60);
            student1.validation();
            System.out.println("Student 1 Result: " + student1.result());
        } catch (IllegalMarkRuntimeException e) {
            System.err.println("Error for Student 1: " + e.getMessage());
        }

        try {
            MarkProcess1 student2 = new MarkProcess1(102, -10);
            student2.validation();
            System.out.println("Student 2 Result: " + student2.result());
        } catch (IllegalMarkRuntimeException e) {
            System.err.println("Error for Student 2: " + e.getMessage());
        }
    }
}

