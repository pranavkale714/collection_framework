package Hashset_demo;

import java.util.HashSet;
import java.util.Iterator;

public class Methods_of_Hashset {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(10);
		hs.add("Pranav");
		hs.add(100.55);
		
	
		HashSet hs2=new HashSet();
		hs2.addAll(hs);
		
		System.out.println(hs2.contains("Pranav"));
		hs2.remove(10);
		
		hs2.removeAll(hs);
		
		System.out.println(hs2.isEmpty());
		System.out.println(hs2.size());
		
		hs2.clear();
		
		//accessing elements using iterator
		Iterator<Object> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//accessing elements using for loop
		hs.forEach(e-> System.out.println(e));
		
		
	}

}