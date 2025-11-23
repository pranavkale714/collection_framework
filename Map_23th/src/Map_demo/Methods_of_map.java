package Map_demo;

import java.util.HashMap;

public class Methods_of_map {

	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(101, "Pranav");
		map.put(102, "Java");
		map.put(103, "Developer");

		
		System.out.println(map.containsKey(105));
		System.out.println(map.containsValue("Pranav"));
		
		System.out.println(map.get(102));
		map.remove(102);
		map.replace(103,"Kale");
		System.out.println(map.size());
		
		map.put(102,"name");
		//if try to add again for same key then replace value for key
		map.put(102,"Dilip");
		
		

		map.forEach((k, v) -> System.out.println(k + ":" + v));

		
		
		
		//clear all
		map.clear();
	}

}
