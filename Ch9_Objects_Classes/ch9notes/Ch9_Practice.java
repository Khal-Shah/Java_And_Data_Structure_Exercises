package ch9notes;
import java.util.Date;
import java.util.Random;

/* Chapter 9 - Exercise 6:
 * Stopwatch) Design a class named StopWatch. The class contains:
■ Private data fields startTime and endTime with getter methods.
■ A no-arg constructor that initializes startTime with the current time.
■ A method named start() that resets the startTime to the current time.
■ A method named stop() that sets the endTime to the current time.
■ A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
Draw the UML diagram for the class and then implement the class. Write a test program that measures the execution 
time of sorting 100,000 numbers using selection sort.
 */
		//By Khaled Shah

public class Ch9_Practice
{
	
	static final int SIZE = 100_000;

	public static void main(String[] args)
	{
		//Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
		
		int [] list = getList();
		
		int [] sortedList = sortList (list);
		
		displaySorted(sortedList);
		
	}
	
	public static int [] getList()
	{
		int [] list = new int [SIZE];
		
		Random r = new Random();
		
		for (int i = 0; i < SIZE; i++)
		{
			list[i] = 1 + r.nextInt(SIZE);			//random val bet 1 and 100_000
		}
		return list;
	}
	
	public static int [] sortList(int [] list)
	{
		//Selection sort: find the smallest number, swap it with 1st element. 
		//Then find the smallest number remaining, swap with 2nd element, etc.
		
		int currentMinIndex;
		int currentMinValue;
		
		for (int i = 0; i < list.length; i++)
		{
			currentMinIndex = i;
			currentMinValue = list[i];
			
			for (int j = (i + 1); j < list.length; j++)
			{
				if (currentMinValue > list[j])
				{
					currentMinValue = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i)
			{
				list[currentMinIndex] = list[i];
				list[i] = currentMinValue;
			}
		}
		return list;
	}
	
	public static void displaySorted(int[] sortedList)
	{
		int count = 1;
		
		for (int e: sortedList)
		{
			System.out.print(((count % 50 != 0)? e : "\n") + "  ");
			count++;
		}
	}
	
}

class StopWatch
{
	private long startTime;
	private long endTime;
	
	//A no-arg constructor that initializes startTime with the current time.
	StopWatch()
	{
		startTime = System.currentTimeMillis();
	}
	
	// method named start() that resets the startTime to the current time.
	
	void start()
	{
		startTime = System.currentTimeMillis();
	}
	
	//A method named stop() that sets the endTime to the current time.
	void stop()
	{
		endTime = System.currentTimeMillis();
	}
	
	//A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
	long getElapsedTime()
	{
		return (endTime - startTime);
	}
	
	long getStartTime()
	{
		return startTime;
	}
	
	long getEndTime()
	{
		return endTime;
	}
}