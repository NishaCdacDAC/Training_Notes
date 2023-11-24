/** Create an abstract class Vehicle with one abstract function color(). Create two sub classes
Car and Bus from this . Invoke the function through the instance of car and bus. Also use
the abstract class reference that invokes that function in main.**/


abstract class Vehicle {
    public abstract String colour();
}

class Car extends Vehicle {
    @Override
    public String colour() {
        return "Car colour is white";
    }
}

class Bus extends Vehicle {
    @Override
    public String colour() {
        return "Bus colour is blue";
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car(); // Create instances of Car and Bus
        Bus bus = new Bus();

        // call the color() function through instances of Car and Bus
        System.out.println(car.colour());
        System.out.println(bus.colour());

        // call the color() function using the abstract class reference
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Bus();
        System.out.println(vehicle1.colour());
        System.out.println(vehicle2.colour());
    }
}