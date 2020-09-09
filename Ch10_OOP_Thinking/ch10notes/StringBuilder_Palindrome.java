package ch10notes;

/*
Listing 5.14, Palindrome.java, considered all the characters in a string to check whether it is a palindrome. Write a new
program that ignores non-alphanumeric characters in checking whether a string is a palindrome.
Here are the steps to solve the problem:
1. Filter the string by removing the nonalphanumeric characters. This can be done by creating an empty string builder,
adding each alphanumeric character in the string to a string builder, and returning the string from the string builder.
You can use the isLetterOrDigit(ch) method in the Character class to check whether character ch is a letter or a digit.
2. Obtain a new string that is the reversal of the filtered string. Compare the reversed string with the filtered
string using the equals method.
 */
    //By Khaled Shah

import java.util.Scanner;

public class StringBuilder_Palindrome
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a string: ");
        String userStr = kb.nextLine();

        StringBuilder sb = new StringBuilder();

        System.out.println("After filtering out the non-alphabetic characters, your string "
                          + ((isPalindrome(userStr))? "is " : "isn't ") + "a palindrome.");

    }

    static boolean isPalindrome(String userStr)
    {
//        StringBuilder sbInitial = new StringBuilder(getFilteredString(userStr));
//
//        StringBuilder sbComp = new StringBuilder(getReverse(userStr));

        String initialStr = getFilteredString(userStr);
        String comparisonStr = getReverse(initialStr);

        return (initialStr.equals(comparisonStr));
    }

    static String getReverse(String str)
    {
        StringBuilder sbTemp = new StringBuilder(str);
        return sbTemp.reverse().toString();
    }

    static String getFilteredString(String userStr)
    {
        String filtered = "";

        for(int i = 0; i < userStr.length(); i++)
        {
            if(Character.isLetterOrDigit(userStr.charAt(i)))
            {
                filtered += userStr.charAt(i);
            }
        }
        return filtered;
    }
}
