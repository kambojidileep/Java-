package practice;

public class Exception1 
{
	public static void main(String[] args) {
		int a=10;int b = 0;
			try {
				System.out.println(a/b);
			}
		catch(ArithmeticException aie)
		{
			System.out.println(aie);
		}
		catch(Exception aie)
			{
			System.out.println(aie);
			}
	
	}
}
