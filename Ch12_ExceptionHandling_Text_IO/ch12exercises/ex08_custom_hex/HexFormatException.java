package ch12exercises.ex08_custom_hex;

/** Chapter 12 - Exercise 8:
 * (HexFormatException) Exercise 12.6 implements the hex2Dec method to throw a NumberFormatException
 * if the string is not a hex string. Define a custom exception called HexFormatException.
 * Implement the hex2Dec method to throw a HexFormatException if the string is not a hex string.
 *
 * @author Khaled Shah
 */

public class HexFormatException extends Exception
{

    public HexFormatException(String hex, int i)
    {
        super("The character " + hex.charAt(i) + " in " + hex + " is not a valid hexadecimal character.");
    }

    public static int hex2Dec(String hex) throws HexFormatException
    {
        for(int i = 0; i < hex.length(); i++)
        {
            if(isNotValid(hex.charAt(i)))
            {
                throw new HexFormatException(hex, i);
            }
        }
        return Integer.parseInt(hex, 16);
    }

    public static boolean isNotValid(char ch)
    {
        //not valid if ch is not 0-9 or A-F
        if(("" + ch).matches("^[A-F0-9]"))
        {
            return false;
        }
        return true;
    }
}
