package practice;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) 
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value from where to check");
		int i=s.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the value till where to check");
		int j=s2.nextInt();
		for(int n=i;n<=j;n++)
		{
			if(n%i==0)
			{
				count++;
				 System.out.println(count);
			}
		}
		if(count==2)
		{
			System.out.println("the given");
		}
	}
}
