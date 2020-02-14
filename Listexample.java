package collections;
import java.util.ArrayList;
import java.util.List;

public class Listexample {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		//l1.add(10);
		//l1.add(20);
		//l1.add(30);
		l1.add("String");
		//l1.add(4.242);

		for( int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
	}

}
// since we are using list we an use loop bcz we can do that using index no so compare to array list list is better 
// to overcome this List is used