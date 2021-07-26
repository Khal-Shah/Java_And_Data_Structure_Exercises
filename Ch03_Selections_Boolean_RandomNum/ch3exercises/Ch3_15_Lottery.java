package ch3exercises;
import java.util.Scanner;

		/*Chapter 3 - Exercise 15
		 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three- digit number. The program 
		 * prompts the user to enter a three-digit number and determines whether the user wins according to the following 
		 * rules: 		1. If the user input matches the lottery number in the exact order, the award is $10,000.
							2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
							3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
		 */
			//By Khaled Shah

public class Ch3_15_Lottery
{
	static Scanner kb = new Scanner(System.in);
	static final int LOTTERY_NUM = (int) (Math.random() * 1000);

	public static void main(String[] args)
	{
		System.out.println(LOTTERY_NUM);
		
		int firstLotDig = LOTTERY_NUM / 100;
		int lastTwoLotDig = LOTTERY_NUM % 100;
		int secondLotDig = lastTwoLotDig / 10;
		int lastLotDig = LOTTERY_NUM % 10;
		
		System.out.print("Enter your lottery numbers (three digit): ");
		String userLotNum = kb.next();
		
		while (userLotNum.length() != 3)
		{
			System.out.print("Your lottery numbers must have 3 digits. Try again: ");
			userLotNum = kb.next();
		}
		
		int userPickedNum = Integer.parseInt(userLotNum);
		int firstUserNum =  userPickedNum / 100;
		int lastTwoUserNum = userPickedNum % 100;
		int secondUserNum = lastTwoUserNum / 10;
		int lastUserNum = lastTwoUserNum % 10;
		
		int award;
		String matchType = "";
		
		if ((firstLotDig == firstUserNum) && (secondLotDig == secondUserNum) && (lastLotDig == lastUserNum))
		{
			award = 10_000; 
			matchType = "Perfect match! You win: $";
		}
		
		else if (((firstLotDig == firstUserNum) || (firstLotDig == secondUserNum) || (firstLotDig == lastUserNum)) &&
				((secondLotDig == firstUserNum) || (secondLotDig == secondUserNum) || (secondLotDig == lastUserNum))
				&& ((lastLotDig == firstUserNum) || (lastLotDig == secondUserNum) || (lastLotDig == lastUserNum)))
		{
			award = 3_000;
			matchType = "Match all digits, you win: $";
		}
		
		else if (((firstLotDig == firstUserNum) || (firstLotDig == secondUserNum) || (firstLotDig == lastUserNum)) ||
				((secondLotDig == firstUserNum) || (secondLotDig == secondUserNum) || (secondLotDig == lastUserNum))
				|| ((lastLotDig == firstUserNum) || (lastLotDig == secondUserNum) || (lastLotDig == lastUserNum)))
		{
			award = 1_000;
			matchType = "Match one digit, you win: $";
		}
		
		else 
		{
			 award = 0;
			matchType = "Sorry no match, you win: $";
		}
		
		System.out.println(matchType + award);

	}

}
