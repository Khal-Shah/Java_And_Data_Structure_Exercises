package ch19exercises.ex08_generic_shuffle;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Chapter 19 (Generics) - Exercise 8:
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList:
 * public static <E> void shuffle(ArrayList<E> list)
 *
 * @author Khaled
 */

public class Shuffle_ArrayList
{
    public static <E> void shuffle(ArrayList<E> list)
    {
        Collections.shuffle(list);
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 4, 8, 15, 23, 42, 108);
        shuffle(numbers);
        System.out.println("After shuffling numbers: " + numbers + "\n");

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "James", "Kate", "Charlie", "Claire", "Hurley", "Juliette", "Daniel",
                           "Sayeed");
        shuffle(names);
        System.out.println("After shuffling names: " + names);
    }
}
