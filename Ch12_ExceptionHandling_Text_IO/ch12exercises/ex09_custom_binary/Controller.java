package ch12exercises.ex09_custom_binary;

/**
 * Chapter 12 - Exercise 9:
 * (BinaryFormatException) Exercise 12.7 implements the bin2Dec method to throw a BinaryFormatException if the string
 * is not a binary string.
 * Define a custom exception called BinaryFormatException.
 * Implement the bin2Dec method to throw a BinaryFormatException if the string is not a binary string.
 *
 * @author khaled Shah
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws BinaryFormatException
    {
        boolean validInput = false;
        String binary = "";
        int decimal = -1;

        do
        {
            try
            {
                System.out.print("Enter a binary string: ");
                binary = kb.next();
                decimal = bin2Dec(binary);
                showResult(binary, decimal);
                validInput = true;
            }
            catch (BinaryFormatException ex)
            {
                //ex.printStackTrace();
                System.out.println(ex.getMessage() + "\nPlease try again.");
            }
            catch (InputMismatchException ex)
            {
                System.out.println(ex.getMessage());
            }
        } while (!validInput);
    }

    public static int bin2Dec(String bin) throws BinaryFormatException
    {
        if (isValidString(bin))
        {
            return Integer.parseInt(bin, 2);
        }
        else
        {
            throw new BinaryFormatException(bin);
        }
    }

    public static boolean isValidString(String bin)
    {
        for (int i = 0; i < bin.length(); i++)
        {
            if (bin.charAt(i) != '0' && bin.charAt(i) != '1')
            {
                return false;
            }
        }
        return true;
    }

    public static void showResult(String bin, int dec)
    {
        System.out.println(bin + " in binary corresponds to a decimal value of " + dec);
    }

}
