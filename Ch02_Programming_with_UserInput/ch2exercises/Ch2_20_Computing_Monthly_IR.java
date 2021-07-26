package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 20:
		 * (Financial application: calculate interest) If you know the balance and the annual percentage interest rate, you can 
		 * compute the interest on the next monthly payment using the following formula:
		 * interest = balance * (annualInterestRate/1200)
		 * Write a program that reads the balance and the annual percentage interest rate and
			displays the interest for the next month. Here is a sample run:
			Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
			The interest is 2.91667
		 */
				//By Khaled Shah

public class Ch2_20_Computing_Monthly_IR
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter the balance and interest rate (e.g., 3 for 3%) below.");
		System.out.print("Balance: ");
		double balance = kb.nextDouble();
		System.out.print("Interest rate: ");
		double interestRate = kb.nextDouble();
		
		double interest = balance * (interestRate) / (12 * 100); 			//the 100 to convert IR% to decimal
		
		System.out.println("The interest is " + interest);
	}

}
