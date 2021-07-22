package ch20exercises.ex11_remove_consecutives_stack;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/** Chapter 20 (Lists, Stacks, & Queues) - Exercise 11:
 *
 * (Remove Consecutive Integers) Write a program that reads 10 integers and
 * displays them in the reverse of the order in which they were read.
 *
 * If two consecutive numbers are identical, then only display one of them. Implement your
 * program using only stack and not arrays or queues.
 *
 * @author Khaled
 */

public class RemoveConsecutive_StackInt
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        //Initialize Stack by reading 10 integers
        Stack<? extends Number> stack = getStackInts();

        System.out.print("Original stack: " + stack + "\nWithout duplicates and in reverse: ");

        //Remove duplicates
        for(int i = 0; i < stack.size(); i++)
        {
            if(Collections.frequency(stack, stack.get(i)) > 1)
            {
                stack.remove(stack.get(i));
            }
        }

        //Sort in reverse:
        Collections.reverse(stack);

        //display
        System.out.println(stack);
    }

    private static Stack<? extends Number> getStackInts()
    {
        Stack<Integer> userNums = new Stack<>();
        //Read 10 inputs
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter num" + (i+1) + ": ");
            userNums.push(kb.nextInt());
        }

        return userNums;
    }
}
