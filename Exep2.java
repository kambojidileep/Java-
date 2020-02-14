package practice;

public class Exep2 
{
public static void main(String[] args) {
	try
	{
		Exep2 met=new Exep2();
		System.out.println("Length of the junk is"+met.getStringSize("JUNK"));
		System.out.println("Length of the wrong is"+met.getStringSize("WRONG"));
		System.out.println("Length of null String is"+met.getStringSize(null));
	}
	catch(Exception ex)
	{
		System.out.println("Exception message:"+ex.getMessage());
	}
}

public int getStringSize(String str) throws Exception { 
	if(str==null)
	{
		throw new Exception("null is passed");
	}
	return str.length();
}	
}
