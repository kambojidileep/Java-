package assignment;

import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int b=UserMainCode.ValidateTime(str);
		if(b==1)
		{
			System.out.println("Valid time"); 
			}
		else
		{
			System.out.println("Invalid time");
			}
		sc.close();
		}
	
}
