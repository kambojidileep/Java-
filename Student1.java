package practice;

import java.util.Scanner;

public class Student1 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the student name");
		String studentname =s.nextLine();
		Scanner m1=new Scanner(System.in);
		System.out.println("enter the social marks");
		int social =m1.nextInt();
		Scanner m2=new Scanner(System.in);
		System.out.println("enter the maths marks");
		int maths =s.nextInt();
		Scanner m3=new Scanner(System.in);
		System.out.println("enter the physics marks");
		int physics =s.nextInt();
		Scanner m4=new Scanner(System.in);
		System.out.println("enter the biology marks");
		int biology =s.nextInt();
		Scanner m5=new Scanner(System.in);
		System.out.println("enter the english marks");
		int english=s.nextInt();
	
			Student o1=new Student();
		System.out.println("student name"+studentname);
		System.out.println("social marks"+social);
		System.out.println("maths marks"+maths);
		System.out.println("physics marks"+physics);
		System.out.println("biology marks"+biology);
		System.out.println("english marks"+english);
	}
}
