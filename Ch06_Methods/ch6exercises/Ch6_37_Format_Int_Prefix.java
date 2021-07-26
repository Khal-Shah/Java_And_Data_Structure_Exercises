package ch6exercises;
import java.util.Scanner;

/* Chapter 6 - Exercise 37
 * (Format an integer) Write a method with the following header to format the integer with the specified width.
public static String format(int number, int width)
The method returns a string for the number with one or more prefix 0s. 
The size of the string is the width .For example, format(34, 4) returns 0034 and format(34, 5) returns 00034.
If the number is longer than the width, the method returns the string representation for the number. 
For example, format(34, 1) returns 34.
Write a test program that prompts the user to enter a number and its width and displays a string returned by invoking 
format(number, width).
 */
		//By Khaled Shah

public class Ch6_37_Format_Int_Prefix
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an integer and how long do you want it's width to be (filled with leading 0's).\n");
		System.out.print("Integer number: ");
		int number = kb.nextInt();
		
		System.out.print("Formatted width of the number: ");
		int width = kb.nextInt();
		
		System.out.println(format(number, width));
	}
	
	public static String format(int number, int width)
	{
		//same as System.out.printf("%0" + width + "d", number) But can't return sysout.printf as a String
		//System.out.printf("%0" + width + "d\n", number);
		return String.format("%0" + width +"d", number);
	}
}
