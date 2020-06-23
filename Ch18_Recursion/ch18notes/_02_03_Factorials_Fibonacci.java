package ch18notes;
import java.util.Scanner;

public class _02_03_Factorials_Fibonacci
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
	//	System.out.println("The factorial of 5 is " + Factorials.factorials(5));

		System.out.print("Enter an index for a Fibonacci number: ");
		int index = kb.nextInt();
		
		System.out.println("The Fibonacci number at index " + index + " is " + Fibonacci.computeFibonacci(index));
		
	}
	
	//1) racecar....2) aceca...3) cec...4) e
		public static boolean isPalindrome(String s)
		{
			if (s.length() <= 1)
			{
				return true;				//finished
			}
			
			else if (s.charAt(0) != s.charAt(s.length() - 1))
			{
				return false;			//chars don't match (not palindrome)
			}
			
			else
			{
				return	isPalindrome(s.substring(1, s.length() - 1));		//recursive call
			}
		}
		/*Every recursive call reduces the original problem, bringing it increasingly closer to a
	base case until it becomes that case.
	In general, to solve a problem using recursion, you break it into subproblems. Each sub- problem is the same as the 
	original problem but smaller in size. You can apply the same approach to each subproblem to solve it recursively.
		 * 
		 * One or more base cases (the simplest case) are used to stop recursion. Every recursive call reduces the original 
		 * problem, bringing it increasingly close to a base case until it becomes that case.
		 * 
		 * Base case: where the method stops
		 *  public static void xMethod(int n) {
	    if (n > 0) {																base case...when does it stop?........ <= 0
	      System.out.print(n % 10);
	      xMethod(n / 10);
	    }
	  }									
		 *
	      return n + xMethod(n - 1); 				if 5 is passed
	      n = 5 + n = 4 + n = 3 + n = 2 + n = 1 but for n = 1, it doesn't reach the recursive call, it just RETURNS 1
	      //so sum = 5 + 4 + 3 + 2 + 1															since last recursive call is still going (ended with +)
	       *																											it adds that 1 to the sum
	      	 */
		
		public static void xMethod (int n) 
		{
		    if (n > 0) 
		    {
		      xMethod(n - 1);
		      System.out.print(n + " ");
		    }
		  }

}


class Factorials
{
	/* A recursive method is one that invokes itself.
	 * n! = n × (n - 1)!; n > 0
	 */
	
	public static int factorials (int n)
	{
		
		if (n <= 1)
		{
			return 1;
		}
		
		return ( n * factorials(n - 1));
	}
	
}


class Fibonacci
{
	/* In this section, we show an example for creating an intuitive solution to a problem using recursion. 
	 * Consider the well-known Fibonacci-series problem:
	 * The series: 0 1 1 2 3 5 8 13 21 34 55 89 ... 
	 * indexes: 	0 1 2 3 4  5 6  7   8   9  10 11
		The Fibonacci series begins with 0 and 1, and each subsequent number is the sum of the preceding two. 
		The series can be recursively defined as:
      fib(0) = 0;
      fib(1) = 1;
      fib(index) = fib(index - 2) + fib(index - 1); index >= 2

		The recursive algorithm for computing fib(index) can be simply described as follows:
if (index == 0) 
return 0;
else if (index == 1) 
return 1;
else
return fib(index - 1) + fib(index - 2);
	 */
	
	public static int computeFibonacci(int index)
	{
		if (index == 0)		//base cases are 0 and 1
		{
			return 0;
		}
		
		else if (index == 1)
		{
			return 1;
		}
		
		else
		{
			return (computeFibonacci(index - 2) + computeFibonacci(index - 1));
		}		//invoked 25 times
		//if computeFib(6):...fib (4) ==> fib (2) + fib(3)
		//											fib(0) + fib(1)...fib(1) + fib (2)
				//																				fib(0) + fib (1)
		//									fib(5) ===> fib(3) + fib(4)
												//fib(1) + fib(2)...fib(2) + fib(3)===>fib(1) + fib (2)
		//											fib(0) + fib(1)...fib(0) + fib(1)		    	fib(0) + fib(1)
	}
}