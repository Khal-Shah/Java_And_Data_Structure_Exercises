package ch18exercises;
import java.util.Scanner;

/**
 *  Chapter 18 - Exercise 8:
 * (Print the digits in an integer reversely)
 * Write a recursive method that displays an int value reversely on the console using the following header:
   public static void reverseDisplay(int value)
   For example, reverseDisplay(12345) displays 54321. Write a test program
   that prompts the user to enter an integer and displays its reversal.

 @author Khaled
 */

public class Ch18_08_Reverse_Ints
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer that you'd like to display in reverse: ");
		int value = kb.nextInt();
		
		reverseDisplay(value);

	}
	
	/*public static void reverseDisplay(int value)
	{
		String val = value + "";
		System.out.print(val.charAt(val.length() - 1));
		
		if(val.length() == 1)
		{
			System.exit(0);
		}
		val = val.substring(0, val.length() - 1);
		reverseDisplay(Integer.parseInt(val));
	}*/
	
	//Without converting to string:
	public static void reverseDisplay(int value)
	{
		if (value != 0)
		{
			System.out.print(value % 10);
			value /= 10;
			reverseDisplay(value);
		}
	}

}
