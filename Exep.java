package practice;

public class Exep {

	static String S;
	public static void main(String[] args) {
		try {
			System.out.println(S.length());
		}
		catch(NullPointerException exe)
		{
			System.out.println(exe);
		}
		
		
	}
}
