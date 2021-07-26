package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 17
 * (Display pyramid) Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid, 
 * as shown in the following sample run:
 */
		//By Khaled Shah

public class Ch5_17_Pyramid_Pattern
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the number of lines: ");
		int row = kb.nextInt();
		int col = 1;
		int k = 1;
		
		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= col; j++)
			{
				if (j <= i)
				{
					k++;
				}
				
				else
				{
					k--;
				}
				System.out.print("\t" + k + "\t");
			}
			System.out.println();
			col += 2;
		}

	}

}
