package ch13exercises.ex03_sorting_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/** Chapter 13 - Exercise 3:
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)
 *
 * @author khaled Shah
 */
public class SortArrayList_Exercise
{
    public static void main(String[] args)
    {
        //Create arrayList of size 10 with random integers between -99 and + 99
        ArrayList<Number> list = getNums();
        System.out.println("Before sorting: " + list.toString());
        System.out.print("After sorting: " );
        sort(list);

    }

    static ArrayList<Number> getNums()
    {
        ArrayList<Number> listTemp = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++)
        {
            //listTemp.add(-99 + random.nextDouble(100));
            listTemp.add(Math.round((-99 + random.nextDouble() * 199) * 100) / 100.0);      //returns between a and a + b excluding a + b
        }
        return listTemp;
    }

    public static void sort(ArrayList<Number> list)
    {
        //Can not sort a Number object, but can do it for Integer or Double object
        //make a Double arraylist
        ArrayList<Double> sortedList = new ArrayList<>();

        //add each value of original Number list to the Double list:
        for(int i = 0; i < list.size();)
        {
            sortedList.add(list.get(i++).doubleValue());
        }
        Collections.sort(sortedList);
        System.out.println(sortedList.toString());
    }
}
