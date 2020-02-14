package practice;

import java.util.Scanner;

public class Secondlargest 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first value");
		int a=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the second value");
		int b=s2.nextInt();
		Scanner s3=new Scanner(System.in);
		System.out.println("Enter the third value");
		int c=s3.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("a is  first largest"+a);
		
		 if(b>c)
		{
			System.out.println("b is the second largest"+b);
		}
		else
		{
			System.out.println("c is the second largest"+c);
		}
		}
		if(b>c&&b>a)
		{
			System.out.println("b is the first largest"+b);
		
		if(c>a)
		{
			System.out.println("c is the second largest"+c);
		}
		else
		{
			System.out.println("a is the second largest"+a);
		}
		}
		if(c>a&&c>b)
		{
			System.out.println("c is the first largest"+c);
		if(a>b)
		{
			System.out.println("a is the second largest"+a);
		}
		else
		{
			System.out.println("b is the second largest"+b);
		}
		}
		
		
	}
	

}
