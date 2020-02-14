package practice;
abstract class Animal 
{
abstract void eat();

}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("i eat only non veg");    
	}
}
class Goat extends Animal
{
	void eat()
	{
		System.out.println("i eat only veg");
	}
}
public class Abstract{
	public static void main(String[] args) {
		
	Animal m;
	m=new Tiger();
	m.eat();
	m=new Goat();
	m.eat();

}
	}