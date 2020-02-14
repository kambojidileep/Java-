package practice;
public class Arraygreatest {

	public static void main(String[] args) {
		int gr=Integer.parseInt(args[0]);
		for( int i=1;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])>gr)
			{
				gr=Integer.parseInt(args[i]);
			}
		}
		System.out.println("the greatest no is"+gr);
	}

}
