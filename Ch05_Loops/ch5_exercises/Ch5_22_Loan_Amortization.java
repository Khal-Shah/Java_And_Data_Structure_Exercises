package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 22
 * (Financial application: loan amortization schedule) The monthly payment for a given loan pays the principal and 
 * the interest. The monthly interest is computed by multiplying the monthly interest rate and the balance (the remaining 
 * principal). The principal paid for the month is therefore the monthly payment minus the monthly interest. 
 * Write a program that lets the user enter the loan amount, number of years, and interest rate and displays 
 * the amortization schedule for the
	loan. Here is a sample run:
	The balance after the last payment may not be zero. If so, the last payment should be the normal monthly payment 
	plus the final balance.
	Hint: Write a loop to display the table. Since the monthly payment is the same for each month, it should be computed 
	before the loop. The balance is initially the loan amount. For each iteration in the loop, compute the interest and 
	principal, and update the balance. The loop may look like this:
	for (i = 1; i <= numberOfYears * 12; i++) 
	{ 
	interest = monthlyInterestRate * balance; 
	principal = monthlyPayment - interest; 
	balance = balance - principal; 
	System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
 */
		//By Khaled Shah

public class Ch5_22_Loan_Amortization
{	
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.print("Loan Amount: ");
		double amount = kb.nextDouble();
		
		System.out.print("Number of Years: ");
		int years = kb.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double interestRate = kb.nextDouble() / (12 * 100);
		
		double balance = amount;
		double principal;
		double interest;
		
		double monthlyPayment = amount * interestRate / (1 - (Math.pow(1 / (1 + interestRate), years * 12)));
		
		System.out.printf("Monthly Payment: $%.2f \nTotal Payment: $%.2f \nPayment#\t\t\tInterest\t\t\tPrincipal\t\t\tBalance\n"
										, monthlyPayment, monthlyPayment * 12);
		
		for (int i = 1; i <= years * 12; i++) 
		{ 
		interest = interestRate * balance; 
		principal = monthlyPayment - interest; 
		balance = balance - principal; 
		System.out.printf("\t%d \t\t\t\t $%.2f \t \t\t$%.2f \t \t\t$%.2f\n", i, interest, principal, balance );
		}
		
	}

}
