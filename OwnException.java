package own;

import java.util.Scanner;

public class OwnException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		String s1=sc.nextLine();
		try {
			if(s1.length()>10)
			{
				System.out.println("phone no is updated");
			}
			else {
				throw  new phonenoException();
			}
		}
		catch(phonenoException e)
		{
			System.err.println("Enter the phone no in range of 10 ");
		}

	}

}
