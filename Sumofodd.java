package practice;

import java.util.Scanner;

public class Sumofodd 
{	public static void main(String[] args)
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("plz enter the odd end value");
		int j=s.nextInt();
		for(int i=1;i<=j;i++)
		{	
			if(i%2==1)
			{
				sum=sum+i;
			}
			
		}
		System.out.println("sum="+sum);
				
	}

}
