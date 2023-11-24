/*Write a program that has variables to store Car data like; CarModel,
CarName, CarPrice and CarOwner. The program should include functions
to assign user defined values to the above mentioned variable and a
display function to show the values. Write a main that calls these
functions. Now write another runner class that declares three
Car objects and displays the data of all three.*/

class Car {
    private String carModel;
    private String carName;
    private double carPrice;
    private String carOwner;

    public Car() {
        // Initialize variables with default values
        carModel = "";
        carName = "";
        carPrice = 0.0;
        carOwner = "";
    }
    public void setCarData(String model, String name, double price, String owner) {
        carModel = model;
        carName = name;
        carPrice = price;
        carOwner = owner;
    }
    public void displayCarData() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Price: $" + carPrice);
        System.out.println("Car Owner: " + carOwner);
    }
}

public class CarRunner {
    public static void main(String[] args) {
        // Create three Car objects
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        car1.setCarData("Model 1", "Santro", 25000.0, "Nisha");
        car2.setCarData("Model 2", "Xcent", 30000.0, "Owner B");
        car3.setCarData("Model 3", "Nexon", 35000.0, "Owner C");

        System.out.println("Car 1 Data:");
        car1.displayCarData();

        System.out.println("\nCar 2 Data:");
        car2.displayCarData();

        System.out.println("\nCar 3 Data:");
        car3.displayCarData();
    }
}
