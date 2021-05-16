package ch18exercises;
import java.math.BigInteger;
import java.util.Scanner;

/** Chapter 18 - Exercise 1:
 * (Factorial) Using the BigInteger class introduced in Section 10.9, you can find the factorial for a large number 
 * (e.g., 100!). Implement the factorial method using recursion. Write a program that prompts the user to enter an 
 * integer and displays its factorial.
 *
 * @author khaled Shah
 */
public class Ch18_01_BigFactorial
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer for which you want to find a factorial: ");
		int n = kb.nextInt();			//could also just input bigInt directly BigInteger bigInteger = kb.nextBigInteger();
		
		BigInteger bigInt = new BigInteger(n + "");
		
		System.out.println("The factorial of " + n + " is " + factorial(bigInt));

	}
	
	public static BigInteger factorial(BigInteger bigInt)
	{
		if (bigInt.compareTo(BigInteger.ONE) == 0)
		{
			return BigInteger.ONE;
		}
		
		return (bigInt.multiply(factorial(bigInt.subtract(BigInteger.ONE))));
	}

}
