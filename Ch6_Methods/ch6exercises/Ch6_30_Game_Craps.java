package ch6exercises;

/* Chapter 6 - Exercise 30:
 *  (Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, ..., and 6, respectively. 
Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you lose; 
if the sum is 7 or 11 (called natural), you win; 
if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. 
Continue to roll the dice until either a 7 or the same point value is rolled. 
If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player. Here are some sample runs.

 You rolled 5 + 6 = 11
You win

 You rolled 1 + 2 = 3
You lose

You rolled 4 + 4 = 8
point is 8
You rolled 6 + 2 = 8
You win

You rolled 3 + 2 = 5
point is 5
You rolled 2 + 5 = 7
You lose
 */
		//By Khaled Shah

public class Ch6_30_Game_Craps
{

	public static void main(String[] args)
	{	
		//Have to: roll 2 dice, each with (1-6 vals), sum up the two values
		//win if 7 or 11 (called natural)
		//lose if sum is 2, 3 or 12 (craps)
		//if sum is 4, 5, 6, 8, 9, 10: point = sum, roll again until sum is point (win) or sum is 7 (lose).
		
		System.out.println(result());

	}
	
	public static int rollDice()
	{
		int dice1 = (int) (1 + Math.random() * 6);
		int dice2 = (int) (1 + Math.random() * 6);
		
		return sumDice(dice1, dice2);
	}
	
	public static int sumDice(int dice1, int dice2)
	{
		int sum = (dice1 + dice2);
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		return sum;
	}
	
	public static String result()
	{
		
		int sumDice = rollDice();
		String gameResult = "";
		
		if ((sumDice == 7) || (sumDice == 11))
		{
			gameResult = "You win";
		}
		
		else if (sumDice == 2 || sumDice == 3 || sumDice == 12)
		{
			gameResult = "You lose";
		}
		
		else
		{
			tie(sumDice);
		}
		return gameResult;
	}
	
		public static void tie(int point1)
		{
			System.out.println("Point is " + point1);
			int nextPoint = 0;
			//String result = "";
			do
			{
				
				if (nextPoint == point1)
				{
					System.out.println("You win");
					//System.exit(0);
					break;
				}
				
				else if (nextPoint == 7)
				{
					System.out.println("You lose.");
					//System.exit(0);
					break;
				}
				
				else
				{
					nextPoint = rollDice();
				}
			} while ((nextPoint != point1) || (nextPoint != 7));
			
		}

}
