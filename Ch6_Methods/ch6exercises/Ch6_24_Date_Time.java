package ch6exercises;

/* Chapter 6 - Exercise 24:
 * (Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the current time. 
 * Improve this example to display the current date and time. 
 * The calendar example in Listing 6.12, PrintCalendar.java, should give you some ideas on how to find the year, 
 * month, and day.
 */
		//By Khaled Shah

public class Ch6_24_Date_Time
{
	static long TOTAL_MS =  System.currentTimeMillis();
	static long TOTAL_S = (TOTAL_MS / 1000);
	static long CURRENT_S = (TOTAL_S % 60);
	
	static long TOTAL_MIN = (TOTAL_S / 60);
	static long CURRENT_MIN = (TOTAL_MIN % 60);
	
	static long TOTAL_HR = (TOTAL_MIN / 60);
	static long CURRENT_HR = (TOTAL_HR % 24);
	
	static long TOTAL_DAYS = (TOTAL_HR / 24);
	static int CURRENT_YR = (int) (TOTAL_DAYS / 365) + 1970;
	static long DAYS_IN_CURRENT_YR = (TOTAL_DAYS - leapYearsSince1970(CURRENT_YR)) % 365;
    // get current month number
    static int CURRENT_MONTH_NUMBER = getMonthNumber(CURRENT_YR, (int) DAYS_IN_CURRENT_YR);
    static String CURRENT_MONTH = getMonthName(CURRENT_MONTH_NUMBER);
    static int DAYS_TILL_MONTH = getDaysToReachMonth(CURRENT_YR, CURRENT_MONTH_NUMBER);
    static  int FIRST_DAY = getFirstDay(CURRENT_YR, CURRENT_MONTH_NUMBER);
    static  int TODAY = (int) (DAYS_IN_CURRENT_YR - DAYS_TILL_MONTH);
    static String DAY = getDayName( ((FIRST_DAY + TODAY) % 7));
    
	public static void main(String[] args)
	{	 
		 if (CURRENT_HR > 0) 
		 {
			 DAYS_IN_CURRENT_YR++;				//including today
		 }
		 
		 System.out.println("Today is " + DAY + " " + CURRENT_MONTH + " " + TODAY +", " + CURRENT_YR + "\n"
		 		+ "Current time is " + CURRENT_HR + ":"+ CURRENT_MIN + ":" + CURRENT_S + " GMT");

				
	}
	
	public static boolean isLeapYear(int year)
	{
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
	}
	
	public static int leapYearsSince1970(long year) 
	{
		int totalLeapYears = 0;
		int yr = 1970;
	
		while (yr <= year)
		{
			if (isLeapYear(yr))
			{
				totalLeapYears++;
			}
			yr++;
		}
		return totalLeapYears;
	}
	
	public static int getMonthNumber(int year, int days) 
	{
		int dayTracker = 0;
		
        for (int i = 1; i <= 12; i++) 
        {
            dayTracker += getNumberOfDaysInMonth(year, i);

            if (dayTracker > days) 
            	{
            		return i;
            	}
        }
        return 12;
	}
	
	/* Get the number of days in a month */
    public static int getNumberOfDaysInMonth(int year, int month) 
    {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
        {
        	return 31;
        }
            

        if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            return 30;
        }
        
        if (month == 2) 
        	{
        		return isLeapYear(year) ? 29 : 28;
        	}
        return 0;
    }
    
    public static String getMonthName(int monthNum) 
    {
        String monthName = "";
        switch (monthNum) 
        {
            case 1: monthName = "January";
            break;
            case 2: monthName = "February"; 
            break;
            case 3: monthName = "March"; 
            break;
            case 4: monthName = "April"; 
            break;
            case 5: monthName = "May"; 
            break;
            case 6: monthName = "June"; 
            break;
            case 7: monthName = "July"; 
            break;
            case 8: monthName = "August"; 
            break;
            case 9: monthName = "September"; 
            break;
            case 10: monthName = "October";
            break;
            case 11: monthName = "November"; 
            break;
            case 12: monthName = "December";
            default: monthName = "Error";
        }

        return monthName;
    }
    
    public static int getDaysToReachMonth(int year, int month) 
    {
        int day = 0;
        
        for (int i = 1; i < month; i++) 
        {
            day += getNumberOfDaysInMonth(year, i);
        }
        
        return day;
    }
    
    public static int getFirstDay(int year, int month) 
    {
        final int FIRST_DAY_OF_JAN_1_1800 = 3;
       
        int totalNumberOfDays = getTotalNumberOfDays(year, month);	

        return (totalNumberOfDays + FIRST_DAY_OF_JAN_1_1800) % 7;
    }
    
    public static int getTotalNumberOfDays(int year, int month) 
    {
        int total = 0;

        for (int i = 1800; i < year; i++)
        {
        	if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;
        }
           
        for (int i = 1; i < month; i++)
        {
            total = total + getNumberOfDaysInMonth(year, i);
        }

        return total;
    }

    public static String getDayName(int day) 
    {
        switch (day) 
        {
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            case 1: return "Sunday";
            default: return null;
        }
    }


}
