package ch13notes.sect_6_comparable_interface;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortComparableObjects
{
    public static void main(String[] args)
    {
        //If an object is an instance of Comparable interface, then we can use
        //the Arrays.sort method to sort (after comparing) objects
        //We know String and BigInteger classes implements Comparable Interface

        String[] cities = {"Montreal", "Tampa Bay", "Long Island", "Las Vegas", "Colorado"};

        System.out.println("Before sorting we have: " + Arrays.toString(cities));
        Arrays.sort(cities);
        System.out.println("After sorting we have: " + Arrays.toString(cities));

        //Now BigInteger
        System.out.println("--------------------------------------------------------------------------");

        ArrayList<BigInteger> list = new ArrayList<>();
        Collections.addAll(list, new BigInteger("2323231092923992"), new BigInteger("432232323239292"),
                new BigInteger("54623239292"), new BigInteger("54623239292"));

        System.out.println("Before sorting, the big integers are: " + list);
        Collections.sort(list);
        System.out.println("After sorting, the big integers are: " + list);

        //Would work with BigInteger[] regular array too and then using Arrays.sort();
    }
}
