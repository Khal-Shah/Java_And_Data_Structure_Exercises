package ch10exercises;
import ch9exercises.Ch9_07_Account.Account;
import java.util.Scanner;


/* Chapter 10 - Exercise 7
 * (Game: ATM machine) Use the Account class created in Programming Exercise 9.7 to simulate an ATM machine. 
 * Create ten accounts in an array with id 0, 1, . . . , 9, and initial balance $100. 
 * The system prompts the user to enter an id. If the id is entered incorrectly, ask the user to enter a correct id. 
 * Once an id is accepted, the main menu is displayed as shown in the sample run. 
 * You can enter a choice 1 for viewing the current balance, 2 for withdrawing money, 3 for depositing money, 
 * and 4 for exiting the main menu. Once you exit, the system will prompt for an id again. 
 * Thus, once the system starts, it will not stop.
 * Sample runs:
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
		//By Khaled Shah

public class Ch10_07_ATM_using_AccountClass
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		Account[] accounts = new Account[10];							//created

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
				case 1: System.out.println("The balance is: $" + userAccount.getBalance());
				break;
				case 2: System.out.print("Enter an amount to withdraw: ");
				userAccount.withdraw(kb.nextDouble());
				break;
				case 3: System.out.print("Enter an amount to deposit: ");
				userAccount.deposit(kb.nextDouble());
				break;
				case 4: System.out.println("Exiting main menu...\nATM visited on " + userAccount.getDateCreated());
					endProgram();
					userId = getId(accounts);
				choice = 0;
			}

		} while (choice != 4);


	}

	public static int endProgram()
	{
		System.exit(-1);
		return -1;
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