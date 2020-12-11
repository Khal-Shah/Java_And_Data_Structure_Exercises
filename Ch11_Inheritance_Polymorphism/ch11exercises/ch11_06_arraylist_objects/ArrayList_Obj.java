package ch11exercises.ch11_06_arraylist_objects;


import ch11exercises.ch11_03_account.CheckingAccount;
import ch11notes.newnotes.inheritance.geometricobjects.Circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/** Chapter 11 - Exercise 6:
 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan object, a Date object,
 * a string, and a Circle object to the list, and use a loop to display all the elements in the list
 * by invoking the object’s toString() method.
 *
 * @author Khaled Shah
 */

public class ArrayList_Obj
{
    public static void main(String[] args)
    {
        //Note, we didn't make Loan class public so we will be adding a CheckingAccount obj instead
        // public CheckingAccount(int newId, double initialBalance, double overdraftLimit)

        //Init the arraylist
        ArrayList<Object> list = new ArrayList<>();
        list.add(new CheckingAccount(1211, 6_000, 2_000));
        list.add(new Date());
        list.add(new String("This is a String object"));
        list.add(new Circle(1));

        //We could also add the objects to an array first then add the array to list:
        Object[] objArray = {new CheckingAccount(1212, 12_000, 4_000), new Date(),
                             "This is another String object", new Circle(2)};
        //let's add this to another arraylist
        ArrayList<Object> fromArrList = new ArrayList<>();
        fromArrList.addAll(Arrays.asList(objArray));

        for(Object o: list)
        {
            System.out.println(o.toString());
        }

        System.out.println("\nNow displaying the objects that were added using an array first and then converted to arrayList\n");

        for(Object o: fromArrList)
        {
            System.out.println(o.toString());
        }

    }

}
