package TreeMap_Demo;

import java.util.TreeMap;

public class TreeMap_Methods {

	public static void main(String[] args) {
		TreeMap map=new TreeMap();
		map.put("101", "Pranav");
		System.out.println(map);
		
		//will provide key only
		map.ceilingKey(101);
		
		//will provide Key and value also
		map.ceilingEntry(101);
		
		//all elements will get remove
		map.clear();
		
		//comparator
		//When user define sorting order
		//Tree has its own or default sorting order.
		
		//return true or false
		System.out.println(map.containsKey(101));
		
		//First element print
		System.out.println(map.firstEntry());
		
		//will return key only
		System.out.println(map.firstKey());
		
		//it will print of 105
		//if not present then it will return below 105
		System.out.println(map.floorEntry(105));
		
		System.out.println(map.size());
		
		//it will return value for 104
		//if not present return null
		System.out.println(map.get(104));
		
		//it will return all elements and value less than 102
		System.out.println(map.headMap(102));
		
		//it will return single higher element than 103
		//if no element present it will return null
		System.out.println(map.higherEntry(103));
		
		//return all keys only
		System.out.println(map.keySet());
		
		//remove First Entry
		System.out.println(map.pollFirstEntry());
		
		//remove Last Entry
		System.out.println(map.pollLastEntry());
		
		//Remove 102 Entry
		map.remove(102);
		
		//replace value for key 102
		System.out.println(map.replace(102,"aaa"));
		
		//will return elements between 103<= and <107
		System.out.println(map.subMap(103, 107));
		
		
	

	}

}
