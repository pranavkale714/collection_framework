package Hashmap_Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Retriving_HashMap_Elements {

    public static void main(String[] args) {
        
        System.out.println("HashMap elements can be retrieved in 2 ways");
        System.out.println("1. Using entrySet() with Iterator");
        System.out.println("2. Directly using for-each loop");

     
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Pranav");
        map.put(2, "Java");
        map.put(3, "Developer");

    
        Set set = map.entrySet();  
        
        System.out.println(set);
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
