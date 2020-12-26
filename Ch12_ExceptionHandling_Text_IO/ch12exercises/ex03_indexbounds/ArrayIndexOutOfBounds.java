package ch12exercises.ex03_indexbounds;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/** Chapter 12 - Exercise 3:
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
 * ■ Creates an array with 100 randomly chosen integers.
 * ■ Prompts the user to enter the index of the array, then displays the corre-
 * sponding element value. If the specified index is out of bounds, display the message Out of Bounds.
 *
 * @author Khaled Shah
 */

public class ArrayIndexOutOfBounds extends Throwable
{
    private static final int TOTAL = 100;
    static Scanner kb = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args)
    {
        int[] nums = getNums(TOTAL);
        int index = 0;
        boolean isValidInput = false;

        while(!isValidInput)
        {
            try
            {
                System.out.print("Enter the index of the array that you'd like to access: ");
                index = kb.nextInt();

                if(index < 0 || index > 99)
                {
                    System.out.println("Invalid.");
                    throw new ArrayIndexOutOfBoundsException("Out Of Bounds!");
                }

                isValidInput = true;
                System.out.println("Valid input entered.");
            }
            //catch(ArrayIndexOutOfBoundsException | InputMismatchException ex)
            catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.println(ex.getMessage());        //have to print getMessage();
                System.out.println("Index " + index + " is OUT OF BOUNDS. Try again.") ;
                kb.nextLine();      //clear input
            }

            //catch(InputMismatchException ex)
            catch(InputMismatchException ex)
            {
                //System.out.println(ex.getMessage());
                System.out.println("You must enter an integer for the array index. Try again.");
                kb.nextLine();
            }
        }

        System.out.println("The integer in index " + index + " of the array is " + nums[index]);
    }

    public static int[] getNums(int size)
    {
        int[] nums = new int[size];

        for(int i = 0; i < size; i++)
        {
            nums[i] = random.nextInt();
        }

        return nums;
    }
}
