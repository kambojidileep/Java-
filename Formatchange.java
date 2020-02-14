package practice;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; 

public class Formatchange

{
	public static void main(String[] args) {
		
	
	LocalDate date=LocalDate.now();
	System.out.println("Default format ofLocalDate="+date);
	System.out.println("pattern"+date);
	}

}
