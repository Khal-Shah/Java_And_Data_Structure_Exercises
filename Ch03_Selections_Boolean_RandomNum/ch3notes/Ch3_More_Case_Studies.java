package ch3notes;
import java.util.Scanner;

		/* Lottery:
		 * Suppose you want to develop a program to play lottery. The program randomly generates a lottery of a two-digit 
		 * number, prompts the user to enter a two-digit number, and determines whether the user wins according to the 
		 * following rules:
			1. If the user input matches the lottery number in the exact order, the award is $10,000. 2. If all digits in the user 
			input match all digits in the lottery number, the award is $3,000. 3. If one digit in the user input matches a digit in 
			the lottery number, the award is $1,000.
			Note that the digits of a two-digit number may be 0. If a number is less than 10, we assume the number is preceded 
			by a 0 to form a two-digit number. For example, number 8 is treated as 08 and number 0 is treated as 00 in the 
			program.
		 */

public class Ch3_More_Case_Studies
{
	static Scanner kb = new Scanner(System.in);
	static final int LOTTERY_NUM = (int) (Math.random() * 100);

	public static void main(String[] args)
	{
		System.out.println("The lottery number is: " + LOTTERY_NUM);
		
		System.out.print("Enter your lottery pick (two digits): ");
		int userPick = kb.nextInt();
		
		int firstLotDigit = LOTTERY_NUM / 10;
		int secondLotDigit = LOTTERY_NUM % 10; 
		
		int firstUserDigit = userPick / 10;
		int secondUserDigit = userPick % 10;
		
		int award = 0;
		String matchType = "";
		
		if (LOTTERY_NUM == userPick)
		{
			award = 10000;
			matchType = "Exact match:";
		}
		
		else if (((firstUserDigit == secondLotDigit)  && (secondUserDigit == firstLotDigit)))
				{	
					award = 3000;
					matchType = "Match all digits: ";
				}
		
		else if ((firstUserDigit == secondLotDigit) || (firstUserDigit == firstLotDigit) || (secondUserDigit == firstLotDigit) ||
				(secondUserDigit == secondLotDigit))
		{
			award = 1000;
			matchType = "Match one digit: ";
		}
		
		else
		{
			award = 0;
			matchType = "Sorry, no match: ";
		}
		
		System.out.println(matchType + "you win $" + award);
	}

}

/* The switch-expression must yield a value of char, byte, short, int, or String type and must always be enclosed in 
 * parentheses. (The char and String types will be introduced in the next chapter.)

■ The value1, . . ., and valueN must have the same data type as the value of the switch- expression. Note that value1, . . ., 
	and valueN are constant expressions, meaning that they cannot contain variables, such as 1 + x.
	
■ When the value in a case statement matches the value of the switch-expression, the statements starting from this case 
	are executed until either a break statement or the end of the switch statement is reached.
	
■ The default case, which is optional, can be used to perform actions when none of the specified cases matches the 
	switch-expression.

■ The keyword break is optional. The break statement immediately ends the switch statement.
 */
