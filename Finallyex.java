package practice;

public class Finallyex {

	public static void main(String s[]) 
	{
	try {
		int length=s[0].length()+s[1].length();
		if(length<10)
			return;
		System.out.println("name length should be less than 10 in total");
	}
catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("2 command line arguments are requried");
	}
	finally
	{
		System.out.println("Thank you");
	}
	}

}
