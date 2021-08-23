package ch22_exercises.ex03_pattern_matching;

import java.util.Scanner;

/**
 * Chapter 22 (Developing Efficient Algorithms) - Exercise 3:
 *
 * 3 (Pattern matching) Write an O(n) time program that prompts the user to enter
 * two strings and tests whether the second string is a substring of the first string.
 * Suppose the neighboring characters in the string are distinct. (Don’t use the
 * indexOf method in the String class.) Here is a sample run of the program:
 *
 * Enter a string s1: Welcome to Java
 * Enter a string s2: come
 * matched at index 3
 *
 * @author Khaled
 */

public class Check_SubString
{
    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a string s1: ");
        String s1 = kb.nextLine().toLowerCase();
        System.out.print("Enter a string s2: ");
        String s2 = kb.nextLine().toLowerCase();

        String foundSubStr = "";
        int index = -1;

        //        O(n) complexity
        for(int i = 0; i <= s1.length() - s2.length(); i++)
        {
            if(s1.startsWith(s2, i))
            {
                foundSubStr = s1.substring(i, i + s2.length());
                index = i;
                break;
            }
        }

        if(index > 0)
        {
            System.out.println("Substring " + foundSubStr + " matched at index " + index);
        }

        else
        {
            System.out.println("No substring found.");
        }
    }
}
