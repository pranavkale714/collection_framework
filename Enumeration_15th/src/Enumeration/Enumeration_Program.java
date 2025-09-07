package Enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Program {

	public static void main(String[] args) {
		Vector V=new Vector();
		V.add(10);
		V.add("deepak");
		V.add(10.3);
		
		Enumeration e=V.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
