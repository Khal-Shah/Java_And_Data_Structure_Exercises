package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 5;
		 * (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then 
		 * computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate, 
		 * the program displays $1.5 as gratuity and $11.5 as total. 
		 * Here is a sample run:
		 * Enter the subtotal and a gratuity rate: 10 15
			The gratuity is $1.5 and total is $11.5
		 */
				//By Khaled Shah

public class Ch2_05_Calculate_Tips
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter the subtotal: ");
		double subtotal = kb.nextDouble();
		System.out.println("And what is the gratuity rate? Enter as a percentage (ex 10 or 15): ");
		double gRate = kb.nextDouble() / 100.0;
		
		System.out.printf("The gratuity rate is %.2f%% which amounts to a tip of $%.2f and a total of $%.2f", 
				gRate*100, subtotal*gRate, ((subtotal*gRate) + subtotal));	

	}

}
