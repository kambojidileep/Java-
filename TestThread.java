package practice;
class TwoStrings
{
	synchronized static void print(String str1,String str2) {
		System.out.println(str1);
		try {
			Thread.sleep(500);
		}
		catch(Exception ie)
		{
		}
		System.out.println(str2);
	}
}
class PrintStringsThread implements Runnable
{
	Thread td;
	String Str1,Str2;
	 PrintStringsThread (String Str1,String Str2)
	{
		this.Str1=Str1;
		this.Str2=Str2;
		td=new Thread(this);
		td.start();
	}
	public void run()
	{
		TwoStrings.print(Str1,Str2);
	}
}

public class TestThread {

	public static void main(String[] args) {     
	new	PrintStringsThread("hello","hi");
	new	PrintStringsThread("How are","you");
	new	PrintStringsThread("Thank you","very much");
	}

}
