package ch4notes;
import java.util.Scanner;

/* Chapter 4 - Exercise 26:
 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange. java, to fix the possible loss of
 * accuracy when converting a float value to an int value. Read the input as a string such as "11.56".
 * Your program should extract the dollar amount before the decimal point and the cents after the decimal amount
 * using the indexOf and substring methods.
 */
// By Khaled Shah

public class Ch4_Practice
{
	static Scanner kb = new Scanner(System.in);


	public static void main(String[] args)
	{
		System.out.print("Enter a monetary amount (ex: 11.56): ");
		String amount = kb.next();
		int decimalIndex = amount.indexOf(".");

		int cents;

		if (decimalIndex == -1)
		{
			cents = Integer.parseInt(amount);
		}

		else
		{
			cents = Integer.parseInt(amount.substring(0, decimalIndex) + amount.substring(decimalIndex + 1));
		}

		//if cents == 1156, cents/100 would be 11 (dollars), then temp = 56 cents (cents % 100)
		String consistsOf = cents/100 + " dollars\n";
		int temp = cents % 100;
		consistsOf += temp / 25 + " quarters\n";
		temp %= 25;
		consistsOf += temp / 10 + " dimes\n";
		temp %= 10;
		consistsOf += temp / 5 + " nickels\n" + temp % 5 + " pennies.";
		System.out.println(amount + " consists of\n" + consistsOf);


	}

}
