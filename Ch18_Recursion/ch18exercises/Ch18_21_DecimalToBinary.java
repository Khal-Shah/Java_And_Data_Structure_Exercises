package ch18exercises;

import org.junit.Test;

/** Chapter 18 (Recursion) - Exercise 21:
 * (Decimal to binary) Write a recursive method that converts a decimal number into a binary number as a string.
 *
 * The method header is:
 * public static String dec2Bin(int value)
 * Write a test program that prompts the user to enter a decimal number and displays its binary equivalent.
 *
 * @author Khaled
 */

public class Ch18_21_DecimalToBinary
{
    @Test
    public void dec2BinTest()
    {
        System.out.println(dec2Bin(16));
    }

     public static String dec2Bin(int value)
     {
        String bin = "";
        return dec2Bin(value, bin);
     }

    public static String dec2Bin(int value, String bin)
    {
        //Ex: 10 = 1010....10%2 = 0. then 10/2 = 5...5%2 = 1, then 5/2 = 2...2%2 = 0, then 2/2 = 1...1%2 =
        if(value <= 0 && bin.length() == 0)
        {
            return "0";
        }
        else if(value <= 0 && bin.length() != 0)
        {
            return "";
        }
        bin = "" + value % 2;
        return dec2Bin(value / 2, bin) + bin;
    }


}
