package ch12exercises.ex09_custom_binary;

/** Chapter 12 - Exercise 9:
 * (BinaryFormatException) Exercise 12.7 implements the bin2Dec method to throw a BinaryFormatException if the string
 * is not a binary string.
 * Define a custom exception called BinaryFormatException.
 * Implement the bin2Dec method to throw a BinaryFormatException if the string is not a binary string.
 * @author khaled Shah
 */
public class BinaryFormatException extends Exception
{
    public BinaryFormatException(String binStr) throws BinaryFormatException
    {
        super(binStr + " is not a valid binary string.");
    }
}
