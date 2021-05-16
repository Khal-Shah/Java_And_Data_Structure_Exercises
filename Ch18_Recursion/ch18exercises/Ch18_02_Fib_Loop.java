package ch18exercises;
import java.util.Scanner;

/** Chapter 18 - Exercise 2:
 * (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
Hint:To compute fib(n) without recursion,you need to obtain fib(n - 2) and fib(n - 1) first. 
Let f0 and f1 denote the two previous Fibonacci numbers.The current Fibonacci number would then be f0 + f1.
The algorithm can be described as follows:
f0 = 0; // For fib(0) 
f1 = 1; // For fib(1)
for (int i = 1; i <= n; i++) 
{ 
currentFib = f0 + f1;
f0 = f1;
f1 = currentFib;
}
       // After the loop, currentFib is fib(n)
Write a test program that prompts the user to enter an index and displays its Fibonacci number.

 	@author khaled Shah
 */

public class Ch18_02_Fib_Loop
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = kb.nextInt();
		
		System.out.println("Using loops, the Fibonacci number at index " + index + " is " + fiboLoops(index));

	}
	
	public static int fiboLoops(int index)
	{
		int f0 = 0;
		int f1 = 1;
		int fCurrent = 0;

		if(index == 1)
		{
			return f1;
		}
		
		for (int i = 1; i < index; i++)
		{
			fCurrent = f0 + f1;
			f0 = f1;
			f1 = fCurrent;
		}
		return fCurrent;
	}

}
