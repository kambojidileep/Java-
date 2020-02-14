package practice;

import java.util.Scanner;

public class Evenoroddternary 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value to check even or odd");
	int i=s.nextInt();
	int result=(i%2==0)?(0):(1);
	if(result==0)
	{
		System.out.println("the given no is even"+" "+i);
	}
	else
	{
		System.out.println("the given no is odd"+" "+i);
	}
	}

}
