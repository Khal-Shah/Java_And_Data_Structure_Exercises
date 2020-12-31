package ch12exercises.ex02_inputmismatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Chapter 12 - Exercise 2:
 * (InputMismatchException) Write a program that prompts the user to read two integers and displays their sum.
 * Your program should prompt the user to read the number again if the input is incorrect.
 *
 * @author Khaled Shah
 */

public class MismatchExc_Input
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter two integers below.");
        int sum = 0;
        boolean continueInput = true;
        do
        {
            try
            {
                System.out.print("Num1 = ");
                int n1 = kb.nextInt();
                System.out.printf("Num2 = ");
                int n2 = kb.nextInt();
                sum = n1 + n2;
                continueInput = false;
            }
            catch(InputMismatchException ex)
            {
                ex.printStackTrace();

                StackTraceElement[] stackTraceElements = ex.getStackTrace();

                for(int i = 0; i < stackTraceElements.length; i++)
                {
                    System.out.println(stackTraceElements[i].getMethodName() + ": " + stackTraceElements[i].getLineNumber());
                }
                System.out.println("\nInvalid input. Try again:");
                kb.next();      //discard input
            }
        }while(continueInput);

        System.out.println("The sum is " + sum);
    }
}
