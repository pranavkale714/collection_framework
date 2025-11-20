package TreeSet_DEMO;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_methods {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();

		ts.add(50);
		ts.add(10);
		ts.add(30);
		ts.add(70);
		
		//sorted Order
		System.out.println(ts);
		
		TreeSet<Integer> morenumber = new TreeSet<>(Arrays.asList(60,70,80));
		
		ts.addAll(morenumber);
		
		System.out.println(ts.contains(30));
		
		ts.remove(40);
		
		System.out.println(ts.first());       
		System.out.println(ts.last());   
		
		//next smaller
		System.out.println(ts.lower(30));
		
		//next greter
		System.out.println(ts.higher(30));
		
		//>=30
		System.out.println(ts.floor(30));     
		
		//<=30
		System.out.println(ts.ceiling(30));   

		//less than 50
		System.out.println(ts.headSet(50));
		
		//>=40
		System.out.println(ts.tailSet(30));   
		
		//30<= x <70
		System.out.println(ts.subSet(10, 70));
		
		//removeFirst
		System.out.println(ts.pollFirst());
		
		//removeLast
		System.out.println(ts.pollLast());
		
		
	//asceding  iterator 
		Iterator<Integer> it =ts.iterator();
		
    //decending iterator
		Iterator<Integer> dit=ts.descendingIterator();
		
	//Using for loop
		for(Integer i : ts){
		    System.out.println(i);
		}
		
	System.out.println(ts.size());
	System.out.println(ts.isEmpty());
	ts.clear();	
		}

}
