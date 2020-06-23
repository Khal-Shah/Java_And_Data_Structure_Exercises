package ch19notes;
import java.util.ArrayList;

/* 19.3: Defining Generic Classes and Interfaces:
 * A generic type can be defined for a class or interface. A concrete type must be specified when using the class to 
 * create an object or using the class or interface to declare a reference variable
 */

public class _03_04_Generic_ClassesNMethods
{

	public static void main(String[] args)
	{
		//The following example creates a stack to hold strings and adds three strings to the stack:
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		
		System.out.println(stack1.toString());			//stack: [London, Paris, Berlin]

		//This example creates a stack to hold integers and adds three integers to the stack:
		GenericStack<Integer> stack2 = new GenericStack<>(); 
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		
		System.out.println(stack2.toString());  					//stack: [1, 2, 3]
		
		/* 
		Instead of using a generic type, you could simply make the type element Object, which can accommodate any 
		object type. However, using generic types can improve software reliability and readability, because certain errors 
		can be detected at compile time rather than at runtime. For example, because stack1 is declared 
		GenericStack<String>, only strings can be added to the stack. It would be a compile error if you attempted to add 
		an integer to stack1.
		 * Occasionally, a generic class may have more than one parameter. In this case, place the parameters together 
		 * inside the brackets, separated by commas—for example, <E1, E2, E3>.
		 */
		
	
		Integer [] integers = {1, 2, 3, 4, 5};
		String [] strings = {"London", "Paris", "New York", "Austin"};

		//_03_04_Generic_ClassesNMethods.print(integers);				not like this but like...class.<GenType>methName(list)
		//_03_04_Generic_ClassesNMethods.<Integer>print(integers);
		//_03_04_Generic_ClassesNMethods.<String>print(strings);
		//or could just do:
		print(integers);
		print(strings);
	}

	/*You can also use generic types to define generic methods. For example, program below defines a generic method 
	 * print to print an array of objects.  
	 */
	public static <E> void print (E[] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	//To declare a generic method, you place the generic type <E> immediately after the keyword static in the method 
	//header. For example, public static <E> void print(E[] list)
}

/* -list: java.util.ArrayList<E>						arraylist to store elements
+GenericStack() 											creates an empty Stack
+getSize(): int 												returns number of elements in the list
+peek(): E														returns top element
+pop(): E														returns and removes top element
+push(o: E): void 										pushes/adds new element on top of stack
+isEmpty(): boolean									checks if stack is empty (returns true if it is)
 */

class GenericStack<E>			//Generic type E declared
{
	private ArrayList<E> list = new ArrayList<>();
	//could do private java.util.ArrayList<E> list = new java.util.ArrayList<>(); 			if no import up top
	
	public GenericStack()			//could do without it since empty constructor is implicit
	{
	
	}
	
	public int getSize()
	{
		return list.size();
	}
	
	public E peek()
	{
		return (list.get(getSize() - 1));
	}
	
	public E pop()
	{
		//Store the top element, remove it, return top element that you stored:
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	public void push(E o)
	{
		list.add(o);
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	@Override
	public String toString()
	{
		return ("stack: " + list.toString());
	}

}

/* You can also use generic types to define generic methods. For example, program below defines a generic method 
 * print to print an array of objects.  
 */

class GenericMethodDemo
{
	
}
