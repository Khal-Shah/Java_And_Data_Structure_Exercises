package ch1exercises;

	/* Chapter 1 - Exercise 7:
	 * (Approximate π) π can be computed using the following formula:
	 *  pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 +...)
	 */
			// By Khaled Shah

public class Ch1_07_Approximating_PI
{

	public static void main(String[] args)
	{
		double pi, negPortion = 0, posPortion = 0;
				
		for (double negDeno = 3; negDeno<= 300; negDeno +=4)
		{
			negPortion -= (1/negDeno); 
		}
		
		for (double posDeno = 1; posDeno <= 300; posDeno += 4)
		{
			posPortion += (1/posDeno);
		}
		
		pi = 4 * (posPortion + negPortion);
		System.out.println(pi);

	}

}
