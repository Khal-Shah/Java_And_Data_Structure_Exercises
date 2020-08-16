package ch9exercises;
import java.util.Date;

/* Chapter 9 - Exercise 7:
 * (The Account class) Design a class named Account that contains:
■ A private int data field named id for the account (default 0).
■ A private double data field named balance for the account (default 0).
■ A private double data field named annualInterestRate that stores the current interest rate (default 0). 
Assume all accounts have the same interest rate.
■ A private Date data field named dateCreated that stores the date when the account was created.
■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.
■ The accessor and mutator methods for id, balance, and annualInterestRate.
■ The accessor method for dateCreated.
■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
■ A method named withdraw that withdraws a specified amount from the account.
■ A method named deposit that deposits a specified amount to the account.

Draw the UML diagram for the class and then implement the class. (Hint: The method getMonthlyInterest() is to return 
monthly interest, not the interest rate. Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is 
annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g., like 4.5%. You need to divide it by 100.)
Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual 
interest rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print 
the balance, the monthly interest, and the date when this account was created.
 */
		//By Khaled Shah

class Account
{
	private int id;
	private double balance;
	private static double annualInterestRate;					//Assume all accounts have the same interest rate.
	private Date dateCreated;
	
	Account ()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	Account (int newId, double initialBalance)
	{
		id = newId;
		balance = initialBalance;
		dateCreated = new Date();			//if we're passing id and balance parameters, this is the date created
	}
	
	public void setId (int newId)
	{
		id = newId;
	}
	
	public void setBalance (double newBalance)
	{
		balance = newBalance;
	}
	
	public void setAnnualInterestRate (double newInterestRate)
	{
		annualInterestRate = newInterestRate;
	}
	
	public int getId ()
	{
		return id;
	}
	
	public double getBalance ()
	{
		return balance;
	}
	
	public double getAnnualInterestRate ()
	{
		return annualInterestRate;
	}
	
	public Date getDateCreated ()
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate ()
	{
		return (annualInterestRate / 12.0);					
	}
	
	public double getMonthlyInterest ()
	{
		return ((getMonthlyInterestRate() / 100) * balance);				//interest RATE is in % so /100 here
	}
	
	public void withdraw (double withdrawAmount)
	{
		balance -= withdrawAmount;
	}
	
	public void deposit (double depositAmount)
	{
		balance += depositAmount;
	}
	
}

public class Ch9_07_AccountClass
{

	public static void main(String[] args)
	{
		/*Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual 
interest rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print 
the balance, the monthly interest, and the date when this account was created.
		 */
		
		Account account1 = new Account (1122, 20_000);
		account1.setAnnualInterestRate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		displayStatus(account1);
	}

	static void displayStatus(Account acc)
	{
		System.out.printf("Balance: $%.2f\nMonthly interest: $%.2f\n",
						  acc.getBalance(), acc.getMonthlyInterest(), acc.getDateCreated());
		System.out.println("Account creation date: " + acc.getDateCreated());
	}
	
}
