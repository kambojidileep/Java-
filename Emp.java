package practice;

public class Emp {
	int eno=101;
	void display()
	{
		eno=300;
		System.out.println(eno);
	}
}
class manager extends Emp
{
	void display()
	{
		System.out.println("manager class");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Emp e=new Emp();
		e.display();
		
	}
}