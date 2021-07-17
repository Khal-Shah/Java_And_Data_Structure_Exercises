package ch20exercises.ex02_store_nonduplicate_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Chapter 20 (Lists, Stacks, & Queues) - Exercise 2:
 * (Store numbers in a linked list) Write a program that lets the user enter numbers from a graphical
 * user interface and displays them in a text area, as shown in Figure 20.17a. Use a linked list to store the numbers.
 * Do not store duplicate numbers.
 *
 * Add the buttons Sort, Shuffle, and Reverse to sort, shuffle, and reverse the list.
 *
 * Note: exercise modified to let user input in the terminal instead of using GUI
 *
 * @author Khaled
 */

public class Store_Unique_Elements
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        List<Double> numbers = new LinkedList<>();
        Double       number;

        //let user enter 0 to exit:
        do
        {
            System.out.print("Enter a number: ");
            number = kb.nextDouble();

            if(!numbers.contains(number) && number != 0)
            {
                //Add to the List if it's unique and not 0
                numbers.add(number);
            }
        } while(number != 0);

        kb.close();

        System.out.printf("The numbers you entered are: %1s\n", numbers);

        //sort, shuffle, and reverse the list

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);


    }
}
