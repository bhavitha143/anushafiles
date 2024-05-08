

//For new Java 8 java.time.* APIs , we can use .now() to get the current date-time and format it with DateTimeFormatter.
//For legacy date-time APIs, we can use new Date() and Calendar.getInstance() to get the current date-time and format it with SimpleDateFormat.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class LocalDateExample {

	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("YYYY/MM/dd");
		LocalDate lc=  LocalDate.now();
		
		System.out.println(dtf.format(lc));
	}
}
