package ch9exercises;
import java.util.Date;

/* Chapter 9 - Exercise 3:
 * (Use the Date class) Write a program that creates a Date object, sets its elapsed time to 
 * 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, and 100000000000, 
 * and displays the date and time using the toString() method, respectively.
 */
		//By Khaled Shah

public class Ch9_03_Date_Class
{

	public static void main(String[] args)
	{
		long elapsedTime = 10_000;
		Date date = new Date();
		
		for(elapsedTime = 10_000; elapsedTime <= 100000000000l; elapsedTime *= 10)
		{
			date.setTime(elapsedTime);						//First few will be Dec 31 69 because of -5 GMT
			System.out.println(date.toString());
		}

	}

}
