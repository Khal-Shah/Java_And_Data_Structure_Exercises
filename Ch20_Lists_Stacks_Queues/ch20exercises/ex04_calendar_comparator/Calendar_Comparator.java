package ch20exercises.ex04_calendar_comparator;

import org.junit.Test;

import java.io.Serializable;
//import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Chapter 20 (Lists, Stacks, & Queues) - Exercise 4:
 * (Implement Comparable) Implement a new class that implements Comparator of GregorianCalendar class to be able
 * sort the calendar in increasing order based on day, month, and year, in that order. Write a method to
 * display the GregorianCalendar instance in “dd-MMM-yyyy” format using SimpleDateFormat class.
 *
 * Write a test program with 10 GregorianCalendar instances and display the results after the sort.
 *
 * @author Khaled
 */

public class Calendar_Comparator implements Comparator<GregorianCalendar>, Serializable
{
    @Override
    public int compare(GregorianCalendar o1, GregorianCalendar o2)
    {
        return 0;
    }

    @Test
    public void testCalendar()
    {
        List<GregorianCalendar> calendars = new LinkedList<>();
        Collections.addAll(calendars, new GregorianCalendar(), new GregorianCalendar(2022,
                                                                                     Calendar.APRIL,
                                                                                     14)
                , new GregorianCalendar(1891, 3, 29), new GregorianCalendar(1944, 9, 19),
                           new GregorianCalendar(2021, 10, 6), new GregorianCalendar(2002, 9, 3)
                , new GregorianCalendar(1986, 7, 20), new GregorianCalendar(1971, 12, 16),
                           new GregorianCalendar(2024, 1, 26), new GregorianCalendar(6, 7, 2021));

        displayCalendar(calendars);
    }

    private void displayCalendar(List<GregorianCalendar> calendar)
    {
        System.out.println("Displayed without sorting: ");
        calendar.forEach(e ->
                                 System.out.printf("Day: %s, Month: %s, Year: %s\n",
                                                   e.get(Calendar.DATE),
                                                   e.get(Calendar.MONTH),
                                                   e.get(Calendar.YEAR)
                                                   ));

//        String pattern = "yyyy-MM-dd";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        calendar.sort(Comparator.comparing(e -> e.get(Calendar.DAY_OF_MONTH)));
        System.out.println("\nDisplayed after sorting: ");

        calendar.forEach(e ->
                                 System.out.printf("Day: %s, Month: %s, Year: %s\n",
                                                   e.get(Calendar.DATE),
                                                   e.get(Calendar.MONTH) + 1,
                                                   e.get(Calendar.YEAR)
                                                  ));
    }

}
