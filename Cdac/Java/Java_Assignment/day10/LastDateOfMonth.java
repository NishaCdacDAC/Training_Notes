package day10;

import java.util.Calendar;

public class LastDateOfMonth {
    public static void main(String[] args) {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Set the calendar to the last day of the current month
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

        // Get the last date of the month
        int lastDay = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("Last date of the current month: " + lastDay);
    }
}
