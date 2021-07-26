package ch6exercises;

/* Chapter 6 - Exercise 13:
 * (Sum series) Write a method to compute the following series: m(i) = 1 / 2 + 2 / 3 +...+ i / i + 1
   Write a test program that displays the following table:
i 					m(i)
------------------------
1 				0.5000
2 				1.1667
...
19 			16.4023
20 			17.3546
 */
		//By Khaled Shah

public class Ch6_13_Sum_Series
{

	public static void main(String[] args)
	{
		System.out.println("i \t\t\t\tm(i)");
		System.out.println("---------------------------------------");
		
		printSeries();

	}
	
	public static double sumSeries(double num)
	{
		return  (num / (num + 1.0));
	}
	
	public static void printSeries()
	{
		double k = 1;
		double totalSum = 0;
		do
		{
			totalSum += sumSeries(k);
			System.out.printf("%.0f %32.4f \n", k, totalSum);
			k++;
		} while (k <= 20);

	}

}
