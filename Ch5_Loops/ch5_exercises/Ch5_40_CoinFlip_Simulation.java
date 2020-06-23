package ch5_exercises;

/* Chapter 5 - Exercise 40:
 * (Simulation: heads or tails) Write a program that simulates flipping a coin one million times and displays 
 * the number of heads and tails.
 */
		//By Khaled Shah

public class Ch5_40_CoinFlip_Simulation
{

	public static void main(String[] args)
	{
		int heads = 0;
		int tails = 0;
		double attempts = 1_000_000;
		
		for (int i = 1; i <= attempts; i++)
		{
			int coinFlip = (int) (Math.random() * 2);
			
			switch (coinFlip)
			{
				case 0: tails += 1;
				break;
				case 1: heads += 1;
				break;
			}
		}
		
		System.out.printf("In %.0f attempts: heads resulted %d times (%.2f%%) and tails resulted %d times (%.2f%%)", 
				attempts, heads, (heads / attempts * 100.0), tails, (tails/attempts * 100.0));

	}

}
