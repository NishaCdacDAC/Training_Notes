public class Weather<T> {
    private String day; // Normal data member
    private T temperature; // Generic data member

    public Weather(String day, T temperature) {
        this.day = day;
        this.temperature = temperature;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public T getTemperature() {
        return temperature;
    }

    public void setTemperature(T temperature) {
        this.temperature = temperature;
    }

    public void display() {
        System.out.println("Day: " + day);
        System.out.println("Temperature: " + temperature);
    }

    public static void main(String[] args) {
        Weather<Double> weatherInstance = new Weather<>("Monday", 26.5);

        System.out.println("Initial Data:");
        weatherInstance.display();

        weatherInstance.setDay("Sunday");
        weatherInstance.setTemperature(29.1);

        System.out.println("\nUpdated Data:");
        weatherInstance.display();
    }
}