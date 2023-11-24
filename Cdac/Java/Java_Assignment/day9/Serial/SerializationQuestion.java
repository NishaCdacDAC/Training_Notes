import java.io.*;
class Employee implements Serializable {
    private int id;
    private String name;
    private String dept;
    
    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
    }
}

public class SerializationQuestion {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Nisha", "HR");
        Employee employee2 = new Employee(2, "Jerry", "IT");
        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(employee1);
            oos.writeObject(employee2);
            System.out.println("Employee objects serialized successfully.");
            // Print the serialized employee objects
            System.out.println("Serialized Employee 1: " + employee1);
            System.out.println("Serialized Employee 2: " + employee2);
        } catch (IOException e) {
            e.printStackTrace();
        } // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))){
            Employee deserializedEmployee1 = (Employee) ois.readObject();
            Employee deserializedEmployee2 = (Employee) ois.readObject();
            
            System.out.println("Deserialized Employee 1: " + deserializedEmployee1);
            System.out.println("Deserialized Employee 2: " + deserializedEmployee2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}