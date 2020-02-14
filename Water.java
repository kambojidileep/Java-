class Water
{
	int a=10;
	void display()
	{
		int z=5;
		z++;
		a++;
		System.out.println(z);
		System.out.println(a);
		
	}
	void show()
	{
		System.out.println(a);
		System.out.println(z);
	}
public static void main(String[] args)
{
	water d=new water();
	d.display();
	d.show();
}

}