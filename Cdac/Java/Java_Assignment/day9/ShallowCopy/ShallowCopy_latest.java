class Department {
    int deptid;
    String deptname;

    public Department(int deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }
}

class Employee implements Cloneable {
    int empid;
    String empname;
    Department department;

    public Employee(int empid, String empname, Department department) {
        this.empid = empid;
        this.empname = empname;
        this.department = department;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCopy_latest {
    public static void main(String[] args) {
        Department hr = new Department(1, "HR");
        Employee employee1 = new Employee(101, "Nisha", hr);
        Employee employee2 = null;

        try {
            employee2 = (Employee) employee1.clone();
        } catch (CloneNotSupportedException cns) {
            cns.printStackTrace();
        }

        System.out.println("Employee1 Department Name: " + employee1.department.deptname + ", Name: " + employee1.empname);

employee2.department.deptname = "IT";
System.out.println("After the changes by employee2: Employee1 Department Name: " + employee1.department.deptname + ", Name: " + employee1.empname);
    }
}