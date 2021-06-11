package ch13notes.sect_7_cloneable_interface;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;

public class testCloneable implements Cloneable
{
    public static void main(String[] args)
    {
        Calendar calendar = new GregorianCalendar(2021, 07, 6);
        Calendar calendar1 = calendar;
        //same memory address^

        Calendar calendar2 = (Calendar) calendar.clone();
        //copies the same content as calendar but now if you change one the other won't change.

//        calendar1.set(Calendar.DATE, 11);
//
//        System.out.println(calendar.get(Calendar.DATE));
//        System.out.println(calendar1.get(Calendar.DATE));

        //Recall == checks memory address and .equals checks the content
        System.out.println("calendar == calendar1 is " + (calendar == calendar1));
        //true because they have the same memory address and content

        System.out.println("calendar.equals(calendar1) is " + calendar.equals(calendar1));
        //true because same content

        System.out.println("calendar == calendar2 is " + (calendar == calendar2));
        //calendar and calendar2 have different addresses because we used .clone so false

        System.out.println("calendar.equals(calendar2) is " + calendar.equals(calendar2));
        //true because they have the same content

//        calendar1.set(Calendar.DATE, 11);

        ArrayList<Double> list1 = new ArrayList<>();
        Collections.addAll(list1, 1.5, 2.5, 3.5);

        ArrayList<Double> list2 = (ArrayList<Double>) list1.clone();

        ArrayList<Double> list3 = list1;

        list2.add(4.5);
        list3.remove(1.5);

        System.out.println("list1 is " + list1);
        System.out.println("list2 is " + list2);
        System.out.println("list3 is " + list3);
    }
}
