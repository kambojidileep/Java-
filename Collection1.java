package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection1 {

	public static void main(String[] args) {
		Collection file= new ArrayList();
		file.add(19);
		file.add(20);
		file.add(30);
		System.out.println(file);//it will print the values in same line.collections will not work with index number so 
								//we can not fetch the values from index no ,output will be[19,20,30]
		// there is only one way to print collections in line by line by using Iterator
		Iterator it=file.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
