class Student
{
	public static void main(String[] args)
	{
		String name="bantu";
		double english=80;
		double maths=90;
		double social=70;
		double total=english+maths+social;
		double average=total/300*100;

		System.out.println("Total marks scored="+total);
		System.out.println("Average="+average);
		if(average>=80)
		{
			System.out.println("First class");
		}
		else if(average>=70)
		{
			System.out.println("second class");
		}
		else if(average>=60)
		{
			System.out.println("third class");
		}
		else
		{
			System.out.println("fail ");
		}
	}
}
	