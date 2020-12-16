package ch11exercises.ch11_10_mystack_inheritance;

//Write a test program that prompts the user to enter five strings and displays them in reverse order.

import java.util.ArrayList;
import java.util.Scanner;

public class MyStackController
{
    protected static final int LIMIT = 5;
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList inputs = new ArrayList();

        System.out.println("Enter " + LIMIT + " strings below: ");
        int i = 1;

        do
        {
            System.out.print("String " + i++ + ": ");
            inputs.add((i - 2), kb.nextLine());
        }while(i <= 5);

        Object stack = new MyStack(inputs);

        System.out.println("Before reversing, the string are:\n" + stack.toString());
        ((MyStack) stack).reverseListItems();
        System.out.println("\nAfter reversing, the strings are:\n" + stack.toString());
        System.out.println("\nIf we reverse the strings again:");
        ((MyStack) stack).reverseListItems();
        System.out.println(stack.toString());

    }
}
