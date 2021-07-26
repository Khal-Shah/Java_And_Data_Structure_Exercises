package ch6notes;
import java.util.Scanner;


/* Chapter 6 - Exercise 38:
 * (Generate random characters) Use the methods in RandomCharacter in Listing 6.10 to print 100
 * uppercase letters and then 100 single digits, printing ten per line.
 */
//By Khaled shah

public class Ch6_Practice
{

	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{

		generateRandom();
	}

	static void generateRandom()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.print((char) ((int) (65 + Math.random() * 26)) + "\t");

			if(i % 10 == 0)
			{
				System.out.println();
			}
		}

		for (int i = 1; i <= 100; i++)
		{
			System.out.print((int) (-9 + Math.random() * 19) + "\t");

			if(i % 10 == 0)
			{
				System.out.println();
			}
		}
	}

}