package ch6exercises;

import java.util.Scanner;

/* Chapter 6 - Exercise 7:
 * (Financial application: compute the future investment value) Write a method that computes future investment value 
 * at a given interest rate for a specified number of years. The future investment is determined using the formula in 
 * Programming Exercise 2.21.
 * * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
Use the following method header:
public static double futureInvestmentValue(
double investmentAmount, double monthlyInterestRate, int years)
For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
Write a test program that prompts the user to enter the investment amount (e.g., 1000) and the interest rate (e.g., 9%) 
and prints a table that displays future value for the years from 1 to 30, as shown below:
The amount invested: 1000
Annual interest rate: 9
  Years			Future Value
1							1093.80
2							1196.41
...
29						13467.25
30						 14730.57
 */
		//By Khaled Shah

public class Ch6_07_FutureValue
{

	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("The amount invested: ");
		double amount = kb.nextDouble();

		System.out.println("Annual interest rate: ");
		double iRate = kb.nextDouble();
		
		System.out.println("Years\t\t\tFuture Value");
		
		for (int years = 1; years <= 30; years++)
		{
			System.out.printf("%d\t\t\t\t$%.2f\n", years, (futureInvestmentValue(amount, (iRate / 1200), years)));
		}
		
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
	{
		//* futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
		double 	futureVal = investmentAmount * (Math.pow(1 + monthlyInterestRate, years * 12));
		return futureVal;	
	}

}
