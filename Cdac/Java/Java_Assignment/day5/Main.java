
public class Main
 {
    public static void main(String[] args) 
    {
        Person person = new Person("Nisha", 31);
        System.out.println(person); // Output: Person{name='Nisha', age=30}

        // Attempting to modify the fields will result in a compilation error.
        // person.name = "Alice"; // Compilation error
        // person.age = 25; // Compilation error

        // Accessing the fields through getter methods
        System.out.println("Name: " + person.getName()); // Output: Name: Nisha
        System.out.println("Age: " + person.getAge());   // Output: Age: 31
    }
}
