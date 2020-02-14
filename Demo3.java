package practice;

import java.util.Scanner;

class Student3 
{
	String name;
	Student3(String s)
	{
		name=s;
	}
	String getName()
	{
		return name;
		
	}
	
	
}
public class Demo3
{
	public static void main(String[] args) {
		Student3 s1[]=new Student3[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=new Student3(sc.next());
		}
		for(int i=0;i<s1.length;i++)
		{
			System.out.println("name:"+s1[i].getName());
		}
	}
}
