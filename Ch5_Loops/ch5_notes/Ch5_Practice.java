package ch5_notes;
import java.util.Scanner;


/* Chapter 5 - Exercise 32:
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a two- digit number.
 * The two digits in the number are distinct.
 * (Hint: Generate the first digit. Use a loop to continuously generate the second digit until it is different from the first digit.)
 */
//By Khaled Shah


public class Ch5_Practice
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		int firstDigit = (int) (Math.random() * 10);
		int secondDigit;

		System.out.println(firstDigit);
		do
		{
			secondDigit = (int) (Math.random() * 10);
			System.out.println(secondDigit);
		} while (firstDigit == secondDigit);

		String lottery = "" + firstDigit + "" + secondDigit;

		System.out.println("The lottery numbers are " + lottery);

	}


}

