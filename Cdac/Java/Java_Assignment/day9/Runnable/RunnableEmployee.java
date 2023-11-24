class Department {
    private int deptid;
    private String deptname;

    public Department(int deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    // Getters for deptid and deptname
    public int getDeptid() {
        return deptid;
    }

    public String getDeptname() {
        return deptname;
    }
}

class Employee implements Runnable {
    private int empid;
    private String empname;
    private Department department;

    public Employee(int empid, String empname, Department department) {
        this.empid = empid;
        this.empname = empname;
        this.department = department;
    }

    // Getters for empid, empname, and department
    public int getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public void run() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Department ID: " + department.getDeptid());
        System.out.println("Department Name: " + department.getDeptname());
    }
}

public class RunnableEmployee {
    public static void main(String[] args) {
        // Create a Department object
        Department hrDepartment = new Department(1, "HR");

        // Create Employee objects
        Employee employee1 = new Employee(101, "Arya", hrDepartment);
        Employee employee2 = new Employee(102, "Diya", hrDepartment);

        // Create threads and execute the Employee objects concurrently
        Thread thread1 = new Thread(employee1);
        Thread thread2 = new Thread(employee2);

        thread1.start();
        thread2.start();
    }
}
