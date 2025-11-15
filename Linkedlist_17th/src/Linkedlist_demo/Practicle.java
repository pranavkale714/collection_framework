package Linkedlist_demo;

import java.util.LinkedList;

public class Practicle {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("Pranav");
		li.add("Pranita");
		li.addFirst("shubham");
		li.addLast("kale");
		li.removeFirst();
		li.removeLast();
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
	}

}
