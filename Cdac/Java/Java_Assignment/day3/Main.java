/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
by creating a class named 'Triangle' with parameter in its constructor.*/


class Triangle
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) 
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() 
    {
        return side1 + side2 + side3;
    }

    public double getArea() 
    {
        double s = getPerimeter() / 2.0; //semi-perimeter of triangle, s = (s1 + s2 + s3)/2
        
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}

public class Main {
    public static void main(String[] args) 
    {
        double side1 = 3.0;
        double side2 = 4.0;
        double side3 = 5.0;

        Triangle triangle = new Triangle(side1, side2, side3);

        double perimeter = triangle.getPerimeter();
        double area = triangle.getArea();

        System.out.println("Triangle with sides:");
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
