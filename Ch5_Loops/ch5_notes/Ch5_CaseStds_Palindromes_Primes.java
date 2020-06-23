package ch5_notes;
import java.util.*;

	/* a program that checks whether a string is a palindrome.
A string is a palindrome if it reads the same forward and backward. The words “mom,” “dad,” and “noon,” for instance, 
are all palindromes.
	 * 
	 */
public class Ch5_CaseStds_Palindromes_Primes
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
//		System.out.print("Enter a string: ");
//		String str = kb.nextLine();
//		
//		int low = 0;
//		int high = str.length() - 1;
//		
//		boolean isPalindrome = true;
//		
//		String strCheck = str.toLowerCase();
//		
//		while (low < high)
//		{
//			if (strCheck.charAt(low) != strCheck.charAt(high))
//			{
//				isPalindrome = false;
//				break;
//			}
//			low++;
//			high--;
//		}
//		
//		System.out.println(str + ((isPalindrome)? " is " : " is not") + " a palindrome.");
		
		// a program that displays the first fifty prime numbers in five lines, each containing ten numbers.
		//An integer greater than 1 is prime if its only positive divisor is 1 or itself.
		int num = 2;
		int prime = 0;
		
		
		do
		{
			boolean isPrime = true;
			for (int k = 2; k <= num / 2; k++)
			{
				if (num % k == 0)
				{
				isPrime = false;
				break;
				}
			}
			
				if (isPrime)
				{
					prime++;
				
				if (prime % 10 == 0)
				{
					System.out.println(num);
				}
				
				else
				{
					System.out.print(num + " ");
				}
				
				}
				
			num++;
		} while (prime < 50);

	}

}
