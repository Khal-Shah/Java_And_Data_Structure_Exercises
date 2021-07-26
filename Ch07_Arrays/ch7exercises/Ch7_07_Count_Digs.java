package ch7exercises;

/* Chapter 7 - Exercise 7:
 * (Count single digits) Write a program that generates 100 random integers between 0 and 9 and displays the 
 * count for each number. 
 * (Hint: Use an array of ten integers, say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */
		//By Khaled Shah

public class Ch7_07_Count_Digs
{

	public static void main(String[] args)
	{
		int [] randomNums = getRandomNums();
		
		displayRandomNums(randomNums);
		
		int [] counts = getCounts(randomNums);
		
		displayCounts(counts);

	}
	
	public static int [] getRandomNums ()
	{
		int [] ranNums = new int [100];
		
		for (int i = 0; i < ranNums.length; i++)
		{
			ranNums [i] = (int) (Math.random() * 10);
		}
		return ranNums;
	}
	
	public static int [] getCounts (int  [] randomNums)
	{
		int [] fixed = new int [10];
		
		for (int i = 0; i < 100; i++)
		{
			 fixed [randomNums[i]]++;
		}
		return fixed;
	}
	
	public static void displayCounts (int [] counts)
	{
		for (int i = 0; i < counts.length; i++)
		{
			System.out.println("Number of " + i + ": " + counts[i]);
		}
	}
	
	public static void displayRandomNums(int [] ranNums)
	{
		for (int i = 0; i < ranNums.length; i++)
		{
			System.out.print(ranNums [i] + (((i + 1) % 20 == 0)? "\n" : " "));
		}
	}

}
