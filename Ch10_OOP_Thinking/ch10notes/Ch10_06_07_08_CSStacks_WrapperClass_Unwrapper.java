package ch10notes;

/* 10.6: Case Study II - Designing a class for Stacks
 * Recall that a stack is a data structure that holds data in a last-in, first-out fashion: (data gets stacked on top of eachother)
 * Data1 gets put into empty stack 
 * |				 |					add data 2				|			   |		add data3						| 			   |
 * |  Data 1  |							=====>		| Data 2 |		======>						| Data 3 |
 * |________|													| Data 1 |												| Data 2 |
																		|_______|												| Data 1 |
																																		|_______|
 * Same process for removing data, first Data 3 (first out) would be removed, then Data 2, etc
 */



public class Ch10_06_07_08_CSStacks_WrapperClass_Unwrapper
{

	public static void main(String[] args)
	{
//		StackOfIntegers stack = new StackOfIntegers();
		
		//Push to stack
		//for (int i = 0; i < 32; i++)
		{
			//stack.push(i);
		}
		
		//while (!stack.isEmpty())
		{
			//System.out.println(stack.pop());
		}
		
		/* 10.7: PROCESSING PRIMITIVE DATA TYPE VALUES AS OBJECTS
		 * A primitive type value is not an object, but it can be wrapped in an object using a wrapper class in the Java API.
		
		 * Many Java methods require the use of OBJECTS AS ARGUMENTS. Java offers a convenient way to incorporate, 
		 * or wrap, a primitive data type into an object (e.g., wrapping int into the Integer class, wrapping double into the 
		 * Double class, and wrapping char into the Character class,). 
		 * By using a WRAPPER CLASS, you can process primitive data type values as objects. 
		 *Java provides Boolean, Character, Double, Float, Byte, Short, Integer, and Long wrapper classes in the 
		 *java.lang package for primitive data types. 
		 * The Boolean class wraps a Boolean value true or false. This section uses Integer and Double as examples to 
		 * introduce the numeric wrapper classes.
		 * 
		 * Numeric wrapper classes are very similar to each other. Each contains the methods doubleValue(), floatValue(), 
		 * intValue(), longValue(), shortValue(), and byteValue(). These methods “convert” objects into primitive type values. 
		 * Examples:
//		 */
//		System.out.println("The maximum integer is " + Integer.MAX_VALUE); 			//integer wrapper class
//		System.out.println("The minimum positive float is " + Float.MIN_VALUE);		//float wrapper class
//		System.out.println("The maximum double-precision floating-point number is " + Double.MAX_VALUE);
							//^double wrapper class........all classes have methods that you can use
		
		/* Each numeric wrapper class contains the methods doubleValue(), floatValue(), intValue(), longValue(), and 
		 * shortValue() for returning a double, float, int, long, or short value for the wrapper object. For example,
			new Double(12.4).intValue() returns 12;
			new Integer(12).doubleValue() returns 12.0;
		 * 
		 */
		System.out.println(new Double(12.4).intValue());			//12
		
		/*Similarly^
		 * new Double(12.4).compareTo(new Double(12.3)) returns 1; 
		 * new Double(12.3).compareTo(new Double(12.3)) returns 0; 
		 * new Double(12.3).compareTo(new Double(12.51)) returns -1;
		 * 
		 * The numeric wrapper classes have a useful static method, valueOf (String s). This method creates a new object 
		 * initialized to the value represented by the specified string. For example,
			Double doubleObject = Double.valueOf("12.4"); 
			Integer integerObject = Integer.valueOf("12");
			
			Integer.parseInt("11", 2) returns 3; 					11 in base 2 					
			Integer.parseInt("12", 8) returns 10; 				12 in base 8
			Integer.parseInt("13", 10) returns 13; 				 13 in base 10
			Integer.parseInt("1A", 16) returns 26;				  1A in base 16
			Integer.parseInt("val", base);
			Integer.parseInt("12", 2) would be an error because you can't write 12 in binary
			
			Note that you can convert a decimal number into a hex number using the format method. For example,
			String.format("%x", 26) returns 1A;
		 */
	
		//Double d = new Double();		can't be compiled, you have to pass val
		//System.out.println(i);
		
		/* 10.8: AUTOMATIC CONVERSION BETWEEN PRIMITIVE TYPES AND WRAPPER CLASS TYPES
		 * Converting a primitive value to a wrapper object is called boxing. The reverse conversion is called unboxing. 
		 * Java allows primitive types and wrapper classes to be converted automatically. The compiler will automatically 
		 * box a primitive value that appears in a context requiring an object, and will unbox an object that appears in a 
		 * context requiring a primitive value. This is called auto-boxing and auto-unboxing.
		 * 
		 * Ex:
		 * Instead of going all the way and doing Integer intObject = new Integer (2) to create an object with Wrapper class
		 * You could use the advantage of "autoboxing" which is to just do:
		 *  Integer intObject = 2;				(no need to complete it with = new class(2)}
		 *  
		 *  For an array, this allows you to just do Integer [] intArray = {1, 2, 3....}
		 */
		
		
	}

}

/* Stacks have many applications. For example, the compiler uses a stack to process method invocations. When a method 
 * is invoked, its parameters and local variables are pushed into a stack. When a method calls another method, the new 
 * method’s parameters and local variables are pushed into the stack. When a method finishes its work and returns to its 
 * caller, its associated space is released from the stack.
You can define a class to model stacks. For simplicity, assume the stack holds the int values. So name the stack class 
StackOfIntegers.
 */

//class StackOfIntegers
//{
//	private int [] elements; 				//An array to store integers in the stack. The number of integers in the stack.
//	private int size;							//The number of integers in the stack.
//	public static final int DEFAULT_CAP = 16;
//
//	//Constructs an empty stack with a default capacity of 16.
//	StackOfIntegers()
//	{
//		this (DEFAULT_CAP);				//assigns 16 to both
//	}
//
//	//Constructs an empty stack with a specified capacity.
//	StackOfIntegers (int size)
//	{
//		elements = new int [size];
//	}
//
//	//Returns true if the stack is empty.
//	public boolean isEmpty ()
//	{
//		return (size == 0);
//	}
//
//	//Returns the integer at the top of the stack without removing it from the stack.
//	public int peek()
//	{
//		return (elements[size-1]);
//	}
//
//	//Stores an integer into the top of the stack.
//	/* To implement push(int value), assign value to elements[size] if size < capacity. If the stack is full (i.e., size >= capacity),
//	 * create a new array of twice the current capacity, copy the contents of the current array to the new array, and assign
//	 * the reference of the new array to the current array in the stack. Now you can add the new value to the array.
//	 */
//	public void push (int value)
//	{
//		if (size >= elements.length)
//		{
//			int [] temp = new int [elements.length * 2];
//			System.arraycopy(elements, 0, temp, 0, elements.length);
//			elements = temp;
//		}
//		elements[size++] = value;
//	}
//
//	//Removes the integer at the top of the stack and returns it.
//	public int pop()
//	{
//		return (elements [--size]);
//	}
//
//	//Returns the number of elements in the stack
//	public int getSize()
//	{
//		return size;
//	}
//
//	public void displayStack ()
//	{
//		for (int i = 0; i < elements.length; i++)
//		{
//			System.out.println(elements [i]);
//		}
//	}
	
//}

