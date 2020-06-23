package ch2notes;
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
*
* Enter an amount, for example, 11.56: 11.56
Your amount 11.56 consists of
* 	  11 dollars
      2 quarters
      0 dimes
      1 nickels
      1 pennies
		 */



class Ch2_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter an amount (for example, 11.56): ");
		double amount = kb.nextDouble();
		int cents = (int) (amount * 100);
		int dollars = cents / 100;
		int remainingCents = cents % 100;
		int quarters = remainingCents / 25;
		remainingCents %= 25;
		int dime = remainingCents / 10;
		remainingCents %= 10;
		int nickel = remainingCents / 5;
		int pennies = (remainingCents % 5);

		System.out.printf("Your amount %.2f consists of %d dollars\n%d quarters\n%d dimes\n%d nickels\n%d pennies",
						  amount, dollars, quarters, dime, nickel, pennies);



	}

}
