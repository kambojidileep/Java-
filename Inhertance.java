package practice;
class A
{
	int x;
	int y;
	int get(int p,int q)
	{
		x=p;
		y=q;
		return(0);
	}
	 void Show()
	 {
		 System.out.println("Show method"+" "+x);
	 }
} 

public class Inhertance extends A{

	public static void main(String[] args) 
	{
		//Inhertance i=new Inhertance();
		//i.get(2, 6);
		//i.Show();
		//i.display();
		A aa;
		aa=new A();
		aa.get(5, 6);
		aa.Show();
		aa=new Inhertance();
		aa.Show();
	}
	void Show()
	{
		super.Show();
		System.out.println(y);
	}

}
