package ch10exercises.Ch10_14_MyDate;

/* Chapter 10 - Exercise 13:
(The MyDate class) Design a class named MyDate. The class contains:
■ The data fields year, month, and day that represent a date. month is 0-based, i.e., 0 is for January.
■ A no-arg constructor that creates a MyDate object for the current date.
■ A constructor that constructs a MyDate object with a specified elapsed time
since midnight, January 1, 1970, in milliseconds.
■ A constructor that constructs a MyDate object with the specified year,
month, and day.
■ Three getter methods for the data fields year, month, and day, respectively.
■ A method named setDate(long elapsedTime) that sets a new date for
the object using the elapsed time.

(Hint: The first two constructors will extract the year, month, and day from the elapsed time.
For example, if the elapsed time is 561555550000 milliseconds, the year is 1987, the month is 9, and the day is 18.
You may use the GregorianCalendar class discussed in Programming Exercise 9.5 to sim- plify coding.)
 */
    //By Khaled Shah

import java.util.GregorianCalendar;

public class MyDate
{
    private int year;
    private int month;
    private int day;                //date
    private String dayName;

    public MyDate()
    {
        GregorianCalendar gc = new GregorianCalendar();

        year = gc.get(GregorianCalendar.YEAR);
        month = gc.get(GregorianCalendar.MONTH) + 1;
        day = gc.get(GregorianCalendar.DAY_OF_MONTH);
        dayName = getDay(gc.get(GregorianCalendar.DAY_OF_WEEK));
    }

    //A constructor that constructs a MyDate object with a specified elapsed time
    //since midnight, January 1, 1970, in milliseconds.
    public MyDate(long elapsedTime)
    {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(elapsedTime);

        year = gc.get(GregorianCalendar.YEAR);
        month = gc.get(GregorianCalendar.MONTH) + 1;
        day = gc.get(GregorianCalendar.DAY_OF_MONTH);
        dayName = getDay(gc.get(GregorianCalendar.DAY_OF_WEEK));
    }

    public MyDate(int year, int month, int day, String dayName)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        this.dayName = dayName;
    }

    //Three getter methods for the data fields year, month, and day, respectively.


    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    public String getDayName()
    {
        return dayName;
    }

    //A method named setDate(long elapsedTime) that sets a new date for
    //the object using the elapsed time.

    public void setDate(long elapsedTime)
    {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTimeInMillis(elapsedTime);

        year = gc.get(GregorianCalendar.YEAR);
        month = gc.get(GregorianCalendar.MONTH) + 1;
        day = gc.get(GregorianCalendar.DAY_OF_MONTH);
        dayName = getDay(gc.get(GregorianCalendar.DAY_OF_WEEK));
    }

    public static String getDay(int dayOfWeek)
    {
        return (switch (dayOfWeek)
                {
                    case 1 -> "Sunday";
                    case 2 -> "Monday";
                    case 3 -> "Tuesday";
                    case 4 -> "Wednesday";
                    case 5 -> "Thursday";
                    case 6 -> "Friday";
                    case 7 -> "Saturday";
                    default -> "Error";
                });
    }
}
