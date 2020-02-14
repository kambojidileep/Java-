package practice;

class D
{
	int x=1000;
	D()
	{
		System.out.println("A");
	}
}
class E extends D
{
	E()
	{
		System.out.println("B  ");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		E obj=new E();
	}
}
