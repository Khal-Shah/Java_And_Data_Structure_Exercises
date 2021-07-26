package ch6notes;
import java.util.*;

		/* A void method does not return a value.
		 */

public class Ch6_VoidMethds_Arguments_604_605
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
//		System.out.print("The grade is ");	//can't do + printGrade(99)
//		printGrade(99);			//have to do it separately. Call for VOID method must be a STATEMENT

		//In contrast, when you have a meth that returns, you can invoke it from println
//		System.out.println("The grade is " + getGrade(79));
		
//		nPrintln("Hello", 5);
		//thestatement nPrintln(3, "Hello") would be wrong. The data type of 3 does not match the data type for the first 
		//parameter, message, nor does the second argument, Hello, match the second parameter, n.
		
//		int x = 1;
//		System.out.println("Before the call, x is " + x);
//		increment(x);																//can pass variable (in argument) to the method as well.
//		System.out.println("After the call, x is " + x);			//But variable in the main isn't affected. 
		
		int num1 = 1, num2 = 2;
		System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
		 swap(num1, num2);
		 
		 System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
		
	}
	
	/* gives a program that defines a method named printGrade and invokes it to print the grade for a given score */

//	public static void printGrade(double score)
//	{
//		if (score >= 90)
//		{
//			System.out.println("A");
//		}
//		
//		else 	if (score >= 80)
//		{
//			System.out.println("B");
//		}
/*To see the differences between a void and value-returning method, let’s redesign the printGrade method to return a 
 * value. The new method, which we call getGrade, returns the grade as shown 
 * }
 */
//		public static char getGrade(double score)
//		{
//			if (score >= 90)
//			{
//				return 'A';
//			}
//			
//			else if (score >= 80)
//			{
//				return 'B';
//			}
//			
//			else
//			{
//				return 'F';
//			}
//		}
		
		/* The power of a method is its ability to work with parameters. When calling a method, you need to provide 
		 * arguments, which must be given in the same order as their respective parameters in the method signature. 
		 * This is known as parameter order association. For example, the following method prints a message n times:
		 */
		
//		public static void nPrintln (String message, int n)
//		{
//			for (int i = 1; i <= n; i++)
//			{
//				System.out.println(message);
//			}
//		}
															//x is passed here into n (n = x = 1)
//		public static void increment(int n)
//		{
//			n++;		//2
//			System.out.println("n inside the method is " + n);		//2
//		}
	
	/* The program creates a method for swapping two variables. The swap method is invoked by passing two 
	 * arguments. Interestingly, the values of the arguments are not changed after the method is invoked.
	 */
		public static void swap(int n1, int n2)
		{
			System.out.println("\tInside the swap method");
			System.out.println("\t\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);
			
			//now swap:
			int temp = n1;
			n1 = n2;
			n2 = temp;
			
			System.out.println("\t\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
			
		}
		
		/* the values of the arguments num1 and num2 are passed to n1 and n2, but n1 and n2 have their own memory 
		 * locations independent of num1 and num2. Therefore, changes in n1 and n2 do not affect the contents of num1 
		 * and num2.
		 */
	
}