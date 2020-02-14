package practice;

class MyThread1 implements Runnable
{
	Thread t;
	String s=null;
	MyThread1(String S1)
	{
		s=S1;
		t=new Thread(this);
		t.start();
	}
	public void run() {
		System.out.println(s);
	}
}
public class CreateThread {

	public static void main(String[] args) {
		MyThread1 m1=new MyThread1("thread started...");
	}

}
