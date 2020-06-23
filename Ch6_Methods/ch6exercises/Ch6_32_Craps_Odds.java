package ch6exercises;

/* Chapter 6 - Exercise 32:
 * (Game: chance of winning at craps) 
 * Revise Exercise 6.30 to run it 10,000 times and display the number of winning games.
 */
		//By Khaled Shah

public class Ch6_32_Craps_Odds
{

	static int winningGames = 0;
	
	public static void main(String[] args)
	{
		playGame(1000);
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
			winningGames++;
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
					winningGames++;
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
		
		public static void playGame(int totalGames)
		{
			for (int i = 1; i <= totalGames; i++)
			{
				System.out.println(result());
			}
			System.out.println("\nWon " + winningGames + " times out of 1000 plays for a % of " + 
									 ((double) winningGames / totalGames) * 100);
		}

}
