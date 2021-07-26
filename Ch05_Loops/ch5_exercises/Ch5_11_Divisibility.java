package ch5_exercises;
import java.util.Scanner;

	/* Chapter 5 - Exercise 11
	 * (Find numbers divisible by 5 or 6, but not both) 
	 * Write a program that displays all the numbers from 100 to 200, ten per line, that are divisible by 5 or 6, 
	 * but not both. Numbers are separated by exactly one space.
	 */
			//By Khaled Shah

public class Ch5_11_Divisibility
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = 100;
		int hit = 0;
		
		
			do {
				while ((n % 5 == 0) ^ (n % 6 == 0))
				{
					System.out.print(n + " ");
					hit += 1;
					if (hit % 10 == 0)
					{
						System.out.println();
					}
					n++;
				}
				n++;
			} while (n <= 200);
		
			
			
		

	}

}
