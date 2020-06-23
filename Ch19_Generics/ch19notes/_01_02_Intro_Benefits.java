package ch19notes;
import java.util.ArrayList;

/* Chapter 19 - GENERICS: Generics enable you to detect errors at compile time rather than at runtime.
 * The key benefit of generics is to enable errors to be detected at compile time rather than at runtime. 
 * A generic class or method permits you to specify allowable types of objects that the class or method can work with. 
 * If you attempt to use an incompatible object, the compiler will detect that error.
 */

/* Replacing a generic type is called a generic instantiation. By convention, a single capital letter such as E or T is used 
 * to denote a formal generic type.
To see the benefits of using generics, let us examine the code below. 
The statement declares that c is a reference variable whose type is Comparable and invokes the compareTo 
method to compare a Date object with a string. The code compiles fine, but it has a RUNTIME error because a string 
cannot be compared with a date.
 * 
 * Comparable c = new Date();
 * sysout(c.compareTo("red"));
 * 
 * Comparable<Date> c = new Date(); 
 * System.out.println(c.compareTo("red"));
 * 
 * The statement above otoh, declares that c is a reference variable whose type is Comparable<Date> and invokes the 
 * compareTo method to compare a Date object with a string. This code generates a COMPILE error, because the 
 * argument passed to the compareTo method must be of the Date type. Since the errors can be detected at compile 
 * time rather than at runtime, the generic type makes the program more reliable.
 * 
 * 
ArrayList was introduced in Section 11.11, The ArrayList Class. This class has been a generic class since JDK 1.5. 
Below is the class diagram for ArrayList after JDK 1.5:
 * +ArrayList()
+add(o: E): void
+add(index: int, o: E): void 
+clear(): void
+contains(o: Object): boolean 
+get(index:int): E 
+indexOf(o: Object): int 
+isEmpty(): boolean 
+lastIndexOf(o: Object): int 
+remove(o: Object): boolean 
+size(): int
+remove(index: int): boolean 
+set(index: int, o: E): E
 */

public class _01_02_Intro_Benefits
{

	public static void main(String[] args)
	{
		//For example, the following statement creates a list for strings:
		ArrayList <String> list = new ArrayList<>();
		//You can now add only strings into the list. For instance,

		list.add("Red");
		//If you attempt to add a nonstring, a compile error will occur. For example, the following statement is now illegal, 
		//because list can contain only strings.
	//	list.add(new Integer(1));
		
		//Generic types must be reference types. You cannot replace a generic type with a primitive type such as int, double, 
		//or char. For example, the following statement is wrong
		//ArrayList <int> intList = new ArrayList <>();
					//^generic type must be reference/obj types
		//To create an arraylist of int values we have to use:
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(3);
		System.out.println(intList.get(0)); 		//prints 3
		
		//since generic type is Integer, we can't use double, it'll give us compile error
		//intList.add(2.3);
	
		
		/* Note: Java automatically wraps 3 into new Integer(3). This is called autoboxing, as introduced in Section 10.8, 
		 * (we don't have to do intList.add(new Integer(3));
		 */
		//Generic types don't require casting, so for instance I can do ArrayList<Double> dList = new ArrayList<>();
																													//dList.add(3.5);
													//then pass it to wrapper types:			Double dObj = dList.get(0);
																	//							or:					double d = dList.get(0);
		//Prior to JDK 1.5, we would've needed to do Double dOjb = (Double) dList.get(0);
	}			

}
