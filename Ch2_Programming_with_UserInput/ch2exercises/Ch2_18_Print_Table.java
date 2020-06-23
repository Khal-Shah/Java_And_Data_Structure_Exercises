package ch2exercises;
import java.util.*;
	
		/* Chapter 2 - Exercise 18:
		 * (Print a table) Write a program that displays the following table. Cast floating- point numbers into integers.
			a 					b 					pow(a, b) 
			1					2						1 
			2					3						8
			3 					4					   81
			4 					5 					1024 
			5					6	 				15625
		 */
				//By Khaled Shah

public class Ch2_18_Print_Table
{

	public static void main(String[] args)
	{
		System.out.println("a\t\t\tb\t\t\tpow(a,b)");
		int a = 1, b = 2;
		
		for (int i = 1; i < 6; i++)
		{
			System.out.println(a + "\t\t\t" +b + "\t\t\t" + (int) Math.pow(a, b));
			a++;
			b++;
		}

	}

}
