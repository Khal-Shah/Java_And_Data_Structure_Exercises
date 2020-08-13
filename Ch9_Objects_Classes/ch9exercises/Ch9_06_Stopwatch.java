package ch9exercises;

import java.util.Arrays;
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

public class Ch9_06_Stopwatch
{
	static final int TOTALNUMS = 100_000;

	public static void main(String[] args)
	{
		StopWatch watch1 = new StopWatch();
		//System.out.println(watch1.getStartTime());

		//Write a test program that measures the execution
		//time of sorting 100,000 numbers using selection sort.
		System.out.println("List is being created and initialized...");
		int[] list = new int[TOTALNUMS];
		initializeList(list);
		watch1.stop();			//watch1 to get elapsed time to initialize list
		System.out.println("It took " + watch1.getElapsedTime() + "ms to initialize the list with random values.");

		StopWatch watch2 = new StopWatch();
		System.out.println("Now sorting list...");
		watch2.start();
		sortList(list);
		watch2.stop();
		System.out.println("It took " + watch2.getElapsedTime() + "ms to sort the list.");
		System.out.println("Total time taken to create, initialize and sort list with Array sort method is "
						   + (watch1.getElapsedTime() + watch2.getElapsedTime()) + "ms.");
		
		
	}

	static int[] sortList(int[] list)
	{
		Arrays.sort(list);
		return list;
	}

	static int[] initializeList(int[] list)
	{
		Random r = new Random();

		for(int i = 0; i < TOTALNUMS; i++)
		{
			list[i] = (-1_000_000 + r.nextInt(2_000_001));		//init with val from -1M to 1M
		}
		return list;
	}

}

class StopWatch
{
	private long startTime;
	private long endTime;
	
	StopWatch ()
	{
		startTime = System.currentTimeMillis();
	}
	
	public long getStartTime ()
	{
		return startTime;
	}
	
	public long getEndTime ()
	{
		return endTime;
	}
	
	//A method named start() that resets the startTime to the current time.
	public void start()
	{
		startTime = System.currentTimeMillis();
	}
	
	//A method named stop() that sets the endTime to the current time.
	public void stop()
	{
		endTime = System.currentTimeMillis();
	}
	
	//■ A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
	public long getElapsedTime()
	{
		return (endTime - startTime);
	}
	
	
}
