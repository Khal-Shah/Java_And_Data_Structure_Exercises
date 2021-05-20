package ch18exercises;

import org.junit.Test;

/** Chapter 18 (Recursion) - Exercise 12:
 * (Print the characters in a string reversely) Rewrite Programming Exercise 18.9 using a helper method to pass
 * the substring high index to the method.
 *
 * The helper method header is:
 * public static void reverseDisplay(String value, int high)
 *
 * @author Khaled
 */
public class Ch18_12_ReverseStr_Helper
{

    @Test
    public void reverseDisplayTest()
    {
        reverseDisplay("ABCDEFG");
    }

    public static void reverseDisplay(String value)
    {
        reverseDisplay(value, value.length() - 1);
    }

    public static void reverseDisplay(String value, int high)
    {
        high = value.length() - 1;

        if(high == 0)
        {
            System.out.print(value.charAt(high));
        }

        else
        {
            System.out.print(value.charAt(high));
            reverseDisplay(value.substring(0, high), high);
        }
    }

}
