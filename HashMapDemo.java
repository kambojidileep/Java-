package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("oop","object oriented programming");
		hm.put("object","has states and behaviour");
		hm.put("class","defines states and behaviour share by obj" );
		System.out.println(hm);
		Set s=hm.entrySet();
		System.out.println();
		System.out.println("\n hash map currrnt size:"+hm.size());
		System.out.println("elements of hashmap");
		System.out.println();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Object ob=itr.next();
			System.out.println(" "+ob);
		}
	}

}