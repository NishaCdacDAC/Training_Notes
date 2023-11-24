/*Create a class to print the area of a square and a rectangle. The class has two methods ‘printArea’ and ‘printPerimeter’ with the same name but different number of parameters. The method for printing area of rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.*/

class ShapePrinter {
    // Method to print the area of a rectangle
    void printArea(double length, double breadth) 
    {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to print the area of a square
    void printArea(double side)
     {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Method to print the perimeter of a rectangle
    void printPerimeter(double length, double breadth) 
    {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

public class MainShape {
    public static void main(String[] args)
     {
        ShapePrinter shapePrinter = new ShapePrinter();

        // Calculate and print the area of a rectangle
        shapePrinter.printArea(4.0, 5.0);

        // Calculate and print the area of a square
        shapePrinter.printArea(3.0);

        // Calculate and print the perimeter of a rectangle
        shapePrinter.printPerimeter(4.0, 5.0);
    }
}

