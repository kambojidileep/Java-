package practice;

import java.util.Scanner;

public class Fractional {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("plz enter the value");
		double d=s.nextDouble();
		double fractional=d%1;
		double integral=fractional-d;
		System.out.println("the entered value="+d);
		System.out.println("the fractional value="+fractional);
		System.out.println("the integral value="+integral);
		

	}

}
