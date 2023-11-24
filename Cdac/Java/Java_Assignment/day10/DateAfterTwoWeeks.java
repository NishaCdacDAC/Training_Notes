package day10;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DateAfterTwoWeeks {
    public static void main(String[] args) {
        // Get the current date
        Calendar calendar = Calendar.getInstance();

        // Add two weeks to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 14);

        // Get the date after two weeks
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateAfterTwoWeeks = dateFormat.format(calendar.getTime());

        System.out.println("Date after two weeks: " + dateAfterTwoWeeks);
    }
}
