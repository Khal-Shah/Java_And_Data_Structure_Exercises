package ch5_exercises;
import java.util.Scanner;

public class Ch5_28_SecondWay_DisplayMonthDays
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the year: ");
        int year = kb.nextInt();

        System.out.print("Enter the first day of " + year + (" (Ex: 0 for Sunday, 1 for Monday...6 for Saturday): "));
        int dayNum = kb.nextInt();

        for (int month = 1; month <= 12; month++)
        {
            dayNum %= 7;

            if(getMonthDays(month) == 31)
            {
                System.out.println(getMonthName(month) + " 1, " + year + " is " + getDayName(dayNum));
                dayNum += 31;
            }

            else if(month == 2)
            {
                System.out.println(getMonthName(month) + " 1, " + year + " is " + getDayName(dayNum));
                dayNum += ((isLeapYear(year))? 29: 28);
            }

            else if(getMonthDays(month) == 30)
            {
                System.out.println(getMonthName(month) + " 1, " + year + " is " + getDayName(dayNum));
                dayNum += 30;
            }
        }
    }

    static boolean isLeapYear(int year)
    {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    static String getDayName(int dayNum)
    {
        String dayName = "";

        switch (dayNum)
        {
            case 1 -> dayName =  "Monday";
            case 2 -> dayName = "Tuesday";
            case 3 -> dayName =  "Wednesday";
            case 4 -> dayName = "Thursday";
            case 5 -> dayName =  "Friday";
            case 6 -> dayName = "Saturday";
            case 0 -> dayName = "Sunday";
            default -> dayName = "Error";
        }
        return dayName;
    }

    static String getMonthName(int monthNum)
    {
        String monthName = "";

        switch (monthNum)
        {
            case 1 -> monthName =  "January";
            case 2 -> monthName = "February";
            case 3 -> monthName =  "March";
            case 4 -> monthName = "April";
            case 5 -> monthName =  "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> monthName = "Error";
        }
        return monthName;
    }

    static int getMonthDays(int month)
    {
        int monthdays;

        switch (month)
        {
            case 1, 3, 5, 7, 8, 10, 12 -> monthdays = 31;
            default -> monthdays = 30;
        }
        return monthdays;
    }


}
