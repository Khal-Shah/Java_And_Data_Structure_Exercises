package ch6exercises;

/* Chapter 6 - Exercise 14:
 * (Estimate Pi): Pi can be estimated using the following series:
 * m(i) = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 +...+ (-1)^i+1 / 2i - 1
 * Write a method that returns m(i) for a given i and write a test program that dis- plays the following table:
 * i				m(i)
   1			4.0000
   
  901		3.1427
 */
		//By Khaled Shah

public class Ch6_14_Estimate_Pi
{

	public static void main(String[] args)
	{
		printPi(1);

	}
	
	public static void printPi(int i)
	{
		System.out.println("i\t\t\t\t\tm(i)");
		
		while (i <= 901)
		{
			System.out.printf("%3d%38.4f\n", i, estimatePi(i));
			i += 100;
		}
		
	}
	
	public static double estimatePi(int i)
	{
		double pi = 0;
		
		for (int j = 1; j <= i; j++)
		{
			pi += 4 * ((Math.pow((-1), j + 1)) / ((2 * j) - 1));
		}
		return pi;
	}

}
