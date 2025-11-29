package Demo;

import java.util.*;

public class difference {

    public static void main(String[] args) {

    	 System.out.println("=== Difference Between HashSet, LinkedHashSet, and TreeSet ===\n");

         // 1. HashSet
         System.out.println("1. HashSet:");
         System.out.println("- HashSet does not maintain any order of elements.");
         System.out.println("- It is backed by a HashMap, so operations like add, remove, and contains work in O(1) average time.");
         System.out.println("- Used when we only care about uniqueness and fast performance, not order.\n");

         Set<String> hashSet = new HashSet<>();
         hashSet.add("B");
         hashSet.add("A");
         hashSet.add("D");
         hashSet.add("C");

         System.out.println("HashSet Output (No Order): " + hashSet + "\n");


         // 2. LinkedHashSet
         System.out.println("2. LinkedHashSet:");
         System.out.println("- Maintains the insertion order of elements.");
         System.out.println("- Internally uses a LinkedHashMap, which keeps a doubly-linked list of all entries.");
         System.out.println("- Performance similar to HashSet (O(1)), but slightly more memory usage.");
         System.out.println("- Used when we need unique elements + predictable insertion order.\n");

         Set<String> linkedHashSet = new LinkedHashSet<>();
         linkedHashSet.add("B");
         linkedHashSet.add("A");
         linkedHashSet.add("D");
         linkedHashSet.add("C");

         System.out.println("LinkedHashSet Output (Insertion Order): " + linkedHashSet + "\n");


         // 3. TreeSet
         System.out.println("3. TreeSet:");
         System.out.println("- Stores elements in sorted (ascending) order.");
         System.out.println("- It is backed by a TreeMap, which uses a Red-Black Tree.");
         System.out.println("- Operations take O(log n) time.");
         System.out.println("- Does not allow null values.");
         System.out.println("- Used when we need unique elements + sorting (natural or custom Comparator).\n");

         Set<String> treeSet = new TreeSet<>();
         treeSet.add("B");
         treeSet.add("A");
         treeSet.add("D");
         treeSet.add("C");

         System.out.println("TreeSet Output (Sorted Order): " + treeSet + "\n");
    }
}
