package assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2Array 
{
public static void main(String[] args) {
	
	int array[]= {10,20,30,40,50,60,70,80};
	int copy[]=Arrays.copyOf(array, 8);
	System.out.println("exact copy of original Array:"+Arrays.toString(copy));
}
}
