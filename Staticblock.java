package practice;

public class Staticblock
{
static
{
	System.out.println("this is a first static block");
}
public Staticblock()
{
	System.out.println("this is a constructor");
}
public static String staticString="Static variable";
static
{
	System.out.println("this is a second static block and"+staticString);
}
public static void main(String[] args) {
	Staticblock stb=new Staticblock();
	Staticblock.staticMethod2();
}
static {
	staticMethod();
	System.out.println("this is a third static block");
}
public static void staticMethod()
{
	System.out.println("this is a static method1");
}
public static void staticMethod2()
{
	System.out.println("this is a static method2");
}

}
