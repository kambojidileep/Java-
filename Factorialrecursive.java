package practice;

import java.util.Scanner;

public class Factorialrecursive {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int factorial=fact(num);
		System.out.println("factorial of entered no is:"+factorial);
	}
static int fact(int n)
{
	int output;
	if(n==1)
	{
		return 1;
	}
	output=fact(n-1)*n;
	return output;
}
}
