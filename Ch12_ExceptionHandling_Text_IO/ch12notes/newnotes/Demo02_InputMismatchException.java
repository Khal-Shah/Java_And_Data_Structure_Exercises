package ch12notes.newnotes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo02_InputMismatchException extends Throwable
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        boolean continueInput = true;

        do
        {
            try
            {
                System.out.print("Enter an integer: ");
                int num = kb.nextInt();

                //display result
                System.out.println("The numbered entered is " + num);
                continueInput = false;
            }

            catch (InputMismatchException ex)
            {
                System.out.println("Try again.\n\"Incorrect input, an integer" +
                        " is required.\"");
                //discard input
                //kb.nextLine();
                kb.next();
            }

        } while (continueInput);

        System.out.println("Program continues...");
    }
}
