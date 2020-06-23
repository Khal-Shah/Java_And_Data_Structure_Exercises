package ch9exercises;
import java.util.Random;

/* Chapter 9 - Exercise 4:
 * (Use the Random class) Write a program that creates a Random object with seed 1000 and displays the first 50 
 * random integers between 0 and 100 using the nextInt(100) method.
 */
		//By Khaled Shah

public class Ch9_04_RandomNum_Obj
{

	public static void main(String[] args)
	{
		Random r1 = new Random(1000);
	
		
		displayRandoms(r1);

	}
	
	public static void displayRandoms (Random r1)
	{
		for (int i = 1; i <= 50; i++)
		{
			System.out.print(r1.nextInt(100) + "\t" + ((i % 5 == 0)? "\n" : ""));
		}
	}

}
