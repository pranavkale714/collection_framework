package HashTable_Demo;

import java.util.Hashtable;

public class Working_of_Hashtable {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		
		//unique hash code will generate
		ht.put(106, "Pranav");
		//hashcode=106%11=reminder=7
		
		ht.put(102, "Kale");
		ht.put(117, "rahul");
		//reminder=7
		//in this case on 7th position element already present
		//This is known as Hash-collision.
		//it will add node position.
		
		//Element will retrive base on second property
		System.out.println(ht);
		
		
		

	}

}
