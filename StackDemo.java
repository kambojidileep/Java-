package practice;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	Stack s=new Stack();
	s.push("ptrick naughton");
	s.push("james gosling");
	s.push("mike sheridan");
	s.push("chris wrath");
	s.push("Ed frank");
	System.out.println("Stack elements:"+s);
	System.out.println("first element:"+s.peek());
	System.out.println("Stack Element:"+s);
	System.out.println("popping out :"+s.pop());
	System.out.println("Stack elements:"+s);
	s.push("java");
	System.out.println("after adding :"+s);
	System.out.println("popping out:"+s.pop());
	System.out.println("Stack element="+s);
	System.out.println("First element:"+s.peek());
		
	Enumeration<E> e=s.elements();
	System.out.println("elements are:");
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	}
}
