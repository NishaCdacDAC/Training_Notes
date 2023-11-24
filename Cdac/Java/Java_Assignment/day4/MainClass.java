class A 
{
    static void printMessage() 
    {
        System.out.println("Parent");
    }
}

class B extends A 
{
    static void printMessage() 
    {
        System.out.println("Child");
    }
}

public class MainClass
{
    public static void main(String[] args) 
    {
        A.printMessage();  // Calls the static method in class A
        B.printMessage();  // Calls the static method in class B

        A obj = new B();
        obj.printMessage();  // Calls the static method in class A
    }
}
