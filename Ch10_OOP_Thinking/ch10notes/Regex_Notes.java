package ch10notes;

//Chapter 10 - Section 10.10.4: Matching, Splitting, Replacing by Patterns

import java.util.Arrays;

public class Regex_Notes
{
    public static void main(String[] args)
    {
        //1) Matches:

        System.out.println("Java is cool".matches("Java.*"));       //T
        System.out.println("Cool is Java".matches("Java.*"));       //F

        System.out.println("Cool is Java!".matches(".*Java"));      //F
        System.out.println("Cool is Java".matches(".*Java"));       //T

        // "\\d" = single digit. "\\d{3}" = three digits
        System.out.println("313-5303-03935".matches("\\d{3}-\\d{4}-\\d{5}"));    //T

        System.out.println("   -   - ".matches("\\s{3}-\\s{3}-\\s"));       //T
        //3 white space-3 white space-1 white space match

        System.out.println("464".matches("[\\d]"));

        System.out.println("a#b%$c".replaceAll("[#%$]", ""));

        System.out.println("3342".matches("[0-9]{4}"));

        //w:
        System.out.println("sfhs".matches("\\w{4}"));
        System.out.println("1234".matches("[^a-z]{4}"));
        System.out.println("sgds".matches("\\w{4}"));

        System.out.println("A#B*$C".replaceAll("[^A-Z]", ""));

//        //split by punctuation marks: , . ! ; : ?
//        String email = "Hi, I have good news! You've landed an interview. Location DT MTL; Friday the 3rd.";
//        String[] withoutPunctuations = email.split("[,.!:;]");
//
//        for(String phrase: withoutPunctuations)
//        {
//            System.out.print(phrase);
//        }

        System.out.println("abbb".matches("ab{3}"));

        //even patttern:
        System.out.println("Even pattern:");
        System.out.println("2".matches("[0-9]*[02468]"));
        //System.out.println("122".matches(".*[02468]"));

        //System.out.println("dasddasdsddadadaba".matches("\\w*[abc]"));
        //The pattern for telephone numbers is (xxx) xxx-xxxx, where x is a digit and the first digit cannot be zero.
        System.out.println("(438) 921-6839".matches("\\([1-9]\\d{2}\\) \\d{3}-\\d{4}"));

        System.out.println("a".matches("[a]+"));

        //Converting strings into arrays:
        System.out.println("Converting between string to char array:");
        String dummyStr = "Can this string be converted into an array";
//        char[] stroToArr = dummyStr.toCharArray();
//
//        for (char e: stroToArr)
//        {
//            System.out.print(e);
//        }

        //Can add to character arrays using getChars(srcBegin, srcEnd, charArrayDst, dstBegin)
        char[] testChar = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("Char array before using getChars() method is: " + Arrays.toString(testChar));

        "ABCDEFG".getChars(0, 2, testChar, 3);
        System.out.println("Char array after using getChars() method is: " + Arrays.toString(testChar));


    }
}
