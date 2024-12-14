package List_and_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class demo {

	public static void main(String[] args) {
		List a=new ArrayList();
		a.add(10);
		//a.add(7, 25); errror out of bound
	    a.add(1,15);
		//adding duplicate value allowed
		a.add(2,10);
		a.add(null);
		a.add(null);
		a.add(9);
		//list follow insertion order
		//retriving will be in ordder of insertion
	    System.out.println("list value-"+a);
	    
	    Iterator itr=a.iterator();
	    System.out.print("using iterator-");
	    while(itr.hasNext())
	    {
	    	System.out.print(itr.next()+" ");
	    }
		System.out.println();
		Set b=new HashSet();
		b.add(100);
		b.add(400);
		b.add(300);
		//adding duplicate value not allowed
		b.add(100);
		//only one null value can store
		b.add(null);
		b.add(null);
		
		System.out.println("set value-"+b);
		System.out.print("using iterator-");
		
		Iterator itr2=b.iterator();
		while(itr2.hasNext())
		{
			System.out.print(itr2.next()+" ");
		}

	}

}
