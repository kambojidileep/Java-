package own;

class Hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hi");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
				System.out.println("some thing wrong");
			}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try
			{
			Thread.sleep(50);
			}
			catch(Exception e)
			{
				System.out.println("something wrong");
			}
		}
			
	}
}
public class Mythread{ 
	public static void main(String[] args) {
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		obj1.start();
		obj2.start();
		

	}

}
