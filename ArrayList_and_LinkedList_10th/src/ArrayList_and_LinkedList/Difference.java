package ArrayList_and_LinkedList;

public class Difference {

	public static void main(String[] args) {
		System.out.println("1. ArrayList internally uses a dynamic array to store the elements.");
		System.out.println("1. LinkedList internally uses a doubly linked list to store the elements.");

		System.out.println("2. Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory.");
		System.out.println("2. Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.");

		System.out.println("3. An ArrayList class can act as a list only because it implements List only.");
		System.out.println("3. LinkedList class can act as a list and queue both because it implements List and Deque interfaces.");

		System.out.println("4. ArrayList is better for storing and accessing data.");
		System.out.println("4. LinkedList is better for manipulating data.");

		System.out.println("5. The memory location for the elements of an ArrayList is contiguous.");
		System.out.println("5. The location for the elements of a linked list is not contiguous.");

		System.out.println("6. Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.");
		System.out.println("6. There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is initialized.");

		System.out.println("7. To be precise, an ArrayList is a resizable array.");
		System.out.println("7. LinkedList implements the doubly linked list of the List interface.");
		}

	}