package ch10exercises;
import java.util.*;

import java.util.Date;

/* Chapter 10 - Exercise 7
 * (Game: ATM machine) Use the Account class created in Programming Exercise 9.7 to simulate an ATM machine. 
 * Create ten accounts in an array with id 0, 1, . . . , 9, and initial balance $100. 
 * The system prompts the user to enter an id. If the id is entered incorrectly, ask the user to enter a correct id. 
 * Once an id is accepted, the main menu is displayed as shown in the sample run. 
 * You can enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for depositing money, 
 * and 4 for exiting the main menu. Once you exit, the system will prompt for an id again. 
 * Thus, once the system starts, it will not stop.
 * 
 * Enter an id: 4
Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 100.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 2
Enter an amount to withdraw: 3

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 97.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 3
Enter an amount to deposit: 10

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 1
The balance is 107.0

Main menu
1: check balance
2: withdraw
3: deposit
4: exit
Enter a choice: 4
                Enter an id:
 */

public class Ch10_07_Account_Class
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		Account [] accounts = new Account [10];							//created
		
		for (int i = 0; i < accounts.length; i++)
		{
			accounts [i] = new Account (i, 100);								//have to initialize as well
		}
		
		int userId = getId(accounts);
		
		int choice = 0;
		
		do
		{
			displayMainMenu();
			System.out.print("\nEnter a choice from above menu: ");
			choice = kb.nextInt();
			
			Account userAccount = getAccount(accounts, userId);
			
			switch (choice)
			{
				case 1: System.out.println("The balance is: $" +userAccount.getBalance());
				break;
				case 2: System.out.print("Enter an amount to withdraw: ");
				userAccount.withdraw(kb.nextDouble());
				break;
				case 3: System.out.print("Enter an amount to deposit: ");
				userAccount.deposit(kb.nextDouble());
				break;
				case 4: System.out.println("Exiting main menu...\n");
					userId = getId(accounts);
				choice = 0;
			}
			
		} while (choice != 4);
		

	}
	
	public static void displayMainMenu()
	{
		System.out.printf("Main menu\n1:\tCheck balance\n2:\tWithdraw\n3:\tDeposit\n4:\tExit");
	}
	
	public static int getId (Account [] accounts)
	{
		boolean isValid = false;
		int userId = 0;
		
		while (!isValid)
		{
			System.out.print("Enter a valid id: ");
			userId = kb.nextInt();
			
			if (!(matchesId(accounts, userId)))
			{
				System.out.println("That is not a correct id.");
			}
			
			else 
			{
				isValid = true;
			}
		}
		return userId;
	}
	
	public static boolean matchesId (Account [] accounts, int userId)
	{
		for (int i = 0; i < accounts.length; i++)
		{
			if (accounts[i].getId() == userId)
			{
				return true;
			}
		}
		return false;
	}
	
	 public static Account getAccount(Account [] accounts, int userId) {

	        for (int i = 0; i < accounts.length; i++) 
	        {
	            if (userId == accounts[i].getId()) 
	            {
	                return accounts[i];
	            }
	        }
	        return null;
	    }

}

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
		dateCreated = new Date ();
	}
	
	Account (int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		dateCreated = new Date ();			//if we're passing id and balance parameters, this is the date created
	}
	
	public void setId (int id)
	{
		this.id = id;
	}
	
	public void setBalance (double balance)
	{
		this.balance = balance;
	}
	
	public void setAnnualInterestRate (double interestRate)
	{
		this.annualInterestRate = interestRate;
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
	
	public String getDateCreated ()
	{
		return dateCreated.toString();
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