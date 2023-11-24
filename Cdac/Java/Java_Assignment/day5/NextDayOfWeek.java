/*Create an enum for the days of the week and write a program that takes user input for a day's name and then prints the next day of the week.*/

import java.util.Scanner;

// Enum for the days of the week
enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Get the next day of the week
    public DayOfWeek getNextDay() 
    {
        int nextIndex = (this.ordinal() + 1) % values().length;
        return values()[nextIndex];
    }
}

public class NextDayOfWeek 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String userInput = scanner.nextLine().toUpperCase();

        try 
        {
            DayOfWeek inputDay = DayOfWeek.valueOf(userInput);
            DayOfWeek nextDay = inputDay.getNextDay();
            System.out.println("The next day of the week is: " + nextDay);
        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Invalid day of the week input.");
        }

        scanner.close();
    }
}
