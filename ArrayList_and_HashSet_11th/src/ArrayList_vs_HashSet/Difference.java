package ArrayList_vs_HashSet;

public class Difference {

	public static void main(String[] args) {
		System.out.println("1. Implementation:");
		System.out.println("ArrayList is the implementation of the List interface.");
		System.out.println("HashSet, on the other hand, is the implementation of a Set interface.");

		System.out.println("2. Internal implementation:");
		System.out.println("ArrayList internally implements array for its implementation.");
		System.out.println("HashSet internally uses HashMap for its implementation.");

		System.out.println("3. Order of elements:");
		System.out.println("ArrayList maintains the insertion order, i.e., the order of the objects in which they are inserted.");
		System.out.println("HashSet is an unordered collection and doesn't maintain any order.");

		System.out.println("4. Duplicates:");
		System.out.println("ArrayList allows duplicate values in its collection.");
		System.out.println("On the other hand, duplicate elements are not allowed in HashSet.");

		System.out.println("5. Index performance:");
		System.out.println("ArrayList uses index for its performance, i.e., it is index-based.");
		System.out.println("One can retrieve objects by calling get(index) or remove objects by calling remove(index).");
		System.out.println("HashSet is completely based on objects and doesn't provide a get() method.");

		System.out.println("6. Null Allowed:");
		System.out.println("Any number of null values can be inserted in ArrayList without any restriction.");
		System.out.println("On the other hand, HashSet allows only one null value in its collection, after which no null value is allowed to be added.");

	}

}
