package ch11exercises.ch11_11_sort_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

//Write a test program that prompts the user to enter 5 numbers, stores them in an
//array list, and displays them in increasing order.

public class TestProgram
{
    private static final int LIMIT = 5;
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        int i = 0;

        System.out.println("Enter 5 numbers below:");
        do
        {
            System.out.print("Enter number " + (i + 1 + ": "));
            list.add(i, kb.next());
        }while(++i < LIMIT);

        Object sortArrayList = new SortArrayList(list);
        //Declared type determines method to match, Object doesn't have the sort() method (we created it in SortArrayList) class
        //Thus cast it
        ((SortArrayList) sortArrayList).sort(list);
        System.out.println(sortArrayList.toString());

    }
}
