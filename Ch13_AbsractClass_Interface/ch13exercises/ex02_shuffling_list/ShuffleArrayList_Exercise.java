package ch13exercises.ex02_shuffling_list;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/** Chapter 13 - Exercise 2:
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
 *
 * public static void shuffle(ArrayList<Number> list)
 *
 * @author Khaled Shah
 */

public class ShuffleArrayList_Exercise
{

    public static void shuffle(ArrayList<Number> list)
    {
        Collections.shuffle(list);
        for(Number e: list)
        {
            System.out.print(e.getClass().getName().substring(10) + ": " + e + "\n");
        }
    }

    public static void main(String[] args)
    {
        //Initialize and add different Number items to the list
        ArrayList<Number> list = new ArrayList<>();
        Collections.addAll(list, 111, 2.91, new BigDecimal("2.42142151521512521325236236326236323"),
                           new BigInteger("35353536646479463634634"), 325325L, 3232532, 3.14, BigInteger.ONE);

        System.out.println("Before shuffling, the items on the list are: ");
        System.out.println(list + "\n");
        System.out.println("After shuffling, the items on the list are: ");
        shuffle(list);
    }


}
