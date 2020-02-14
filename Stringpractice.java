package practice;

public class Stringpractice {

	public static void main(String[] args) {
	String s1="The quick brown fox jumps over the lazy dog";
	String s2="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG" ;
	String s3="and killed it";
	System.out.println("12 th index position is  "+s1.charAt(12));
	System.out.println(s1.contains("is"));
	
	System.out.println("index position of 'a' in the string"+s1.indexOf('A'));
	System.out.println("replacing 'the' with 'A'"+s1.replace("The","A"));
	System.out.println("Last index position of e"+s1.lastIndexOf('e'));
	System.out.println(s1.equals(s2));
	System.out.println("");
	System.out.println("CONVERTING FROM UPPERCASE TO LOWERCASE:"+" "+s1.toLowerCase());
	System.out.println("CONVERTING FROM LOWERCASE TO UPPERCASE:"+" "+s1.toUpperCase());
	//System.out.println(s1(s3));
	}

}
