package ch6exercises;

/* Chapter 6 - Exercise 12:
 * (Display characters) Write a method that prints characters using the following header:
public static void printChars(char ch1, char ch2, int numberPerLine)
This method prints the characters between ch1 and ch2 with the specified numbers per line. 

Write a test program that prints ten characters per line from 1 to Z. Characters are separated by exactly one space.
 */
		//By Khaled Shah

public class Ch6_12_Display_Chars
{
	final static int NUM_PER_LINE = 10;

	public static void main(String[] args)
	{
		printChars('1', 'Z', NUM_PER_LINE);

	}
	
	public static void printChars (char ch1, char ch2, int numPerLine)
	{
		int totalItems = 1;
		
		for (ch1 = (char) (ch1 + 1); ch1 < ch2; ch1++)
		{
			System.out.print(ch1+ "  " + ((totalItems % numPerLine == 0)? "\n" : ""));
			totalItems++;
		}
	}

}
