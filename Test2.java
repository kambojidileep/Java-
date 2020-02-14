package practice;
interface MyFunctionalInterface{
	public String sayHello(String x);
}
public class Test2 {
	public static void main(String[] args) {
		MyFunctionalInterface msg=(str)->{
			return str;
		};
		System.out.println(msg.sayHello("tilaka"));
	}
}
