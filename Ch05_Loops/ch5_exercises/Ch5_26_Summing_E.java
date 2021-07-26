package ch5_exercises;

/* Chapter 5 - Exercise 26:
  (Compute e) You can approximate e using the following series:
e = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / 4! +...+ 1 / i! 
Write a program that displays the e value for i = 10000, 20000, …, and 100000. 
(Hint: Because i! = i * (i - 1) * ... * 2 * 1, then 1/i! is 1/i*(i-1)!
Initialize e and item to be 1 and keep adding a new item to e. 
The new item is the previous item divided by i for i = 2, 3, 4, . . . .)
 */
		//By Khaled Shah

public class Ch5_26_Summing_E
{

	public static void main(String[] args)
	{
		double e = 1;
		double item = 1;
		
		for (int i = 2; i <= 100000; i++)
		{
			item /= i;
			e += item;
			
			if (i == 10000)
			{
				System.out.println("At i = " + i + " e is " + (1 + e));
			}
			
			if (i == 20000)
			{
				System.out.println("At i = " + i + " e is " + (1 + e));
			}
			
			if (i == 100000)
			{
				System.out.println("At i = " + i + " e is " + (1 + e));
			}
		}
		
		System.out.println("Java's E is " + Math.E);

	}

}
