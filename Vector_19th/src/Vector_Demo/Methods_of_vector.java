package Vector_Demo;

import java.util.Vector;

public class Methods_of_vector {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        // Adding
        v.add("A");
        v.addElement("B");
        v.add(1, "C");

        // Access
        System.out.println(v.get(0));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        // Update
        v.set(1, "D");

        // Search
        System.out.println(v.contains("A"));
        System.out.println(v.indexOf("D"));

        // Remove
        v.remove("A");
        v.removeElementAt(0);

        // Capacity & Size
        System.out.println(v.size());
        System.out.println(v.capacity());

        // Iterate
        for(String s : v){
            System.out.println(s);
        }

        // Clear
        v.clear();
    }
}
