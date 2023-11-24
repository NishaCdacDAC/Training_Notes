// Engine class
class Engine 
{
    private String model;
    private int cylinders;

    public Engine(String model, int cylinders)
     {
        this.model = model;
        this.cylinders = cylinders;
    }

    public String getModel() 
    {
        return model;
    }

    public int getCylinders() 
    {
        return cylinders;
    }

    @Override
    public String toString()
     {
        return "Engine{" +
                "model='" + model + '\'' +
                ", cylinders=" + cylinders +
                '}';
    }
}
class Car 
{
    private String make;
    private String model;
    private Engine engine;
    private boolean isStarted;

    public Car(String make, String model, Engine engine)
     {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.isStarted = false;
    }

    public void start() 
    {
        if (!isStarted) 
        {
            isStarted = true;
            System.out.println("Car started.");
        } 
        else
         {
            System.out.println("Car is already running.");
        }
    }

    public void stop() 
    {
        if (isStarted) 
        {
            isStarted = false;
            System.out.println("Car stopped.");
        } 
        else 
        {
            System.out.println("Car is already stopped.");
        }
    }

    public void displayEngineDetails() 
    {
        System.out.println("Engine details:");
        System.out.println(engine);
    }
}

public class MainCar 
{
    public static void main(String[] args)
    {
        Engine carEngine = new Engine("w5", 4);
        Car myCar = new Car("Hyundai", "Xcent", carEngine);

        myCar.displayEngineDetails();
        myCar.start();
        myCar.start(); // Attempting to start again
        myCar.stop();
        myCar.stop();  // Attempting to stop again
    }
}
