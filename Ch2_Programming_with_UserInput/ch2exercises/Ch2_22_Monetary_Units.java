package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 22:
		 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange .java, to fix the possible loss of 
		 * accuracy when converting a double value to an int value. Enter the input as an integer whose last two digits 
		 * represent the cents. For example, the input 1156 represents 11 dollars and 56 cents.
		 * 
		 * 1. Prompt the user to enter the amount as a decimal number, such as 11.56.
2. Convert the amount (e.g., 11.56) into cents (1156).
3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using the cents remainder 100.
4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining cents using the remaining cents remainder 25.
5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining cents using the remaining cents remainder 10.
6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining cents using the remaining cents remainder 5.
7. The remaining cents are the pennies.
8. Display the result.
		 */
				// By Khaled Shah

public class Ch2_22_Monetary_Units
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter an amount (as a double/decimal type): ");
	
		double amount = kb.nextDouble();		//11.56
		//convert to total cents
		int remainingAmount = (int) (amount * 100);			//1156  **MAKE SURE TO ()**
		// int amount * 100 would convert amount (11.56) to int FIRST (11)
		//get total one-dollars
		int dollars = remainingAmount / 100;					//11
		//isolate leftover cents
		remainingAmount = remainingAmount  % 100; 		//56
		//now coin units
		int quarters = remainingAmount / 25;				//2
		remainingAmount = remainingAmount % 25;	//6
		
		int dimes = remainingAmount / 10;					//0
		remainingAmount = remainingAmount % 10;										//6
		
		int nickels = remainingAmount / 5;						//1
		remainingAmount = remainingAmount % 5;										//1
		int pennies = remainingAmount;
//		
//		System.out.println(remainingAmount);

		System.out.println("Your amount of $" + amount + " consists of:\n"+ dollars + " dollars\n" + quarters + " quarters"
				+ "\n" + dimes + " dimes\n" + nickels + " nickels\nAnd " + pennies + " pennies");
	}

}
