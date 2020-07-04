package ch5_notes;
import java.util.Scanner;


/* Chapter 5 - Exercise 24
 * (Sum a series) Write a program to sum the following series:
1/3 + 3/5 + 5/7+ 7/9 +...+ 95/97 + 97/99
 */
//By Khaled Shah


public class Ch5_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("The series \"1/3 + 3/5 + 5/7+ 7/9 +...+ 95/97 + 97/99\" converges to ");
		double convergesTo = 0;
		int i = 1;

		while(i <= 97)
		{
			convergesTo += (i / (i + 2.0));
			i += 2;
		}

		System.out.print(convergesTo);

	}


}

