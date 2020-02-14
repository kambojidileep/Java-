package practice;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		int i=1;
		int j=-2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the end value of the series");
		int N=s.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the start value of the series");
		int n=s2.nextInt();
		while(i<=N)
		{
			System.out.println(i);
			i=i+2;
		while(j>=n)
		{
			System.out.println(j);
			j=j-2;
			break;
		}
		}
		
	}

}
