package ch9notes;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

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
	//Khaled Shah

public class Ch9_Practice
{
	public static void main(String[] args)
	{
		Account account1 = new Account(1122, 20_000);
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

class Account
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	Account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	Account(int newId, double initialBalance)
	{
		id = newId;
		balance = initialBalance;
		dateCreated = new Date();
	}

	int getId()
	{
		return id;
	}

	double getBalance()
	{
		return balance;
	}

	double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

	void setId(int newId)
	{
		id = newId;
	}

	void setBalance(double newBalance)
	{
		balance = newBalance;
	}

	void setAnnualInterestRate(double newIR)
	{
		annualInterestRate = newIR;
	}

	Date getDateCreated()
	{
		return dateCreated;
	}

	double getMonthlyInterestRate()
	{
		return (annualInterestRate / 12.0);
	}

	double getMonthlyInterest()
	{
		return (balance * (getMonthlyInterestRate() / 100));
	}

	void withdraw(double amount)
	{
		balance -= amount;
	}

	void deposit(double amount)
	{
		balance += amount;
	}
}

//■ A private int data field named id for the account (default 0).
//		■ A private double data field named balance for the account (default 0).
//		■ A private double data field named annualInterestRate that stores the current interest rate (default 0).
//		Assume all accounts have the same interest rate.
//		■ A private Date data field named dateCreated that stores the date when the account was created.
//		■ A no-arg constructor that creates a default account.
//		■ A constructor that creates an account with the specified id and initial balance.
//		■ The accessor and mutator methods for id, balance, and annualInterestRate.
//		■ The accessor method for dateCreated.
//		■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
//		■ A method named getMonthlyInterest() that returns the monthly interest.
//		■ A method named withdraw that withdraws a specified amount from the account.
//		■ A method named deposit that deposits a specified amount to the account.