/*Create an abstract class GeometricShape with abstract methods like area() and perimeter(). 
Then, create concrete subclasses like Circle, Rectangle, and Triangle that inherit from GeometricShape and implement the required methods.*/

// Abstract GeometricShape class
abstract class GeometricShape 
{
    // Abstract method to calculate the area of the shape
    public abstract double area();

    // Abstract method to calculate the perimeter of the shape
    public abstract double perimeter();
}

// Concrete Circle subclass
class Circle extends GeometricShape 
{
    private double radius;
    private static final double APPROX_PI = 3.14159265359; // Approximation of pi

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double area()
     {
        return APPROX_PI * radius * radius;
    }

    @Override
    public double perimeter()
     {
        return 2 * APPROX_PI * radius;
    }
}

// Concrete Rectangle subclass
class Rectangle extends GeometricShape 
{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Concrete Triangle subclass
class Triangle extends GeometricShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) 
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        // Using Heron's formula to calculate the area of a triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class MainGeometricShape  {
    public static void main(String[] args) 
    {
        // Create instances of different geometric shapes
        GeometricShape circle = new Circle(5.0);
        GeometricShape rectangle = new Rectangle(4.0, 6.0);
        GeometricShape triangle = new Triangle(3.0, 4.0, 5.0);

        // Calculate and display areas and perimeters
        System.out.println("Circle - Area: " + circle.area() + ", Perimeter: " + circle.perimeter());
        System.out.println("Rectangle - Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());
        System.out.println("Triangle - Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());
    }
}
