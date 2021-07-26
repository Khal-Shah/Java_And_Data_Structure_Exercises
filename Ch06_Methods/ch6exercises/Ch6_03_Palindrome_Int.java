package ch6exercises;
import java.util.Scanner;

/* Chapter 6 - Exercise 3:
 * (Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. 
Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
 */
		//By Khaled Shah

public class Ch6_03_Palindrome_Int
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer: ");
		int num = kb.nextInt();
		
		//System.out.println("The reverse of " + num + " is " + reverse(num));
		System.out.println(num + " is " + ((isPalindrome(num))?  " a " :  " not a ") + "palindrome.");

	}
	
	public static int reverse (int number)
	{
		String num = "" + number;
		String reverse = "";
		
		for (int i = (num.length() - 1); i >= 0; i--)
		{
			reverse += num.charAt(i);
		}
		
		return (Integer.parseInt(reverse));
		
	}
	
	public static boolean isPalindrome(int number)
	{
		return ((number == reverse(number))? true : false);
	}

}
