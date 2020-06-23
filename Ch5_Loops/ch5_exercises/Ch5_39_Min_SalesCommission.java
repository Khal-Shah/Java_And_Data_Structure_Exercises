package ch5_exercises;

/* Chapter 5 - Exercise 39:
 * (Financial application: find the sales amount) You have just started a sales job in a department store. 
 * Your pay consists of a base salary and a commission. The base salary is $5,000. The scheme shown below is used to 
 * determine the commission rate.
 * Sales Amount								Commission Rate
$0.01–$5,000											 8 percent
$5,000.01–$10,000								 10 percent
$10,000.01 and above						 12 percent
	Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next $5000 is at 10%, and the rest is at 12%. 
	If the sales amount is 25,000, the commission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
	Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
	you have to generate in order to make $30,000.
 */
		//By Khaled Shah

public class Ch5_39_Min_SalesCommission
{
	static final double GOAL = 25000.0;		//goal minus base = commission earnings
	static final double FIRST_5K = 0.08;
	static final double FIVE_TO_10K = 0.10;
	static final double OVER_10K = 0.12;

	public static void main(String[] args)
	{
		
		double commission = (5000 * FIRST_5K) + (5000 * FIVE_TO_10K);			//for first 10k sales
		double higherCommission = 0;
		double sales = 0.0;
		
		
		while ((higherCommission + commission) < GOAL)
		{
			sales ++;
			higherCommission = (sales * OVER_10K);
		}
		
		//System.out.println(higherCommission);
		System.out.println("You would need to generate $" + (sales + 10000) + " in sales to make 30K.");
		
	}

}
