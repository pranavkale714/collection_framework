package Collection_Interface;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		//ADD Method
		a1.add("a");
		a1.add(1);
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		//ADD Method
		a2.add("ddd");
		a2.add("eee");
		a2.addAll(a1);
		System.out.println(a2);
		
		
		//contains method
		System.out.println(a2.contains("eee"));
		
		//isempty
		System.out.println(a2.isEmpty());
		
		//size
		System.out.println(a1.size());
		
		//remove
		System.out.println(a2);
		a2.remove("eee");
		System.out.println(a2);
		
		//removeall
		a2.removeAll(a1);
		System.out.println(a2);
		
		

	}

}
