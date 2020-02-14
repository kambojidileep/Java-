package practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		LinkedList LL=new LinkedList();
		LL.add(4);
		LL.add(2);
		LL.add(1);
		LL.add(3);
		System.out.println(LL);
		LL.addFirst(0);
		System.out.println(LL);
		
		LL.addLast(10);
		System.out.println(LL);
		ListIterator li=LL.listIterator();
		int counter=0;
		while(li.hasNext())
		{
			System.out.println("element["+counter+"]="+li.next());
			System.out.println("-hasprevious ="+li.hasPrevious());
			System.out.println("- hasNext ="+li.hasNext());
			System.out.println("-previousIndex="+li.previousIndex());
			System.out.println("-nextIndex="+li.nextIndex());
			System.out.println();
			counter++;
		}
	}

}
