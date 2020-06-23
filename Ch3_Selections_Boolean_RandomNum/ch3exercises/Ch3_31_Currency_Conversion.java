package ch3exercises;
import java.util.Scanner;

		/* Chapter 3 - Exercise 31:
		 * (Financials: currency exchange) Write a program that prompts the user to enter the exchange rate from currency 
		 * in U.S. dollars to Chinese RMB. Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to 
		 * convert from Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Chinese RMB 
		 * to convert it to Chinese RMB or U.S. dollars, respectively. 
		 * Here are the sample runs:
		 * Enter the exchange rate from dollars to RMB: 6.81
			Enter 0 to convert dollars to RMB and 1 vice versa: 0
			Enter the dollar amount:  100
			$100.0 is 681.0 yuan
			
			Enter the exchange rate from dollars to RMB: 6.81
			Enter 0 to convert dollars to RMB and 1 vice versa: 5
			Enter the RMB amount:  10000
			10000.0 yuan is $1468.43
		 */
				//By Khaled Shah

public class Ch3_31_Currency_Conversion
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		//$ to RMB rate = 6.81 (1$ = 6.81 yuan)
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double eRate = kb.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 for RMB to dollars: ");
		int userChoice = kb.nextInt();
		
		if (userChoice == 0)
		{
			System.out.print("Enter the dollar amount: ");
			double dollarAmount = kb.nextDouble();
			double toRMB = dollarAmount * eRate;
			
			System.out.println("$" + dollarAmount + " is " + toRMB + " yuan." );
		}
		
		else if (userChoice == 1)
		{
			System.out.print("Enter the RMB amount: ");
			double rmbAmount = kb.nextDouble();
			double toDollar = rmbAmount / eRate;
			
			System.out.println(rmbAmount + " yuan is $" + toDollar);
		}
		
		else
		{
			System.out.println("Invalid choice. Program will now terminate.");
			System.exit(0);
		}
	}

}
