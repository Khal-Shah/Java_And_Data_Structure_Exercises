package ch12exercises.ex06_numberformat_hex;

import java.util.Scanner;

/** Chapter 12 - Exercise 6:
 * (NumberFormatException) Listing 6.8 implements the hex2Dec(String hexString) method,
 * which converts a hex string into a decimal number. Implement the hex2Dec method to throw a
 * NumberFormatException if the string is not a hex string.
 *
 * @author Khaled Shah
 */

public class Hex_NumFormatExc
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

        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++)
        {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
        //return Integer.parseInt(hex, 16);             shortcut to convert hex to decimal
    }

    public static int hexCharToDecimal(char ch)
    {
        String chStr = "" + ch;
        if(chStr.matches("[A-F]"))         //capital A-F
        {
            return 10 + ch - 'A';
        }

        else if(chStr.matches("[a-f]"))     //a-f
        {
            return 10 + ch - 'a';
        }

        else if(ch >= '0' && ch <= '9')             //positive char digit only
        {
            return ch - '0';
        }

        else
        {
            NumberFormatException ex = new NumberFormatException("Exception thrown because your hex input isn't valid.");
            throw ex;
        }
    }
}


