/*Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the three classes.*/

class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    @Override
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    @Override
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class MainDegree  {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Undergraduate undergraduate = new Undergraduate();
        Postgraduate postgraduate = new Postgraduate();

        degree.getDegree();  // Calls the getDegree method in Degree class
        undergraduate.getDegree();  // Calls the getDegree method in Undergraduate class
        postgraduate.getDegree();  // Calls the getDegree method in Postgraduate class
    }
}
