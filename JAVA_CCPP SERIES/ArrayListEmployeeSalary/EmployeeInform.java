import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + '}';
    }
}

public class EmployeeInform {
    public static void main(String[] args) {
        // Create an ArrayList to store employee information
        ArrayList<Employee> employees = new ArrayList<>();

        // Add employees to the ArrayList
        employees.add(new Employee("Jeni", 50000.0));
        employees.add(new Employee("Anu", 60000.0));
        employees.add(new Employee("Nisha", 55000.0));
        employees.add(new Employee("Elizabeth", 62000.0));

        // Sort the employees in ascending order based on salary
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });

        // Display the sorted employee information
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}