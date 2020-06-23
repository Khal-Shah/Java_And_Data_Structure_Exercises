package ch5_exercises;

import java.util.Scanner;

/* Chapter 5 - Exercise 21
 * Financial application: compare loans with various interest rates) Write a program that lets the user enter the loan 
 * amount and loan period in number of years and displays the monthly and total payments for each interest rate 
 * starting from 5% to 8%, with an increment of 1/8. Here is a sample run:
 */
		//By Khaled Shah

public class Ch5_21_Loans_with_IR
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter loan amount: ");
		double loanAmount = kb.nextDouble();
		
		System.out.print("Enter number of years: ");
		int years = kb.nextInt();
		
		System.out.println("Interest Rate\t\t\tMonthly Payment\t\t\tTotal Payment");
		
		//formula: (1 + monthlyInterestRate)^numberOfYears * 12 
		
		for (double yearlyIR = 5.0; yearlyIR <= 8.0; yearlyIR += 1/8.0)
		{
			double monthlyIR = yearlyIR / 1200;
			double monthlyPayment = loanAmount * monthlyIR / (1 - 1 / Math.pow(1 + monthlyIR, years * 12));
			
			System.out.printf("%.3f%%\t\t\t\t$%.2f\t\t\t\t\t$%.2f\n", yearlyIR, monthlyPayment, monthlyPayment * years * 12);
		}

	}

}
