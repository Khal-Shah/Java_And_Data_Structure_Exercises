package ch11notes;
import java.util.ArrayList;
import java.util.Collections;

/* 11.13: CASE STUDY: CUSTOM STACK CLASS
 * This section designs a stack class for holding objects.
 * -list: ArrayList<Object>
+isEmpty(): boolean
+getSize(): int
+peek(): Object
+pop(): Object
+push(o: Object): void
 
 */

class MyStack
{
	private ArrayList <Object> list = new ArrayList <> ();
	
	public boolean isEmpty()
	{
		return (list.isEmpty());
	}
	
	public int getSize()
	{
		return list.size();
	}
	
	//Returns the top element in this stack without removing it.
	public Object peek()
	{
		return (list.get(list.size() - 1));				//the last/top object
	}
	
	//Returns and removes the top element in this stack.
	public Object pop()
	{
		//return list.remove(list.size() - 1);
		Object o = list.get(list.size() - 1);			//last element/obj in stack
		list.remove(list.size() - 1);				//removes the last object in stack
		return o;											//returns last obj (before removing it)
	}
	
	//Adds a new element to the top of this stack
	public void push (Object o)
	{
		list.add(o);
	}
	
	@Override
	public String toString()
	{
		return ("Stack consists of: \n" + list.toString());
	}
	
	/* The toString() method defined in the Object class is overridden to display the contents of the stack by invoking 
	 * list.toString(). The toString() method implemented in ArrayList returns a string representation of all the elements in 
	 * an array list.
	 */
	
	/* 11.14: PROTECTED DATA & METHODS:
	 * A protected member of a class can be accessed from a subclass.
	 * Often it is desirable to allow subclasses to access data fields or methods defined in the superclass, but not to allow 
	 * non-subclasses to access these data fields and methods. To accomplish this, you can use the protected keyword. 
	 * This way you can access protected data fields or methods in a superclass from its subclasses.
	 * 
	 * The modifiers private, protected, and public are known as visibility or accessibility modifiers because they specify 
	 * how classes and class members are accessed. 
	 * The visibility of these modifiers increases in this order: private > default (no mod) > proteted > public
	 * private: only same class
	 * default (no modifier): same class and same package (but not different package)
	 * protected: same class, subclass (of any package),  same package
	 * public: anywhere
	 */
	
	/* 11.15: PREVENTING EXTENDING AND OVERRIDING
	 * Neither a final class nor a final method can be extended. A final data field is a constant.
	 * You may occasionally want to prevent classes from being extended. In such cases, use the final modifier to 
	 * indicate that a class is final and cannot be a parent class. 
	 * The Math class is a final class. The String, StringBuilder, and StringBuffer classes are also final classes. 
	 * For example, the following class A is final and cannot be extended:
		public final class A 
		{
		// Data fields, constructors, and methods omitted
		 }
		 
		 You also can define a method to be final; a final method cannot be overridden by its subclasses.
For example, the following method m is final and cannot be overridden: 
public class Test 
{
    // Data fields, constructors, and methods omitted
	public final void m() 
	{
	 // Do something
	} 
	}
	The modifiers public, protected, private, static, abstract, and final are used on classes and class members 
	(data and methods), except that the final modifier can also be used on local variables in a method. 
	A final local variable is a constant inside a method.
	 */
	
}


public class _13_14_15_ObjStacks_Protected_Prevention
{

	public static void main(String[] args)
	{

	}

}
