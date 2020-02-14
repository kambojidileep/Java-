package practice;

class Student10
{
	String name;
	Student10(String s)
	{
	}
	public void setName(String na) 
	{
			name=na;
	}
	public String getName() 
	{
		return name;
	}
}
public class Demo2 {
	public static void change(Student10 s1)
	{
		s1.setName("Mary");
	}
	public static void main(String[] args) {
		Student10 s1=new Student10("john");
		change(s1);
		 System.out.println("s1="+s1.getName());
	}
	}
 
