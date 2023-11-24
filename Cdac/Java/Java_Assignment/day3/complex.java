import java.util.Scanner;

class Complex 
{
    private float real;
    private float imag;

    public Complex(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex add(Complex num) {
       float realPart = this.real + num.real;
        float imagPart = this.imag + num.imag;
        return new Complex(realPart, imagPart);
    }

    public Complex subtract(Complex num) {
        float realPart = this.real - num.real;
        float imagPart = this.imag - num.imag;
        return new Complex(realPart, imagPart);
    }

    public Complex multiply(Complex num) {
       float realPart = (this.real * num.real) - (this.imag * num.imag);
       float imagPart = (this.real * num.imag) + (this.imag * num.real);
        return new Complex(realPart, imagPart);
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user for the first complex number
        System.out.print("Enter the real part of the first complex number: ");
        float real1 = scanner.nextFloat();
        System.out.print("Enter the imaginary part of the first complex number: ");
        float imag1 = scanner.nextFloat();

        // Get input from the user for the second complex number
        System.out.print("Enter the real part of the second complex number: ");
        float real2 = scanner.nextFloat();
        System.out.print("Enter the imaginary part of the second complex number: ");
        float imag2 = scanner.nextFloat();

        // Create Complex objects
        Complex complex1 = new Complex(real1, imag1);
        Complex complex2 = new Complex(real2, imag2);

        // Perform operations and print the results
        Complex sumResult = complex1.add(complex2);
        Complex diffResult = complex1.subtract(complex2);
        Complex productResult = complex1.multiply(complex2);

        System.out.println("Sum: " + sumResult);
        System.out.println("Difference: " + diffResult);
        System.out.println("Product: " + productResult);

        scanner.close();
    }
}
