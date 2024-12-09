package ArrayList_and_Vector;

public class Difference {

public static void main(String[] args) {
System.out.println("1. ArrayList is not synchronized.");
System.out.println("1. Vector is synchronized.");

System.out.println("2. ArrayList increments 50% of current array size if the number of elements exceeds its capacity.");
System.out.println("2. Vector increments 100%, meaning it doubles the array size if the total number of elements exceeds its capacity.");

System.out.println("3. ArrayList is not a legacy class. It was introduced in JDK 1.2.");
System.out.println("3. Vector is a legacy class.");

System.out.println("4. ArrayList is fast because it is non-synchronized.");
System.out.println("4. Vector is slow because it is synchronized. In a multithreading environment, it holds other threads in runnable or non-runnable state until the current thread releases the lock of the object.");

System.out.println("5. ArrayList uses the Iterator interface to traverse the elements.");
System.out.println("5. Vector can use the Iterator interface or Enumeration interface to traverse the elements.");
}
}