package own;
class notthread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread");
		}
	}
}

public class Thread1 {

	public static void main(String[] args) {
	
		notthread t1=new notthread();
		t1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
	}

}
