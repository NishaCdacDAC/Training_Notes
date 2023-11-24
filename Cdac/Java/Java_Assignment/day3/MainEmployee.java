import java.util.Scanner;
class Employee {
    private double salary;
    private int hoursWorkedPerDay;

    public Employee(double salary, int hoursWorkedPerDay) {
        this.salary = salary;
        this.hoursWorkedPerDay = hoursWorkedPerDay;
    }
    public void addSal() {
        if (salary < 500) 
        {
            salary += 10;
        }
    }
    public void addWork() {
        if (hoursWorkedPerDay > 6) 
        {
            salary += 5;
        }
    }
    public double getSalary() {
        return salary;
    }

    public void getInfo() {
        System.out.println("Employee's salary: $" + salary);
        System.out.println("Hours worked per day: " + hoursWorkedPerDay + " hours");
    }
}
class MainEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee information from the user
        System.out.print("Enter employee's salary: $");
        double salary = scanner.nextDouble();
        System.out.print("Enter number of hours worked per day: ");
        int hoursWorkedPerDay = scanner.nextInt();

        // Create an Employee object
        Employee employee = new Employee(salary, hoursWorkedPerDay);

        // Add salary and work bonuses
        employee.addSal();
        employee.addWork();

        // Print the final salary
        System.out.println("Final Salary: $" + employee.getSalary());

        scanner.close();
    }
}
