package ch13notes.sect_4_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarNotes
{
    public static void main(String[] args)
    {
        Calendar now = new GregorianCalendar();
        System.out.println("Current time is " + now.getTime());
        System.out.printf("Year: %d \nMonth: %d \nDate: %d", now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DATE));
        System.out.printf("\nHour: %d \nHour of Day: %d \nMinute: %d \nSecond: %d",
                          now.get(Calendar.HOUR), now.get(Calendar.HOUR_OF_DAY), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));

        System.out.printf("\nDay of Week: %d \nDay of Month: %d \nDay of Year: %d \nWeek of Month: %d \nWeek of Year: %d",
                          now.get(Calendar.DAY_OF_WEEK), now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.DAY_OF_YEAR),
                          now.get(Calendar.WEEK_OF_MONTH), now.get(Calendar.WEEK_OF_YEAR));

        //change the date to sept 11, 2001
        now.set(2001, 8, 11);       //index for month starts at 0 so sept is 8 rather than 9
        String nameOfDay = "";
        switch(now.get(Calendar.DAY_OF_WEEK) - 1)
        {
            case 0 -> nameOfDay = "Sunday";
            case 1 -> nameOfDay = "Monday";
            case 2 -> nameOfDay = "Tuesday";
            case 3 -> nameOfDay = "Wednesday";
            case 4 -> nameOfDay = "Thursday";
            case 5 -> nameOfDay = "Friday";
            case 6 -> nameOfDay = "Saturday";
        }

        System.out.print("\n" + (now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.DATE) + "/" + now.get(Calendar.YEAR) + " was a " + nameOfDay);

    }
}
