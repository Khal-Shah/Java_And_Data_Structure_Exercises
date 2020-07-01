package ch4exercises;
import java.util.Scanner;

public class Ch4_26_Compute_Change

		/* Chapter 4 - Exercise 26:
		 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange. java, to fix the possible loss of 
		 * accuracy when converting a float value to an int value. Read the input as a string such as "11.56". 
		 * Your program should extract the dollar amount before the decimal point and the cents after the decimal amount 
		 * using the indexOf and substring methods.
		 */
				// By Khaled Shah

{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an amount in decimal format: ");
		String amountEntered = kb.nextLine();
		
		int amount; //^in cents
		
		int decimal = amountEntered.indexOf(".");
		
		if (decimal == -1) //if no decimal
		{
		      amount = Integer.parseInt(amountEntered);	
	    }
		
		  else 
		  {
		      String decimalPart = amountEntered.substring(decimal + 1);
		      
		      if (decimalPart.length() >= 2) 
		      {
		        decimalPart = decimalPart.substring(0, 2);
		      }
		      
		      else if (decimalPart.length() == 1) 
		      {
		        decimalPart = decimalPart + "0";
		      } 
		      
		      else 
		      {
		        decimalPart = decimalPart + "00";
		      }
		      
		      amount = Integer.parseInt(amountEntered.substring(0, decimal) + decimalPart);
		    }
		
		int remainingAmount = amount;
		
		 // One dollars
	    int oneDollars = remainingAmount / 100;
	    remainingAmount %= 100;

	    // Quarters left
	    int quarters = remainingAmount / 25;
	    remainingAmount %=  25;

	    // Find the number of dimes in the remaining amount
	    int dimes = remainingAmount / 10;
	    remainingAmount %= 10;

	    // Nickels
	    int nickels = remainingAmount / 5;
	    remainingAmount %= 5;

	    // Pennies
	    int pennies = remainingAmount;

	    // Display results
	    System.out.println("Your amount " + amountEntered + " consists of \n" + 
	     + oneDollars + " dollars\n" + 
	     + quarters + " quarters\n" +
	     + dimes + " dimes\n" + 
	     + nickels + " nickels\n" +
	     + pennies + " pennies");
	}
//	Alternatively:
//	System.out.print("Enter a monetary amount (ex: 11.56): ");
//	String amount = kb.next();
//	int decimalIndex = amount.indexOf(".");
//
//	int cents;
//
//		if (decimalIndex == -1)
//	{
//		cents = Integer.parseInt(amount);
//	}
//
//		else
//	{
//		cents = Integer.parseInt(amount.substring(0, decimalIndex) + amount.substring(decimalIndex + 1));
//	}
//
//	//if cents == 1156, cents/100 would be 11 (dollars), then temp = 56 cents (cents % 100)
//	String consistsOf = cents/100 + " dollars\n";
//	int temp = cents % 100;
//	consistsOf += temp / 25 + " quarters\n";
//	temp %= 25;
//	consistsOf += temp / 10 + " dimes\n";
//	temp %= 10;
//	consistsOf += temp / 5 + " nickels\n" + temp % 5 + " pennies.";
//		System.out.println(amount + " consists of\n" + consistsOf);

}
