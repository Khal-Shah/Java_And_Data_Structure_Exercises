package ch10notes;


/* See StringBuilder_Palindrome.java
Listing 5.14, Palindrome.java, considered all the characters in a string to check whether it is a palindrome. Write a new
program that ignores nonalphanumeric characters in checking whether a string is a palindrome.
Here are the steps to solve the problem:
1. Filter the string by removing the nonalphanumeric characters. This can be done by creating an empty string builder,
adding each alphanumeric character in the string to a string builder, and returning the string from the string builder.
You can use the isLetterOrDigit(ch) method in the Character class to check whether character ch is a letter or a digit.
2. Obtain a new string that is the reversal of the filtered string. Compare the reversed string with the filtered
string using the equals method.
 */

public class Ch10_Practice
{

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, sb.length());
        System.out.println("Now: " + sb);
        double test = 32532.52379696969653;
        sb.append(test);
        System.out.println(sb);
        System.out.println(sb.capacity());


    }



}
