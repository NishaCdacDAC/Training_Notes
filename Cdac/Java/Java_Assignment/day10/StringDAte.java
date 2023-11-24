package day10;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class StringDAte {
 public static void main(String[] args) throws ParseException {
		
		String dateS= "2023-10-17";
		SimpleDateFormat Dateformat=new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = Dateformat.parse(dateS);
		System.out.println("the date is  : " + date);
    
 }}