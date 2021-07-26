package ch7exercises;
import java.util.*;

/* Chapter 7 - Exercise 3:
 * (Count occurrence of numbers) Write a program that reads the integers between 1 and 100 and counts the 
 * occurrences of each. Assume the input ends with 0. 
 * 
 * Here is a sample run of the program:
 * Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
Note that if a number occurs more than one time, the plural word “times” is used in the output.
 */
		//By Khaled Shah

public class Ch7_03_Count_Occurances
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		int [] userNums = readInputs();
		
		//int [] nums = new int [userNums.length];
		//System.out.println(userNums.length);
		
		int counts [] = countOccurances(userNums);
		
		displayOccurance(counts);
		
		
		
	}
	
	public static int [] readInputs ()
	{
		int [] inputs = new int [100];
		
		int input = 0;
		int i = 0;
		
		System.out.println("Enter the integers between 1 and 100 (0 to exit): ");
		
		while (input <= 100 && ((inputs[i] = kb.nextInt()) != 0))
		{
			i++;
			input++;
		}
		
		//int [] inputs = new int [input];
		//System.arraycopy(inputsTemp, 0, inputs, 0, input);
		
		return inputs;
	}
	
	
	public static int [] countOccurances (int [] counts)
	{
		int [] countOccurances = new int [100];
		
		for (int i = 0; i < 100; i++)
		{
			countOccurances [counts[i]]++;
		}
		return countOccurances;
	}
	
	
	public static void displayOccurance (int [] counts)
	{
		for (int i = 1; i < counts.length; i++)
		{
			System.out.print( ((counts [i] == 0)? "" :i + " occurs " + counts [i] + " times.\n"));
		}
	}

}
