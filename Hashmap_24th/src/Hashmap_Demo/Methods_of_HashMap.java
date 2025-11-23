package Hashmap_Demo;

import java.util.HashMap;
import java.util.Set;

public class Methods_of_HashMap {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101,"Pranav");
		hm.put(102,"Kale");
		hm.put(103,"Pranita");
		
		//return list
		System.out.println(hm);
		
		//return set
		Set set=hm.entrySet();
		System.out.println(set);
		
		hm.put(null, "aaa");
		hm.remove(102);
		System.out.println(hm.containsKey(109));
		System.out.println(hm.containsValue("Pranav"));
		System.out.println(hm.get(109));
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		System.out.println(hm.replace(105, "aaa"));
	}

}
