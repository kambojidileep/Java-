package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(2,"dileep");
		map.put(1,"ram");
		map.put(3,"di");
		
		Set<Integer> keys =map.keySet();
		for(Integer key : keys)
		{
		System.out.println(map.get(key)); 
		}
	}

}
