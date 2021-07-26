package ch3exercises;
import java.util.*;

/* (Financial application: monetary units) Modify Listing 2.10, ComputeChange .java, to display the nonzero 
 * denominations only, using singular words for single units such as 1 dollar and 1 penny, and plural words for 
 * more than one unit such as 2 dollars and 3 pennies.
 */
		//By Khaled Shah

public class Ch3_07_Monetary_Units
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an amount in decimal (example: 11.65)...");
		double userAmount = kb.nextDouble();
		
		int totalCents = (int) (userAmount * 100);
		int dollars = totalCents / 100;
		int amountRem = totalCents % 100;
		int quarters = amountRem / 25;
		amountRem = amountRem % 25;
		int dimes = amountRem / 10;
		amountRem = amountRem % 10;
		int nickels = amountRem / 5;
		amountRem = amountRem % 5;
		int pennies = amountRem;
		
		System.out.printf("Your amount of $%.2f  constitutes of \n%d " + ((dollars >= 2)?  "dollars" : "dollar") + 
				"\n%d " + ((quarters > 1)? "quarters" : "quarter") + "\n%d " + ((dimes > 1)? "dimes" : "dime") + "\n%d " +
						((nickels > 1)? "nickels" : "nickel") + "\n%d " + ((pennies > 1)? "pennies" : "penny")
				, userAmount, dollars, quarters, dimes, nickels, pennies);

	}

}
