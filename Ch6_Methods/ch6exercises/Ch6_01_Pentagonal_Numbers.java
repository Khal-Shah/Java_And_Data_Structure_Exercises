package ch6exercises;
import java.util.Scanner;

		/* Chapter 6 - Exercise 1:
		 * (Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for n = 1,2,...,and so on.
		 * Therefore, the first few numbers are 1, 5, 12, 22,.... Write a method with the following header that returns a 
		 * pentagonal number:	public static int getPentagonalNumber(int n)
		Write a test program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.
		 */
				//By Khaled Shah

public class Ch6_01_Pentagonal_Numbers
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.print(((i % 10 == 0)? getPentagonalNumber(i) + "\n" : (getPentagonalNumber(i)) +"\t"));
		}
	}
	
	public static int getPentagonalNumber(int n)
	{
		int pentN = (n * (3 * n - 1)) / 2;
		return pentN;
	}

}
