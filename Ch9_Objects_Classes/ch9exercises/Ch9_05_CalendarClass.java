package ch9exercises;
import java.util.GregorianCalendar;

/* Chapter 9 - Exercise 5:
 * (Use the GregorianCalendar class) Java API has the GregorianCalendar class in the java.util package, which you can use to 
 * obtain the year, month, and day of a date. The no-arg constructor constructs an instance for the current date, and the 
 * methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) 
 * return the year, month, and day. Write a program to perform two tasks:
■ Display the current year, month, and day.
■ The GregorianCalendar class has the setTimeInMillis(long), which
can be used to set a specified elapsed time since January 1, 1970. 
Set the value to 1234567898765L and display the year, month, and day.
 */
		//By Khaled Shah

public class Ch9_05_CalendarClass
{

	public static void main(String[] args)
	{
		GregorianCalendar today = new GregorianCalendar();
		
		displayToday(today);			//task 1
		
		//task 2:
		today.setTimeInMillis(1234567898765L);
		displayToday(today);		//~39 yrs after 1970

	}

	public static void displayToday(GregorianCalendar t1)
	{
		System.out.println(t1.get(GregorianCalendar.YEAR) + "/" + (t1.get(GregorianCalendar.MONTH) + 1)  + "/" + 
	t1.get(GregorianCalendar.DAY_OF_MONTH));
	}
}
