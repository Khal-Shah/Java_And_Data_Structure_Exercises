package ch2exercises;
import java.util.*;

		/* Chapter 2 - Exercise 13:
		 * (Financial application: compound value) Suppose you save $100 each month into a savings account with the 
		 * annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value 
		 * in the account becomes 100 * (1 + 0.00417) = 100.417
			After the second month, the value in the account becomes
         	(100 + 100.417) * (1 + 0.00417) = 201.252
			After the third month, the value in the account becomes
         	(100 + 201.252) * (1 + 0.00417) = 302.507 and so on.
			Write a program that prompts the user to enter a monthly saving amount and displays the account value after 
			the sixth month. (In Exercise 5.30, you will use a loop to simplify the code and display the account value for any 
			month.) 
			Enter the monthly saving amount: 100
			After the sixth month, the account value is $608.81
		 */
				//By Khaled Shah

public class Ch2_13_Compund_Interest
{
	static Scanner input = new Scanner(System.in);
	static final double MONTHLY_RATE = 0.05 / 12;

	public static void main(String[] args)
	{
		System.out.print("Enter the monthly saving amount: ");
		double monthlySaving = input.nextDouble();
		
		double accountValue = 100 * (1 + MONTHLY_RATE);
		int i = 1;
		
		while (i <= 6)
		{
		//1st month:
			if (i == 1)
			{
				accountValue = accountValue;
				i++;
			}
		//2nd month onward:
		accountValue = (100 + accountValue) * (1 + MONTHLY_RATE);
		i++;
		}
		
		System.out.println("After the sixth month, the account value is $" + accountValue);

	}

}
