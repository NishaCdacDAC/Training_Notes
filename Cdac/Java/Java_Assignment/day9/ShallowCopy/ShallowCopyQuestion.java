class Department {
    private int deptId;
    private String deptName;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }
}
class Employee {
    private int empId;
    private String empName;
    private Department department;

    public Employee(int empId, String empName, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
}

public class ShallowCopyQuestion {
    public static void main(String[] args) {
        // Create a Department
        Department hrDept = new Department(1, "HR");

        // Create an Employee with the Department reference
        Employee originalEmployee = new Employee(101, "Nisha", hrDept);

        // Make a shallow copy of the original Employee
        Employee shallowCopyEmployee = originalEmployee;

        // Print original Employee details
        System.out.println("Original Employee: " + originalEmployee.getEmpName() + ", Department: " 
        + originalEmployee.getDepartment().getDeptName());

        // Modify the name and department in the shallow copy
        shallowCopyEmployee.setEmpName("Jaya");
        shallowCopyEmployee.setDepartment(new Department(2, "IT"));

        // Print original Employee details again
        System.out.println("Original Employee after modification: " + originalEmployee.getEmpName() +
         ", Department: " + originalEmployee.getDepartment().getDeptName());
    }
}