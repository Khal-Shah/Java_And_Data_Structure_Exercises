package misc;

/** Simple
 * The "Fizz-Buzz test" is an interview question designed to help filter out the 99.5% of programming job candidates
 * who can't seem to program their way out of a wet paper bag. The text of the programming assignment is as follows:
 *
 * "Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
 * instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples
 * of both three and five print “FizzBuzz”."
 *
 * Source: "Using FizzBuzz to Find Developers who Grok Coding"
 * http://tickletux.wordpress.com/2007/01/24/using-fizzbuzz-to-find-developers-who-grok-coding/
 *
 * @author Khaled Shah
 */
public class FizzBuzz
{
    static String multipleOf3 = "Fizz";
    static String multipleOf5 = "Buzz";
    static String multipleOfBoth = "FizzBuzz";

    public static void main(String[] args)
    {
        for(int i = 1; i <= 100; i++)
        {

             if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(multipleOfBoth);
            }

            else if(i % 3 == 0)
            {
                System.out.println(multipleOf3);
            }

            else if(i % 5 == 0)
            {
                System.out.println(multipleOf5);
            }

            else
            {
                System.out.println(i);
            }
        }
    }
}
