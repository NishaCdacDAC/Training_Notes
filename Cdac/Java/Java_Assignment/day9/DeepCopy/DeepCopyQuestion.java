class Department implements Cloneable {
    private int deptid;
    private String deptname;

    public Department(int deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    // Getter and setter methods for deptid and deptname

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Override
    public Department clone() {
        try {
            return (Department) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported for Department");
        }
    }
}
class Employee implements Cloneable {
    private int empid;
    private String empname;
    private Department department;

    public Employee(int empid, String empname, Department department) {
        this.empid = empid;
        this.empname = empname;
        this.department = department;
    }

    // Getter and setter methods for empid and empname
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    @Override
    public Employee clone() {
        try {
            Employee clonedEmployee = (Employee) super.clone();
            clonedEmployee.department = department.clone(); // Deep copy the Department object
            return clonedEmployee;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported for Employee");
        }
    }
}
public class DeepCopyQuestion {
    public static void main(String[] args) {
        // Create a Department
        Department originalDepartment = new Department(1, "HR");

        // Create an Employee with the original department
        Employee originalEmployee = new Employee(101, "John", originalDepartment);

        // Create a deep copy of the Employee
        Employee clonedEmployee = originalEmployee.clone();

        // Modify the cloned Employee's details
        clonedEmployee.setEmpid(102);
        clonedEmployee.setEmpname("Jerry");
        clonedEmployee.getDepartment().setDeptid(2);
        clonedEmployee.getDepartment().setDeptname("IT");

        // Print original and cloned Employee
        System.out.println("Original Employee: " + originalEmployee.getEmpid() + ", " + originalEmployee.getEmpname() + ", " +
                originalEmployee.getDepartment().getDeptid() + ", " + originalEmployee.getDepartment().getDeptname());

        System.out.println("Cloned Employee: " + clonedEmployee.getEmpid() + ", " + clonedEmployee.getEmpname() + ", " +
                clonedEmployee.getDepartment().getDeptid() + ", " + clonedEmployee.getDepartment().getDeptname());
    }
}