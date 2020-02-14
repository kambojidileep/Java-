package practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//Set hs=new HashSet();       //hash set will show in un   order or unsorted order 
		TreeSet hs=new TreeSet();     //tree set will show in sorted order
		hs.add("Sandeep");
		hs.add("Tilaka");
		hs.add("Deepak");
		hs.add("Elan");
		hs.add("chithra");
		hs.add("Tilaka");
		hs.add("Elan");
		System.out.println(hs);// all never accepts duplicate values
	}							//tree set doesn't support for null
}
