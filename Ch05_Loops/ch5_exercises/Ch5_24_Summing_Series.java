package ch5_exercises;

/* Chapter 5 - Exercise 24
 * (Sum a series) Write a program to sum the following series:
1/3 + 3/5 + 5/7+ 7/9 +...+ 95/97 + 97/99
 */
		//By Khaled Shah

public class Ch5_24_Summing_Series
{

	public static void main(String[] args)
	{
		double numero = 1;
		//double deno = 3;
		double sum = 0;
		
		for (numero = 1; numero <= 97; numero+=2)
		{
			sum += (numero / (numero + 2));
		}
		
		System.out.println(sum);

	}

}
