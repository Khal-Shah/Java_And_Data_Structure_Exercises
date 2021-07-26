package ch6notes;
import java.util.*;

/*Methods can be used to reduce redundant code and enable code reuse. Methods can also be used to modularize 
 * code and improve the quality of the program.
 */

public class ch6_ModularizingCode
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
//		System.out.print("Enter first integer n1 = ");
//		int n1 = kb.nextInt();
//		System.out.print("Enter second integer n2 = ");
//		int n2 = kb.nextInt();
		
//		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
		
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);

	}
	
	/* we had written a program before that prompts the user to enter two integers and displays their greatest common 
	 * divisor. You can rewrite the program using a method, as shown below:
	 */
	public static int gcd(int n1, int n2)
	{
		int gcd = 0;
		int k = 2;
		
		while(k <=n1 && k <= n2)
		{
			if ((n1 % k == 0) && (n2 % k == 0))
			{
				gcd = k;
			}
			k++;
		}
		return gcd;
	}
	/* By encapsulating the code for obtaining the gcd in a method, this program has several advantages:
1. It isolates the problem for computing the gcd from the rest of the code in the main method. Thus, the logic becomes 
clear and the program is easier to read.
2. The errors on computing the gcd are confined in the gcd method, which narrows the scope of debugging.
3. The gcd method now can be reused by other programs.
	 */

	/* Similarly, we can use modularization to rewrite the program for finding prime numbers
	 */
	
	public static void printPrimeNumbers(int numberOfPrimes)
	{
		int totalPrimes = 0;
		int number = 2;
		
		while (totalPrimes < numberOfPrimes)
		{
			if (isPrime(number))
			{
				totalPrimes++;
			
			
				if (totalPrimes % 10 == 0)
				{
					System.out.printf("%-5s\n", number);
				}
			
				else
					System.out.printf("%-5s", number);
			}
			number++;
		}
	}
	
	public static boolean isPrime(int number)
	{
		for (int divisor = 2; divisor <= number / 2; divisor++)
		{
			if (number % divisor == 0)
			{
				return false;
			}
		}
		return true;
	}
	
}
