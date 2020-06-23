package ch5_exercises;

/*
 *  Write a program to compute the following summation:
 *  1 / 1 + (2)^1/2 + 1 / (2)^.5 + (3)^.5...up to 624 and 625
 */
		//By Khaled Shah

public class Ch5_35_Summation
{

	public static void main(String[] args)
	{
		double sum = 0;
		
		for (int i = 1; i < 625; i++)
		{
			sum += 1/(Math.sqrt(i) + Math.sqrt(i + 1));
		}
		
		System.out.println("The sum is " + sum);

	}

}
