package own;
interface driveable
{
	void start();
	void accelerate();
}
interface flyable
{
	void takeoff();
}
public class interfacedemo implements driveable,flyable
{

	public static void main(String[] args) {
	public void start()
		{
			System.out.println("texla started");
		}
	public void accelerate()
	{
		System.out.println("texla accelerated");
	}
	public void takeoff()
	{
		System.out.println("texla ready to take off");
	}
	interfacedemo d1=new interfacedemo();
	d1.start();
	d1.takeoff();
	d1.accelerate();
	}

	

}
