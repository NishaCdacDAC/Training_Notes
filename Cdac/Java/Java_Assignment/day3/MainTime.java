/*Write a class Time with three data members to store hr, min and
seconds. Create two constructors and apply checks to set valid time.
(hr<24, min<60, sec<60). Also create display function which displays all
data members.*/

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        // Default constructor initializes the time to midnight (00:00:00).
        this(0, 0, 0);
    }
    public Time(int hour, int minute, int second) {
        if (isValidTime(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            // If the provided time is invalid, set the time to midnight.
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
            System.out.println("Invalid time provided. Setting time to midnight.");
        }
    }

    private boolean isValidTime(int hr, int min, int sec) {
        return (hr >= 0 && hr < 24 && min >= 0 && min < 60 && sec >= 0 && sec < 60);
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }
}
public class MainTime {
    public static void main(String[] args) {
        // Creating a Time object with default constructor (midnight)
        Time defaultTime = new Time();
        System.out.print("Default Time: ");
        defaultTime.display();

        // Creating a Time object with custom constructor
        Time customTime = new Time(14, 30, 45);
        System.out.print("Custom Time: ");
        customTime.display();
        // Creating a Time object with an invalid time (should default to midnight)
        Time invalidTime = new Time(25, 70, 80);
        System.out.print("Invalid Time: ");
        invalidTime.display();
    }
}
