package ch6notes;
import java.util.*;

	/*  2017 summary: Overloading methods can make programs clearer and more readable. Methods that perform 
	 * the same function with different types of parameters should be given the same name.
	 * Overloaded methods must have different PARAMETERS lists. You CANNOT overload methods based on different 
	 * modifiers or return types.
	 * 
	 * 
	 * Overloading methods enables you to define the methods with the SAME NAME as long as their signatures are different.
	 *
	 * What if you wanna create a method that returns a max value but that value to check could be EITHER  int or double?
	 * The solution is to create another method with the same name but different parameters,
	 * So one would be public static int max(int num1, int num2)
	 * and the other public static double max(double num1, double num2)
	 * 
	 * If you call max with int parameters, the max method that expects int parameters will be invoked; if you call max with 
	 * double parameters, the max method that expects double parameters will be invoked. This is referred to as method 
	 * overloading; that is, two methods have the same name but different parameter lists within one class. The Java 
	 * compiler determines which method to use based on the method SIGNATURE.
	 */

public class Ch6_Overloading_And_Scopes
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("The maximum of 3 and 4 is " + max(3,4));
		System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
		System.out.println("The maximum of 3.0, 5.4 and 10.14 is " + max(3.0, 5.4, 10.14));

	}
	
	/* Below is a program that creates three methods. The first finds the maximum integer, the second finds the maximum 
	 * double, and the third finds the maximum among three double values. All three methods are named max.
	 */
	
	/* You may be wondering why the method max(double, double) is not invoked for the call max(3, 4).
	 * Both max(double, double) and max(int, int) are possible matches for max(3, 4).The Java compiler finds the method
	 * that best matches a method invocation. max(int, int) is used to invoke max(3, 4).
	 * 
	 */
	public static int max(int num1, int num2)
	{
		if (num1 > num2)
		{
			return num1;
		}
		
		else
		{
			return num2;
		}
	}
	
	/* Can you invoke the max method with an int value and a double value, such as max(2, 2.5)? If so, which of the max 
	 * methods is invoked? The answer to the first question is yes. The answer to the second question is that the max method 
	 * for finding the maximum of two double values is invoked. The argument value 2 is automatically converted into a 
	 * double value and passed to this method.
	 */	
	public static double max(double num1, double num2)
	{
		if (num1 > num2)
		{
			return num1;
		}
		
		else 
		{
			return num2;
		}
	}
	
	public static double max(double num1, double num2, double num3)
	{
		return max(max(num1, num2), num3);
	}
	/* So max(max(num1, num2), num3).......first within the bracket, max(num1,num2) is first invoked which returns the 
	 * largest of num1 and num2, that value then is placed with num3 to call max(largest, num3) and the double max(dub n1,
	 * dub n2) meth above is invoked again to return the largest num...Recall it doesn't matter what you call the parameter
	 * max (val1, val2) is how it operates (in the arguments). 
	 */
}

/*
 * A variable defined inside a method is referred to as a local variable. The scope of a local variable starts from its 
 * declaration and continues to the end of the block that contains the variable. A local variable must be declared and 
 * assigned a value before it can be used.
A parameter is actually a local variable. The scope of a method parameter covers the entire method. 
A variable declared in the initial-action part of a for-loop header has its scope in the entire loop. However, a variable 
declared inside a for-loop body has its scope limited in the loop body from its declaration to the end of the block that 
contains the variable,
*/

//A variable can be declared multiple times in nonnested blocks, but only once in nested blocks.