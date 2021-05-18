package ch18exercises;
import java.util.Scanner;

/**
Chapter 18 - Exercise 7:
 * (Fibonacciseries) ModifyListing18.2, ComputeFibonacci.java,
 * so that the program finds the number of times the fib method is called. 
 * (Hint: Use a static variable and increment it every time the method is called.)
 *
 * @author Khaled
 */

public class Ch18_07_Fib_Invoke_Count
{
	static Scanner kb = new Scanner(System.in);
	static int count = 0;

	public static void main(String[] args)
	{
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = kb.nextInt();
		
		System.out.println("The Fibonacci number at index " + index + " is " + fibonacci(index));
		System.out.println("The method was invoked " + count + " times.");

	}
	
	public static int fibonacci(int index)
	{
		count++;
		if (index == 0)
		{
			return 0;
		}
		
		else if (index == 1)
		{
			return 1;
		}
		
		else
		{
			return (fibonacci(index - 2) + fibonacci(index - 1));
		}
	}

}
