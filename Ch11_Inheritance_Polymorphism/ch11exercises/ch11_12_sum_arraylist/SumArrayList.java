package ch11exercises.ch11_12_sum_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/** Chapter 11 - Exercise 12:
 * (Sum ArrayList) Write the following method that returns the sum of all
 * numbers in an ArrayList:
 * public static double sum(ArrayList<Double> list)
 *
 * Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays their sum.
 *
 * @author Khaled Shah
 */

public class SumArrayList
{
    private ArrayList<Number> list;

    public SumArrayList()
    {
        list = new ArrayList();
    }

    public SumArrayList(ArrayList list)
    {
        this.list = new ArrayList();
        this.list = list;
    }

    public static double sum(ArrayList<Double> list)
    {
        Double sum = (double) 0;
        int i = 0;

        while(i < list.size())
        {
            sum += list.get(i++);
        }
        return sum;
    }

    @Override
    public String toString()
    {
        return "SumArrayList{" +
               "list=" + list +
               '}';
    }

    protected static final int LIMIT = 5;

    public static void main(String[] args)
    {
        //Write a test program that prompts the user to enter 5 numbers,
        // stores them in an array list, and displays their sum.
        Scanner kb = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter " + LIMIT + " numbers below: ");
        int i = 0;

        do
        {
            System.out.print("Number " + (i + 1) + ": ");
            list.add(kb.nextDouble());
            i++;
        }while(i < LIMIT);

        Object sumArrayList = new SumArrayList(list);
        System.out.println(((SumArrayList) sumArrayList).toString());
        System.out.println("Sum: " + SumArrayList.sum(list));
        kb.close();
    }
}
