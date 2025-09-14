package ArraylistTheory;

import java.util.ArrayList;
import java.util.Iterator;

public class demo {

	public static void main(String[] args) {
		ArrayList li =new ArrayList();
		
		System.out.println("Arraylist with capacity 10");
		ArrayList li2 =new ArrayList(10);
		System.out.println(li);
		
		System.out.println("To Set initial capacity");
		li2.ensureCapacity(20);
		
		System.out.println("Reduce capacity to size");
		li2.trimToSize();
		
		System.out.println("adding element");
		li2.add(10);
		li2.addAll(0, li2);
		li2.add(li);
		li2.add(0,li);
		
		System.out.println("remove 10 from list");
		li2.remove(10);
		
		System.out.println("remove common element from li");
		li2.removeAll(li);
		
		System.out.println("clear");
		li2.clear();
		
		System.out.println("contains 10 or not");
		li.contains(10);
		
		System.out.println("size-elements in it");
		li2.size();
		
		System.out.println("get method by index");
		li2.get(10);
		
		System.out.println("set method");
		li2.set(3,40);
		
		
		System.out.println("index of element");
		li2.indexOf(10);
		
		System.out.println("iterator on list");
		Iterator itr = li.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
			
		}
		
		
		
		
		
	}

}
