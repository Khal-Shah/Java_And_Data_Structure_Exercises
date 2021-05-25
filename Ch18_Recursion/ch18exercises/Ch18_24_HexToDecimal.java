package ch18exercises;

import org.junit.Assert;
import org.junit.Test;

/** Chapter 18 (Recursion) - Exercise 24:
 * (Hex to decimal) Write a recursive method that parses a hex number as a string into a decimal integer.
 *
 * The method header is:
 * public static int hex2Dec(String hexString)
 *
 * Write a test program that prompts the user to enter a hex string and displays its
 * decimal equivalent.
 *
 * @author Khaled
 */

public class Ch18_24_HexToDecimal
{
     public static int hex2Dec(String hexString)
     {
         int result = 0;
         return hex2Dec(hexString, 0, hexString.length() - 1, result);
     }

     public static int hex2Dec(String hexString, int expo, int high, int result)
     {
         if(high < 0)
         {
             return result;
         }

         //decimal = 16^0 * hexVal
         switch(hexString.charAt(high))
         {
             case 'A' -> result += (int) (Math.pow(16, expo++) * 10);
             case 'B' -> result += (int) (Math.pow(16, expo++) * 11);
             case 'C' -> result += (int) (Math.pow(16, expo++) * 12);
             case 'D' -> result += (int) (Math.pow(16, expo++) * 13);
             case 'E' -> result += (int) (Math.pow(16, expo++) * 14);
             case 'F' -> result += (int) (Math.pow(16, expo++) * 15);
             default -> result += (int) (Math.pow(16, expo++) * Integer.parseInt("" + hexString.charAt(high)));
         }

         return hex2Dec(hexString, expo, --high, result);
     }

     @Test
    public void hex2DecTest()
     {
         //System.out.println(hex2Dec("F7"));
         Assert.assertEquals("F7 from hex to decimal should be 247", 247, hex2Dec("F7"));
     }

}
