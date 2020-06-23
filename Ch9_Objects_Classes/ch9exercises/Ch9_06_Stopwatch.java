package ch9exercises;
import java.util.Arrays;

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

	public static void main(String[] args)
	{
		int [] numbers = new int [100_000];
		numbers = generateNumbers(numbers);
		
		StopWatch stopWatch1 = new StopWatch ();
		stopWatch1.start();
		
		//Now sort array
		Arrays.sort(numbers);
		
		stopWatch1.stop();
		
		System.out.println("Execution time to sort an array of " + numbers.length + " integer numbers using the Array class "
				+ "was " + stopWatch1.getElapsedTime() + " milliseconds");
		
		
	}
	
	public static int [] generateNumbers (int [] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			numbers [i] = (int) (Math.random() * 100_001);	//will generate random numbers bet [0, 100000]
		}
		return numbers;
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
