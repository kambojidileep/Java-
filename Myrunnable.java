package own;

public class Myrunnable  implements Runnable{

	public void run()
	{	for(int i=0;i<5;i++)
	{
		System.out.println("child thread");
	}
}
}
class Threaddemo
{
	public static void main(String[] args) {
			
		Myrunnable r1=new Myrunnable();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r1);
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		Thread.currentThread().setName("dileep");
		System.out.println((Thread.currentThread().getName()));
		t1.start();
		t2.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.setPriority(t1.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		
	}
}

