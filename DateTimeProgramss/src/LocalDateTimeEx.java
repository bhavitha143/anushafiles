import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		

		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY/MM/dd hh:mm:ss");
		  LocalDateTime now = LocalDateTime.now();
		  System.out.println(dtf.format(now));                  //  2021/03/22 16:37:15

	}
}
