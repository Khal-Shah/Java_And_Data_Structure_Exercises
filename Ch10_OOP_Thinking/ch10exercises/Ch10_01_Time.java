package ch10exercises;

/* Chapter 10 - Exercise 1:
 * (The Time class) Design a class named Time. The class contains:
■ The data fields hour, minute, and second that represent a time.
■ A no-arg constructor that creates a Time object for the current time. (The
values of the data fields will represent the current time.)
■ A constructor that constructs a Time object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds. (The values of the data fields will represent this time.)
■ A constructor that constructs a Time object with the specified hour, minute, and second.
■ Three getter methods for the data fields hour, minute, and second, respectively.
■ A method named setTime(long elapseTime) that sets a new time
for the object using the elapsed time. For example, if the elapsed time is 555550000 milliseconds, the hour is 10, the 
minute is 19, and the second is 10.
Draw the UML diagram for the class and then implement the class. Write a test program that creates two Time objects 
(using new Time() and new Time(555550000)) and displays their hour, minute, and second in the format hour:minute:second.
(Hint: The first two constructors will extract the hour, minute, and second from the elapsed time. For the no-arg constructor, 
the current time can be obtained using System.currentTimeMillis(), as shown in Listing 2.7, ShowCurrentTime.java.)
 */
		//By Khaled Shah


public class Ch10_01_Time
{

	public static void main(String[] args)
	{
		Time t1 = new Time();
		//System.out.println(t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
		t1.showTime12HR();
		t1.showTime24HR();
		Time t2 = new Time(555550000);          //The current time is 6:19:10 AM (with -4 offset)
		t2.showTime12HR();

	}

}

class Time
{
	private long hour;
	private long minute;
	private long second;
	static final int GMT_OFFSET = - 4;              //Currently GMT -4 in Montreal, Canada

	Time()
	{
		long totalSec = System.currentTimeMillis() / 1000;
		this.second = totalSec % 60;
		long totalMin = totalSec / 60;                //60sec = 1 min
		this.minute = totalMin % 60;
		long totalHr = totalMin / 60;                    //60 min = 1 hr
		this.hour = (totalHr % 24) + GMT_OFFSET;

		if (hour < 0 )
		{
			hour += 24;
		}

		else if(hour > 24)
		{
			hour =- 24;
		}
	}

	Time(long elapsedTime)
	{
		long totalSec = elapsedTime / 1000;         //1000ms = 1sec
		this.second = totalSec % 60;
		long totalMin = totalSec / 60;                //60sec = 1 min
		this.minute = totalMin % 60;
		long totalHr = totalMin / 60;                    //60 min = 1 hr
		this.hour = (totalHr % 24) + GMT_OFFSET;

		if (hour < 0 )
		{
			hour += 24;
		}

		else if(hour > 24)
		{
			hour =- 24;
		}
	}

	Time(long hour, long minute, long second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	long getHour()
	{
		if (hour < 0 )
		{
			return hour + 24;
		}

		else if(hour > 24)
		{
			return hour - 24;
		}
		return hour;
	}

	long getMinute()
	{
		return minute;
	}

	long getSecond()
	{
		return second;
	}

	//■ A method named setTime(long elapseTime) that sets a new time
	//for the object using the elapsed time. For example, if the elapsed time is 555550000 milliseconds, the hour is 10, the
	//minute is 19, and the second is 10.
	void setTime(long elapseTime)
	{
		long totalSec = elapseTime / 1000;         //1000ms = 1sec
		second = totalSec % 60;
		long totalMin = totalSec / 60;                //60sec = 1 min
		minute = totalMin % 60;
		long totalHr = totalMin / 60;                    //60 min = 1 hr
		hour = totalHr % 60;
	}

	public void showTime12HR()
	{
		System.out.printf("The current time is %d:" + ((minute < 10)? "0" : "") + "%d:" + ((second < 10)? "0" : "")
						  + "%d " + ((hour > 12)? "PM" : "AM") + "\n" ,
						  ((hour % 12 == 0)? (hour % 12) + 12 : hour % 12), minute, second);
	}

	public void showTime24HR()
	{
		System.out.printf("The current time is %d:" + ((minute < 10)? "0" : "") + "%d:" + ((second < 10)? "0" : "")
						  + "%d\n", hour, minute, second);
	}

}