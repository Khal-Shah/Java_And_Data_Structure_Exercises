package ch4notes;
import java.util.Scanner;

public class Ch4_3_Chars_Unicodes 

	// To printf char, use %c
	// boolean is %b
	// use %% to print % (as part of the msg output)

// a + Math.random() * b					returns a number between a and a + b (excluding a+b)

{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args) 
	
	{
		/* The character data type, char, is used to represent a single character. A character literal is enclosed in single 
		 * quotation  marks. Ex::char letter = 'A'; char numChar = '4';
		 * Unicode and ASCII code
		 * 
		 */
		/* Characters							Code Value in Decimal						Unicode Value
		'0' to '9'												48 to 57											\u0030 to \u0039
		'A' to 'Z'												65 to 90											\u0041 to \u005A
		'a' to 'z'												97 to 122										\u0061 to \u007A
		ASCII
You can use ASCII characters such as 'X', '1', and '$' in a Java program as well as Unicodes. Thus, for example, 
the following statements are equivalent:
char letter = 'A';
char letter = '\u0041'; // Character A's Unicode is 0041

Escape Sequences for Special Characters:
Escape Sequence											Name									
\b																	Backspace		
\t																				Tab
\n																			Linefeed
\f																			Formfeed
\r																		Carriage Return
\\																			Backslash
\"																		Double Quote
											
Casting between char and Numeric Types:

When a floating-point value is cast into a char, the floating-point value is first cast into an
int, which is then cast into a char.
char ch = (char)65.25; // Decimal 65 is assigned to ch
System.out.println(ch); // ch is character A
When a char is cast into a numeric type, the character’s Unicode is cast into the specified
numeric type.
int i = (int)'A'; // The Unicode of character A is assigned to i 
System.out.println(i); // i is 65

		*/
		int i = '2' + '3'; // (int) '2' is 50 and (int) '3' is 51 
		System.out.println("i is " + i); // i is 101
		int j = 2 + 'a'; // (int)'a' is 97 
		System.out.println("j is " + j); // j is 99 
		System.out.println(j + " is the Unicode for character "+ (char) j);
		// 99 is the Unicode for character c 
		System.out.println("Chapter " + '2');
			
		/*
		 * 4.3.4 Comparing and Testing Characters
Two characters can be compared using the relational operators just like comparing two numbers. This is done by 
comparing the Unicodes of the two characters. For example,
'a' < 'b' is true because the Unicode for 'a' (97) is less than the Unicode for 'b' (98). 
'a' < 'A' is false because the Unicode for 'a' (97) is greater than the Unicode for 'A' (65). 
'1' < '8' is true because the Unicode for '1' (49) is less than the Unicode for '8' (56).
Often in the program, you need to test whether a character is a number, a letter, an uppercase letter, or a lowercase letter.
This property can be used to write the code to test characters. For example, the following code tests whether a character 
ch is an uppercase letter, a lowercase letter, or a digital character.
if (ch >= 'A' && ch <= 'Z')
System.out.println(ch + " is an uppercase letter");
else if (ch >= 'a' && ch <= 'z') System.out.println(ch + " is a lowercase letter");
else if (ch >= '0' && ch <= '9') System.out.println(ch + " is a numeric character");
		 */
		
		/* For convenience, Java provides the following methods in the Character class for testing characters as shown below:
		 * Method (they're boolean) & Description
isDigit(ch)
Returns true if the specified character is a digit.
System.out.println("isDigit('a') is " + Character.isDigit('a'));					 	isDigit('a') is false

isLetter(ch)
Returns true if the specified character is a letter.
System.out.println("isLetter('a') is " + Character.isLetter('a'));					isLetter('a') is true

isLetterOrDigit(ch)
Returns true if the specified character is a letter or digit.

isLowerCase(ch)
Returns true if the specified character is a lowercase letter.
System.out.println("isLowerCase('a') is " + Character.isLowerCase('a'));					isLowerCase('a') is true

isUpperCase(ch)
Returns true if the specified character is an uppercase letter.
System.out.println("isUpperCase('a') is " + Character.isUpperCase('a'));					isUpperCase('a') is false

toLowerCase(ch)
Returns the lowercase of the specified character.
System.out.println("toLowerCase('T') is " + Character.toLowerCase('T'));					toLowerCase('T') is t

toUpperCase(ch)
Returns the uppercase of the specified character.
System.out.println("toUpperCase('q') is " + Character.toUpperCase('q'));					toUpperCase('q') is Q
		 */
		
		
		/* 4.4.6 Reading a Character from the Console
To read a character from the console, use the nextLine() method to read a string and then invoke the charAt(0) method 
on the string to return a character. For example, the following code reads a character from the keyboard:
Scanner input = new Scanner(System.in); 
System.out.print("Enter a character: ");
String s = input.nextLine();
char ch = s.charAt(0);
System.out.println("The character entered is " + ch);
		 * 
		 */
		
	}

}
