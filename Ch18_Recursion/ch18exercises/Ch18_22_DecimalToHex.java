package ch18exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Chapter 18 (Recursion) - Exercise 22:
 * (Decimal to hex) Write a recursive method that converts a decimal number into a hex number as a string.
 * <p>
 * The method header is:
 * public static String dec2Hex(int value)
 * <p>
 * Write a test program that prompts the user to enter a decimal number and displays
 * its hex equivalent.
 *
 * @author Khaled
 */

public class Ch18_22_DecimalToHex
{

    @Test
    public void dec2HexTest()
    {
        String result = dec2Hex(247);
        //247 should be F7

        System.out.println(result);
        assertEquals("Result of 247 in Hex equals to F7", result, "F7");
    }

    public static String dec2Hex(int value)
    {
        String hexVal = "";
        return dec2Hex(value, hexVal);
    }


    public static String dec2Hex(int value, String hex)
    {
        if(value == 0 && hex.length() == 0)
        {
            return "0";
        }

        else if(value == 0 && hex.length() != 0)
        {
            return "";
        }

        else if(value < 0)
        {
            return "Negative values are not acceptable. \nTermination of Program.";
        }

        hex = "" + value % 16;

        switch(hex)
        {
            case "10" -> hex = "A";
            case "11" -> hex = "B";
            case "12" -> hex = "C";
            case "13" -> hex = "D";
            case "14" -> hex = "E";
            case "15" -> hex = "F";
        }
        return dec2Hex(value / 16, hex) + hex;
    }


}
