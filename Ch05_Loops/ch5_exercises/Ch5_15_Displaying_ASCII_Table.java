package ch5_exercises;

/* Chapter 5 - Exercise 15:
 * (Display the ASCII character table) Write a program that prints the characters in the ASCII character table from ! to ~. 
 * Display ten characters per line. The ASCII table is shown in Appendix B. Characters are separated by exactly one space.
 */
		//By Khaled Shah

public class Ch5_15_Displaying_ASCII_Table
{

	public static void main(String[] args)
	{
		//decimal index 33 to 126 according to ASCII table
		int startAt = 33;
		
		for (int i = startAt; i <= 126; i++)
		{
			System.out.print((((i - 3) % 10 == 0 && (i > 33))? "\n" : "") + (char) i + " ");
			//starting at 33, until 126, 10 per line
		}

	}

}
