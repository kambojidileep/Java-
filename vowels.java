package practice;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the alfhabet");
		char c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("The given alphabet is a oval");
		}
		else
		{
			System.out.println("the given element is consonant");
		}
	}

}
