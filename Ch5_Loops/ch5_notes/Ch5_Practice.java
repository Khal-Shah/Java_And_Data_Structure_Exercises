package ch5_notes;
import java.util.Scanner;

/* Chapter 5 - Exercise 15:
 * (Display the ASCII character table) Write a program that prints the characters in the ASCII character table from ! to ~.
 * Display ten characters per line. The ASCII table is shown in Appendix B. Characters are separated by exactly one space.
 */
//By Khaled Shah


public class Ch5_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		//decimal index 33 to 126 according to ASCII table
		int startAt = 33;

		for (int i = startAt; i <= 126; i++)
		{
			System.out.print((!((i > 33) && ((i - 3) % 10 == 0) )? "" : "\n") + (char) i + "\t");
		}
	}

}

