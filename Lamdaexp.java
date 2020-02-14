package practice;

import java.awt.List;
import java.util.ArrayList;


public class Lamdaexp {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("raja");
		list.add("ram");
		list.add("rrr");
		list.add("glen");
		list.add("car1");
		list
		.stream()
		.filter(s -> s.startsWith("C"))
		.map(String::UpperCase)
		.sorted()
		.forEach(System.out::println);

	}

}
