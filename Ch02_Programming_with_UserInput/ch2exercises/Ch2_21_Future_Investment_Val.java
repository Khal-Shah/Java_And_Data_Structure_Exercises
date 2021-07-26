package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 21:
		 * (Financial application: calculate future investment value) Write a program that reads in investment amount, 
		 * annual interest rate, and number of years, and displays the future investment value using the following formula:
		 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
		 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment 
		 * value is 1032.98. Here is a sample run:
		 * Enter investment amount: 1000.56
			Enter annual interest rate in percentage: 4.25
			Enter number of years: 1
			Accumulated value is $1043.92
		 */
				//By Khaled Shah.

public class Ch2_21_Future_Investment_Val
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the investment amount: ");
		double investmentAmount = kb.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annual_IR = kb.nextDouble();
		System.out.print("Enter number of years: ");
		int years = kb.nextInt();
		
		double investmentVal = investmentAmount * (Math.pow((1 + (annual_IR / 1200.0)), 12 * years));
		
		System.out.println("Accumulated value is $" + investmentVal);

	}

}
