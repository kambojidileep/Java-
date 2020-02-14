package practice;

public class Exep3 
{
	public static void main(String[] args) {
	try
	{
		Y();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

     static void Y() {
		Z();
	}

	   static void Z() {
		int p=45/0;	
	}

}
