package day10;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Input the first date
            System.out.println("Enter the first date (yyyy-MM-dd):");
            String dateStr1 = scanner.nextLine();
            Date date1 = dateFormat.parse(dateStr1);

            // Input the second date
            System.out.println("Enter the second date (yyyy-MM-dd):");
            String dateStr2 = scanner.nextLine();
            Date date2 = dateFormat.parse(dateStr2);

            // Calculate the difference in milliseconds
            long diff = date2.getTime() - date1.getTime();

            // Calculate the difference in days
            long diffDays = diff / (24 * 60 * 60 * 1000);

            // Output the difference
            System.out.println("Difference in days: " + diffDays);

        } catch (java.text.ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }

        scanner.close();
    }
}