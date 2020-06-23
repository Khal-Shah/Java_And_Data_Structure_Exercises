package ch7exercises;

/* Chapter 7 - Exercise 13:
 * (Random number chooser) Write a method that returns a random number between 1 and 54, 
 * excluding the numbers passed in the argument. The method header is specified as follows:
public static int getRandom(int... numbers)
 */
		//By Khaled Shah

public class Ch7_13_RandomNum_Chooser
{

	public static void main(String[] args)
	{
		System.out.println("A random number between 1 and 54 except for "
				+ "\"4, 6, 8, 16, 22, 25, 28, 32, 34, 38, 42, 44, 46, 48, 52\" is.........." + 
				getRandom(1, 4, 6, 8, 16, 22, 25, 28, 32, 34, 38, 42, 44, 46, 48, 52));

	}
	
	public static int getRandom (int...numbers)
	{
		int ranNum = (int) (1 + Math.random() * 55);
		
		for (int i = 0; i < numbers.length; i++)
		{
			if (ranNum == numbers [i])
			{
				ranNum = (int) (1 + Math.random() * 55);
				i = 0;
				continue;
			}
		}
		return ranNum;
	}

}
