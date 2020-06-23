package ch6exercises;

/* Chapter 6 - Exercise 11:
 * (Financial application: compute commissions) Write a method that computes the commission, using the scheme in 
 * Programming Exercise 5.39. The header of the method is as follows:
public static double computeCommission(double salesAmount) 
Write a test program that displays the following table:
Sales Amount				Commission
10000									900.0
15000									1500.0
...
95000									11100.0
100000								11700.0
 */
		//By Khaled Shah

public class Ch6_11_Commissions
{
	static final double FIRST_5K = 0.08;
	static final double FIVE_TO_10K = 0.10;
	static final double OVER_10K = 0.12;

	public static void main(String[] args)
	{
		System.out.println("Sales Amount\t\t\tCommission");
		
		double sales = 10000;
		
		while (sales <= 100000)
		{
			System.out.printf("%14.0f %40.1f\n", sales, computeCommission(sales));
			sales += 5000;
		}

	}
	
	public static double computeCommission(double salesAmount)
	{
		double commission = 0;
		
		if (salesAmount < 5000)
		{
			commission = salesAmount * FIRST_5K;
		}
		
		else if (salesAmount < 10000)
		{
			commission = (5000 * FIRST_5K) + ((salesAmount - 5000) * FIVE_TO_10K);			//for first 10k sales
		}
		
		else 
		{
			commission = (5000 * FIRST_5K) + (5000 * FIVE_TO_10K) + ((salesAmount - 10000) * OVER_10K);			//for first 10k sales
		}
		return commission;
	}

}
