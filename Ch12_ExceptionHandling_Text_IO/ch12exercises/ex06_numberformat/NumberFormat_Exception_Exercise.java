package ch12exercises.ex06_numberformat;

import java.util.Scanner;

/** Chapter 12 - Exercise 6:
 * (NumberFormatException) Listing 6.8 implements the hex2Dec(String hexString) method,
 * which converts a hex string into a decimal number. Implement the hex2Dec method to throw a
 * NumberFormatException if the string is not a hex string.
 *
 * @author Khaled Shah
 */
public class NumberFormat_Exception_Exercise
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        String hexVal = "";
        int dec;

        try
        {
            System.out.println("Enter a hex value:");
            hexVal = kb.next();
            dec = hexToDecimal(hexVal);
            System.out.println("The decimal equivalent of " + hexVal + " is " + dec);
        }
        catch(NumberFormatException ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("End of program.");

    }


    //Following 2 methods from Listing 6.8 in the book modified to throw NumberFormatException if hex is not A-F & digit
    public static int hexToDecimal(String hex)
    {
        if(hex.matches("[^0-9a-fA-F]+"))
        {
            NumberFormatException ex = new NumberFormatException("Exception thrown because your hex input isn't valid.");
            throw ex;
        }

        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++)
        {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch)
    {
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';
    }
}


