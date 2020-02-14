package assignment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class  Timevalidation{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
			
	
	SimpleDateFormat sdf=new SimpleDateFormat("h:mm a");
	sdf.setLenient(false);
	try {
		Date d=sdf.parse(s1);
		String s2=sdf.format(d);
		System.out.println("valid format");
	}
	catch(ParseException e)
	{
		System.out.println("Invalid time format");
	}
	
}
}
/*Input and Output Format:
Input is a string . Output is a string . Sample Input 1:
09:59 pm
Sample Output 1:
Valid time
Sample Input 2:
10:70 AM
Sample Output 2:
Invalid time*/