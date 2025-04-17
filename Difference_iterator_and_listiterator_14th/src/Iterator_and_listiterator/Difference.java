package Iterator_and_listiterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Difference {
	public static void main(String[] args) {
		System.out.println("1.We can retrive elements in forward order only");
		System.out.println("1.We can retrive elements in forward and backword direction");
		
		System.out.println("2.has.next() method only");
		System.out.println("2.has.next() and has.previous method");
		
		System.out.println("3.we can get iterator cursor by iterator method");
		ArrayList  a=new ArrayList();
		 Iterator r=a.iterator();
		System.out.println("3.We can get listiterator cursor by listIterator method");
		ListIterator b=a.listIterator();	
		
		System.out.println("4.Iterator can be use with any collection object");
		System.out.println("4.ListIterator can be use with list impleted class only");
		System.out.println("ex-1.Linked list 2.Vector 3.stack 4.Arraylist");
		
		System.out.println("5.using it we can 1.read or retirve 2.remove");
		System.out.println("5.using it we can 1.read 2.remove 3.replace 4.add");
	}
}
