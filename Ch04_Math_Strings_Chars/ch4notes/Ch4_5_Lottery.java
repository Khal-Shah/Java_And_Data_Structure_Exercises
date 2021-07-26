package ch4notes;
import java.util.Scanner;

public class Ch4_5_Lottery

		/* 4.5.3 Case Study: Revising the Lottery Program Using Strings
The lottery program in Listing 3.8, Lottery.java, generates a random two-digit number, prompts the user to enter a 
two-digit number, and determines whether the user wins according to the following rule:

1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all the digits in the user input match all the digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.

The program in Listing 3.8 uses an integer to store the number. Listing 4.5 gives a new program that generates a 
random two-digit string instead of a number and receives the user input as a string instead of a number.	 
		 */

{
	static Scanner kb = new Scanner (System.in);														//so we get 00 - 99
																										// This is concatenation , left half procues 0-9, right half 0-9
	static final String LOTTERY_NUMBER = "" + (int) (Math.random() * 10) + (int) (Math.random() * 10);

	public static void main(String[] args)
	{	
		String userNumber;
		String award = "" + 0;
		String matchType = "no match";
		
		System.out.print("Enter your lottery numer (two digits): ");
		userNumber = kb.nextLine();
		
		kb.close();
		System.out.println("The winning lottery number is: " + LOTTERY_NUMBER);
		
//		String lastDigit = "" +(int) LOTTERY_NUMBER % 10;				//You don't need this when you can just use charAt meth
		
		char lotteryFirstDigit =  LOTTERY_NUMBER.charAt(0);
		char lotterySecondDigit = LOTTERY_NUMBER.charAt(1);
		
		char guessFirstDigit = userNumber.charAt(0);
		char guessSecondDigit = userNumber.charAt(1);
		
		if (userNumber.equals(LOTTERY_NUMBER))
		{
			award = "10,000";									//recall award is a String so can't do 10_000
			matchType = "perfect match";
		}
		
		else if ((lotteryFirstDigit == guessSecondDigit) && (lotterySecondDigit == guessFirstDigit))
		{
			award = "3,000";
			matchType = "same digits match";
		}
		
		else if ((lotteryFirstDigit == guessFirstDigit) || (lotteryFirstDigit == guessSecondDigit)
				|| (lotterySecondDigit == guessFirstDigit) || (lotterySecondDigit == guessSecondDigit))
		{
			award ="1,000";
			matchType = "one digit match";
		}
		
		System.out.printf("Your numbers are %s, which is a %s. You win $%.7s", userNumber, matchType, award);

	}

}
