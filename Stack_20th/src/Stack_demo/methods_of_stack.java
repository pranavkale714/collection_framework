package Stack_demo;

import java.util.Stack;

public class methods_of_stack {

	public static void main(String[] args) {
		Stack s =new Stack();
		s.push("Pranav");
		s.push("amit");
		s.push(200);
		s.push(100.10);
		
		System.out.println(s);
		
		System.out.println(s.pop());
		//last element remove
		
		//upper element in stack
		System.out.println(s.peek());;
		
		//it will count from top
		System.out.println(s.search("Pranav"));
		
		//return false and true
		System.out.println(s.empty());
	
	}

}
