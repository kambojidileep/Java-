package assignment;
import java.util.*;
import java.awt.List;
import java.util.ArrayList;

public class Listpgm {

	public static void main(String[] args)  {
		ArrayList<String> values =new ArrayList<>();
		values.add("SUNDAY");
		values.add("MONDAY");
		values.add("TUESDAY");
		values.add("WEDNESDAY");
		values.add("THURSDAY");
		values.add("FRIDAY");
		values.add("SATURDAY");
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		System.out.println(values.size());
		String[] arr = values.stream().toArray(String[] ::new); 
		for(String x:arr)
		{
			System.out.println(x+" ");
		}
	}
	
	
}
