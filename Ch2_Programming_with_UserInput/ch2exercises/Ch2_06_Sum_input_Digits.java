package ch2exercises;
import java.util.Scanner;

		/* Chapter 2 - Exercise 6:
		 * (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and adds all the 
		 * digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.
			Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
			Here is a sample run:
			Enter a number between 0 and 1000: 999
			The sum of the digits is 27
		 */
			//By Khaled Shah

public class Ch2_06_Sum_input_Digits
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter a three-digit number (between 0 and 1000): ");
		int userNumber = input.nextInt();								//111
		
		int firstDigit = userNumber / 100;								//111/100 = 1
		int lastTwoDigits = userNumber % 100;					//111 % 100 =  11
		int secondDigit = lastTwoDigits / 10;							//11/10 = 1
		int lastDigit = lastTwoDigits % 10;								//11 % 10 = 1
		
		int sum = firstDigit + secondDigit + lastDigit;
		
		System.out.println("You've entered the number: " + userNumber + "\nThe sum of each digit in the number adds "
				+ "up to "+ sum);

	}

}
