package assignment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value");
		int i=sc.nextInt();
		int sum=0;
		while (i>0)
		{
			int rem=i%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
			}
			i=i/10;
		}
		if(sum%2==0)
		{
			System.out.println("the sum of given odd no is even");
		}
		else
		{
			System.out.println("the sum of given odd no is odd");
		}

	}

}
