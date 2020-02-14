package practice;

interface C
{
	void met1();
}
interface B extends C
{
	void met2();
	void met3();
}
class X implements B
{
	public void met1()
	{
		System.out.println("one");
	}
	public void met2()
	{
		System.out.println("two");
	}
	public void met3()
	{
		System.out.println("three");
	}
	void display()
	{
		System.out.println("display method");
	}
}
public class Exampleinterface
{
	public static void main(String[] args) {
		
	
X x1=new X();
x1.met1();
x1.met2();
x1.met3();
x1.display();
	}
}
