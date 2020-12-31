package ch12exercises.ex07_numberformat_bin;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Chapter 12 - Exercise 7:
 * (NumberFormatException) Write the bin2Dec(String binaryString) method to convert a binary string into a
 * decimal number. Implement the bin2Dec method to throw a NumberFormatException if the string is not
 * a binary string.
 *
 * @author Khaled Shah
 */

public class Binary_NumFormatExc
{
    static Scanner kb = new Scanner(System.in);

    public static int bin2Dec(String binaryString)
    {
        for(int i = 0; i < binaryString.length(); i++)
        {
            if(!checkBinaryValidity(binaryString.charAt(i)))
            {
                throw new NumberFormatException("Exception thrown because " + "\"" + binaryString.charAt(i) + "\"" +
                                                " isn't a valid" + " binary character.");
            }
        }
        return Integer.parseInt(binaryString, 2);
    }

    public static boolean checkBinaryValidity(char ch)
    {
        return (ch == '0' || ch == '1');
    }

    public static void main(String[] args)
    {
        int bin;
        boolean isValid = false;

        do
        {
            System.out.print("Enter a binary number: ");
            try
            {
                bin = kb.nextInt();
                System.out.println("The decimal value for binary " + bin + " is: " + bin2Dec("" + bin));
                isValid = true;
            }
            catch(InputMismatchException ex)
            {
                System.out.println("Invalid input. You must enter an integer for the binary value.");
                //clear input
                kb.next();
            }
            catch(NumberFormatException ex)
            {
                System.out.println(ex.getMessage());
            }

        }while(!isValid);
    }
}
