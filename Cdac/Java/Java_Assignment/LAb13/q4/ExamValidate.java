// Generic interface Validate
interface Validate<T> {
    int isGreaterThan(T value1, T value2);
}

// Exam class implementing the Validate interface
class Exam implements Validate<Double> {
    private String PRN;
    private String Name;
    private double Mark;
    private double passingMark;

    public Exam(String PRN, String Name, double Mark, double passingMark) {
        this.PRN = PRN;
        this.Name = Name;
        this.Mark = Mark;
        this.passingMark = passingMark;
    }

    public String getPRN() {
        return PRN;
    }

    public String getName() {
        return Name;
    }

    public double getMark() {
        return Mark;
    }

    public double getPassingMark() {
        return passingMark;
    }

    // Implementation of isGreaterThan method from the Validate interface
    public int isGreaterThan(Double value1, Double value2) {
        if (value1 > value2) {
            return 1;
        } else if (value1 < value2) {
            return -1;
        } else {
            return 0;
        }
    }

    public void displayResult() {
        if (isGreaterThan(Mark, passingMark) >= 0) {
            System.out.println(Name + " (PRN: " + PRN + ") has passed the exam with a mark of " + Mark);
        } else {
            System.out.println(Name + " (PRN: " + PRN + ") has failed the exam with a mark of " + Mark);
        }
    }
}

public class ExamValidate {
    public static void main(String[] args) {
        // Create an instance of the Exam class
        Exam student1 = new Exam("29", "Nisha Elizabeth", 95.5, 50.0);
        Exam student2 = new Exam("67890", "Jeni Jerry", 40.0, 50.0);

        // Display results
        student1.displayResult();
        student2.displayResult();
    }
}