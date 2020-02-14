package practice;

import java.util.Scanner;

public class Student2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tot=0;
		int a[];
		String name;
		System.out.println("enter the name of student");
		name=sc.next();
		System.out.println("enter the no subjects");
		a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter marks in subject"+(i+1)+":");
			a[i]=sc.nextInt();
			tot=tot+a[i];
		}
		System.out.println("Student name\t:"+name);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("marks in subject"+(i+1)+"are\t:"+a[i]);
		}
		System.out.println("total\t:"+tot);
		

	}

}
