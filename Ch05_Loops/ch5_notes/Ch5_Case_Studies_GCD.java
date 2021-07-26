package ch5_notes;
import java.util.*;

/* program that prompts the user to enter two positive integers and finds their greatest common divisor.
 * 
 */

public class Ch5_Case_Studies_GCD
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int gcd = 1;
		int k = 2;
		
		int n1;
		int n2;
		
		System.out.print("Enter first integer: ");
		n1 = kb.nextInt();
		System.out.print("Enter second integer: ");
		n2 = kb.nextInt();
		
		do 
		{	
			if ((n1 % k == 0) && (n2 % k == 0))
			{
				gcd = k;
			}
			k++;
		} while ((k <= n1) && (k <= n2));
		
		System.out.println("The GCD of " +n1 + " and " + n2 + " is " + gcd);

	}

}
