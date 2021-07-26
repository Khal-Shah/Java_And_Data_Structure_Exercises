package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 30:
 * (Financial application: compound value) Suppose you save $100 each month into a savings account with the 
 * annual interest rate 5%. So, the monthly interest rate is 0.05 / 12 = 0.00417.
 * After the first month, the value in the account becomes 100 * (1 + 0.00417) = 100.417
 * After the second month, the value in the account becomes (100 + 100.417) * (1 + 0.00417) = 201.252
 	After the third month, the value in the account becomes (100 + 201.252) * (1 + 0.00417) = 302.507
	and so on.
	Write a program that prompts the user to enter an amount (e.g., 100), the annual interest rate (e.g., 5), and the number 
	of months (e.g., 6) and displays the amount in the savings account after the given month.
 */
		//By Khaled Shah

public class Ch5_30_Compund_Value
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter Amount: ");
		double amount = kb.nextDouble();
		
		System.out.print("Enter the Annual Interest Rate: ");
		double interestRate = kb.nextDouble() / 1200;					//monthlyIR
		
		System.out.print("Enter number of months: ");
		int months = kb.nextInt();
		
		double savings = 0;
		
		System.out.print("The amount in savings after the " + months + ((months == 2)? "nd" : "th") + " month will be $");
		
		for (int i = 1; i <= months; i++)
		{
			savings = (amount + savings) * (1 + interestRate);
		}
		
		System.out.printf("%.2f", savings);
		
	}

}
