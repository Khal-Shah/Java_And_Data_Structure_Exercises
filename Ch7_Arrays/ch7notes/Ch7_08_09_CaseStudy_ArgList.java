package ch7notes;
import java.util.Scanner;
import java.util.Random;

public class Ch7_08_09_CaseStudy_ArgList
{
	static Scanner kb = new Scanner (System.in);
	static Random r = new Random();

	public static void main(String[] args)
	{
		/*Case Study: Counting occurance of each letter:
		 * The program...
		 * 1) Generates 100 lowercase letters randomly and assigns them to an array of characters,
		 * You can obtain a random letter by using the getRandomLower- CaseLetter() method in 
		 * the RandomCharacter class.
		 * 2) Count the occurrences of each letter in the array. To do so, create an array, say counts, of 26 int 
		 * values, each of which counts the occurrences of a letter.
		 * That is, counts[0] counts the number of a’s, counts[1] counts the number of b’s, and so on.
		 */
		//Declare and create array through method
		char [] chars = createArray();
		
		// Display the array
		//System.out.println("The random lowercase letters are:");
		//displayArray(chars);
		
		// Count the occurrences of each letter
		//int [] counts = countLetters(chars);
		
		// Display counts
		//System.out.println("The occurrences of each letter are:"); 
		//displayCounts(counts);
		
		/* Variable-Length Argument Lists:
		 * A variable number of arguments of the same type can be passed to a method and treated as an array.
		 * Meaning, when you don't have a fixed length of array.
		 * Syntax for parameter of the method:	typeName... parameterName
		 */
		//Following program contains method that prints the maximum value in a list of an unspecified number of values.

		printMax (34, 3, 3, 2, 56.5); 				//pass variable length arg
		printMax (new double [] {1, 2, 3});		//pass array arg
		
		//TNB: say you wanna build a method to average bunch of numbers and you don't know how many numbers you
		//wanna average. We'll build a method that takes however arguments you want. 
		
		//System.out.println(average(43, 56, 76, 8, 65, 76, 2, 31));
	//even though we haven't declared any array (anywhere), ^these numbers get passed to the method and are sorta
		//treated as an array
	}
//when you don't know how many you put ... 3dots and then put the var you wanna use
	//Only one variable-length parameter may be specified in a method, and this parameter must be the last parameter. 
//Any regular parameters must precede it.
	public static int average (int...numbers) //<<<variable length parameter
	{									//^I'll be throwing numbers in here but Idk if it'll be 1 num, 2 nums or 500 nums
		int sum = 0;
		
		for (int e: numbers)
		{
			sum += e;
		}
		return (sum / numbers.length);
	}
	
	public static void printMax (double... numbers) 
	{ 
		if (numbers.length == 0) 
		{
		System.out.println("No argument passed"); 
		return;
		}
		
		double result = numbers [0];
		
		for (int i = 1; i < numbers.length; i++) 
		{
			if (numbers [i] > result)
			{
				result = numbers[i];
			}
		}
		System.out.println("The max value is " + result);
	}
	
	public static char [] createArray ()
	{
		char [] chars = new char [100];
		//Create lowercase letters randomly and assign them to the array we declared above
		for (int i = 0; i < chars.length; i++)
		{
			chars [i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
			//could also use: (from 6.10)
			/*a random character between any two characters ch1 and ch2 with ch1 < ch2 can be
			generated as follows:
			(char)(ch1 + Math.random() * (ch2 – ch1 + 1))
			Initially had used the Random class method to generate it. 
			 * 
			 */
		}
		return chars;
	}
	
	public static void displayArray(char [] chars)
	{
		for (int i = 0; i < chars.length; i++)
		{
			System.out.print(chars [i] + (((i + 1) % 20 == 0)? "\n" : "\t"));			//20/line
		}
	}
	
	public static int [] countLetters (char [] chars)
	{
		// Declare and create an array of 26 int
		int [] counts = new int [26];
		
		// For each lowercase letter in the array, count it
		for (int i = 0; i < chars.length; i++)
		{
			counts [chars [i] - 'a']++;
			/*If the letter (chars[i]) is a, the corresponding count is counts['a' - 'a'] (i.e., counts[0]). If the letter is b, 
			 * the corresponding count is counts['b' - 'a'] (i.e., counts[1]), since the Unicode of b is one more than that of a. 
			 * If the letter is z, the corresponding count is counts['z' - 'a'] (i.e., counts[25]), since the Unicode of z is 25 more 
			 * than that of a.
			 */
		}
		return counts;
	}
										//10 per line
	public static void displayCounts (int [] counts)
	{
		for (int i = 0; i <counts.length; i++)
		{
			System.out.print(counts[i] + "" + (char) (i + 'a') + (((i+1) % 10 ==0)? "\n" : " "));
		}
	}

}
