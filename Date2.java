package practice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Date2
{
public static void main(String[] args) throws ParseException{
Date2 now =new Date2();
System.out.println(now);
SimpleDateFormat ft=new SimpleDateFormat("E dd MMM YYYY 'at'hh:mm:ss a zzz");
System.out.println(ft.format(now));
ft=new SimpleDateFormat("dd.mm.yyyy");
Date2 d=new Date2();
System.out.println(ft.format(d));
}
}
       