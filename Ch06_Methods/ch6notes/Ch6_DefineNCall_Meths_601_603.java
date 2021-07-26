package ch6notes;
import java.util.*;

public class Ch6_DefineNCall_Meths_601_603
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
//		System.out.println("Sum from 1 to 10 is: " + sum(1,10));
		int i = 5;				// There are two ways to call a method, you can assign what is being returned to a variable
		int j = 5;			
		int k = max(i, j);				//what is returned from max method (w/parameters i & j) is stored in var k
		System.out.println(" The maximum of " + i + " and " + j + " is " + k);
		
		//Or you could simply do call it from within println: + methName(para1, para2) (can't do this for no return meth)
//		System.out.println("The bigger number is: " + max(5,5));

	}
	
	/* A method definition consists of its method name, parameters, return value type, and body.
	 * The syntax for defining a method is as follows:
  public static 				int									sum					int i1, int i2
  modifier             returnValueType 		methodName(list of parameters) 
  {
    // Method body;
  }																					void can still take arguments, but it only prints, 
  If a method doesn't return a value, it's called void: modifier would be public static, returnType would be void
	 this method returns the sum of continuous ints*/
	public static int sum (int i1, int i2)
	{
		int result = 0;
		for (int i = i1; i <= i2; i++)
		{
			result += i;
		}
		return result;
	}
/*
Let’s look at a method defined to find the larger between two integers. This method, named max, has two int 
parameters, num1 and num2, the larger of which is returned by the method.
 */
	/* In the method header, you need to declare each parameter separately. For instance, max(int num1, int num2) 
	 * is correct, but max(int num1, num2) is wrong. */
	public static int max (int num1, int num2)
	{
		int maxN = (num1 > num2)? num1: num2;
		System.out.print(((num1 == num2)? "The two numbers are equal. " : ""));
		return maxN;
	}
	/* In order for a value-returning method (not void) to return a result, a return statement using the keyword return is 
	 * required. The method terminates when a return statement is executed. 
	 */
	
}
