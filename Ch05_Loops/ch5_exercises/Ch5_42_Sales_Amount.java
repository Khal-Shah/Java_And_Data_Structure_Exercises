package ch5_exercises;
import java.util.Scanner;

/* Chapter 5 - Exercise 42
 * (Financial application: find the sales amount) Rewrite Programming Exercise 5.39 as follows:
■ Use a for loop instead of a do-while loop.
■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.
 */
		//By Khaled Shah

public class Ch5_42_Sales_Amount
{
	//static final double GOAL = 25000.0;		//goal minus base = commission earnings
	static final double FIRST_5K = 0.08;
	static final double FIVE_TO_10K = 0.10;
	static final double OVER_10K = 0.12;
	
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("How much in commission would you like to make in a year? ");
		double goal = kb.nextDouble();
		
		double commission = (5000 * FIRST_5K) + (5000 * FIVE_TO_10K);			//for first 10k sales
		double higherCommission = 0;
		double sales = 0.0;
		
		
		for (sales = 0; ((commission + higherCommission) < goal); sales ++)
		{
			higherCommission = (sales * OVER_10K);
		}
		
		//System.out.println(higherCommission);
		System.out.println("You would need to generate $" + (sales + 10000) + " in sales to make $" + goal);

	}

}
