package practice;

import java.util.Scanner;

public class Doll extends Thread{
public void run()
{
	while(true)
	{
		try
		{
			System.out.println("Have a nice day");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{		break;
			
		}
	}
	
}
public static void main(String[] args) {
	Doll d=new Doll();
	d.start();
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	if(s!=null) d.interrupt();
}
}
