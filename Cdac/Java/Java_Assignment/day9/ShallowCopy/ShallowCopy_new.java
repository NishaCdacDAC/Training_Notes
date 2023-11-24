class Department {
    String depId;
 
    String depName;

	
 
    public Department(String depId, String depName) {
        this.depId = depId;
 
        this.depName = depName;
    }
}
 
class Employee1 implements Cloneable {
    int empid;
 
    String empname;
 
    Department dept; 
 
    public Employee1(int empid, String empname, Department dept) {
        this.empid = empid;
 
        this.empname = empname;
 
        this.dept = dept;
    }
 
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
 
public class ShallowCopy_new {
 
    public static void main(String[] args) {
 
        Department dept1 = new Department ("1", "Nisha");
 
        Employee1 emp1 = new Employee1 (111, "Jeni", dept1);
 
        Employee1 emp2 = null;
 
        try {
           
            emp2 = (Employee1) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
 
        System.out.println("Before Change :"+emp1.dept.depName); 
 
       
        emp2.dept.depName = "Jeni";
        
        System.out.println("After Change :"+emp1.dept.depName); 
}
}