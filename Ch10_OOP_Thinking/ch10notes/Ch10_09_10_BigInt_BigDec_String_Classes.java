package ch10notes;

/* Chapter 10.9: Big Integer and Big Decimal Classes
 * The BigInteger and BigDecimal classes can be used to represent integers or decimal numbers of any size and precision.
 * BigInteger a = new BigInteger("9223372036854775807"); 		creates an object (a) of a big integer val
 * BigInteger b = new BigInteger("2");
BigInteger c = a.multiply(b); 						// 9223372036854775807 * 2 
System.out.println(c);					//this is bigger than "regular" integer range = 18446744073709551614

No limit to the precision of BigDecimal object either
BigDecimal a = new BigDecimal(1.0);
BigDecimal b = new BigDecimal(3);
BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP); 
System.out.println(c);
The output is 0.33333333333333333334.
 */

/* 10.10: The String class: A String object is immutable: Its content cannot be changed once the string is created.
 * 
 * 10.1: CONSTRUCTING A STRING:
 * You can create a string object from a string literal or from an array of characters. To create a string from a string literal, 
 * use the syntax:											String newString = new String("stringLiteral");
 * Java treats a string literal as a String object. Thus, the following statement is valid: 
 * String message = "Welcome to Java";
You can also create a string from an array of characters. For example the following statements create the string "Good Day":
char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'}; 
String message = new String(charArray);
 * A String variable holds a reference to a String object that stores a string value. Strictly speaking, the terms String variable, 
 * String object, and string value are different, but most of the time the distinctions between them can be ignored. 
 * For simplicity, the term string will often be used to refer to String variable, String object, and string value.
 */

/* 10.2: IMMUTABLE STRINGS AND INTERNED STRINGS
 * A String object is immutable; its contents cannot be changed. Does the following code change the contents of the string?
String s = "Java"; 
s = "HTML";
The answer is no. The first statement creates a String object with the content "Java" and assigns its reference to s. 
The second statement creates a new String object with the content "HTML" and assigns its reference to s. The first String 
object still exists after the assignment, but it can no longer be accessed, because variable s now points to the new object

Concept of Interned:
String s1 = "Welcome to Java";
String s2 = new String("Welcome to Java");
String s3 = "Welcome to Java";

System.out.println("s1 == s2 is " + (s1 == s2)); 										s1 == s2 is false
System.out.println("s1 == s3 is " + (s1 == s3));										s1 == s3 is true

In the preceding statements, s1 and s3 refer to the same interned string—"Welcome to Java"— so s1 == s3 is true.
However, s1 == s2 is false, because s1 and s2 are two different string objects, even though they have the same contents.
 */

/* 10.3: REPLACING AND SPLITTING STRINGS:
 * "Welcome".replace('e', 'A') returns a new string, WAlcomA. 
 * "Welcome".replaceFirst("e", "AB") returns a new string, WABlcome. 
 * "Welcome".replace("e", "AB") returns a new string, WABlcomAB. 
 * "Welcome".replace("el", "AB") returns a new string, WABcome.
 * 
 * The split method can be used to extract tokens from a string with the specified delimiters. For example, 
 * the following code	
 * String[] tokens = "Java#HTML#Perl".split("#"); 
 * for (int i = 0; i < tokens.length; i++)
System.out.print(tokens[i] + " "); 
																	displays				Java HTML Perl

 */

/* 10.4: MATCHING, REPLACING, AND SPLITTING BY PATTERNS
 * Let us begin with the matches method in the String class. At first glance, the matches method is very similar to the equals 
 * method. For example, the following two statements both evaluate to true.
"Java".matches("Java"); 
"Java".equals("Java");
However, the matches method is more powerful. It can match not only a fixed string, but also a SET OF STRINGS THAT 
FOLLOW A PATTERN. 

For example, the following statements all evaluate to TRUE:
"Java is fun".matches("Java.*") 
"Java is cool".matches("Java.*") 
"Java is powerful".matches("Java.*")

Java.* in the preceding statements is a regular expression. It describes a string pattern that begins with Java followed 
by any zero or more characters. Here, the substring matches any zero or more characters.

The following statement evaluates to true.
"440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}")
Here \\d represents a single digit, and \\d{3} represents three digits.

The replaceAll, replaceFirst, and split methods can be used with a regular expression. For example, the following 
statement returns a new string that replaces $, +, or # in a+b$#c with the string NNN.
String s = "a+b$#c".replaceAll("[$+#]", "NNN"); 
System.out.println(s);
Here the regular expression [$+#] specifies a pattern that matches $, +, or #. So, the output is aNNNbNNNNNNc.
 * 
 * 
 * The following statement splits the string into an array of strings delimited by punctuation marks.
String[] tokens = "Java,C?C#,C++".split("[.,:;?]"); 
for (int i = 0; i < tokens.length; i++)
    System.out.println(tokens[i]);
In this example, the regular expression [.,:;?] specifies a pattern that matches ., ,, :, ;, or ?. Each of these characters is a 
delimiter for splitting the string. Thus, the string is split into Java, C, C#, and C++, which are stored in array tokens.
 */

/* 10.5: CONVERSION BETWEEN STRINGS AND ARRAYS:
 *  Strings are not arrays, but a string can be converted into an array, and vice versa. To convert a string into an array of 
 *  characters, use the toCharArray method. For example, the following statement converts the string Java to an array.
char[] chars = "Java".toCharArray();

You can also use the getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) method to copy a substring of the string 
from index srcBegin to index srcEnd-1 into a character array dst starting from index dstBegin. For example, the following 
code copies a substring "3720" in "CS3720" from index 2 to index 6-1 into the
character array dst starting from index 4.
char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
"CS3720".getChars(2, 6, dst, 4);
Thus,	dstbecomes{'J', 'A', 'V', 'A', '3', '7', '2', '0'}.

To convert an array of characters into a string, use the String(char[]) constructor or the valueOf(char[]) method. 
For example, the following statement constructs a string
from an array using the String constructor.
String str = new String(new char[]{'J', 'a', 'v', 'a'});

The next statement constructs a string from an array using the valueOf method. 
String str = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
 */

/* 10.6: CONVERTING CHARACTERS AND NUMERIC VALUES TO STRINGS
 * Recall that you can use Double.parseDouble(str) or Integer.parseInt(str) to convert a string to a double value or an int 
 * value and you can convert a character or a number into a string by using the string concatenating operator. 
 * Another way of converting a number into a string is to use the overloaded static valueOf method. This method can also 
 * be used to convert a character or an array of characters into a string
 * 
 All the methods below return a string value:
      
Returns a string consisting of the character c.																			String.valueOf('c')
Returns a string consisting of the characters in the array. 														String.valueOf(charRef [index])
Returns a string representing the double value. 																		String.valueOf(5.44)
For example, to convert a double value 5.44 to a string, use String.valueOf(5.44). The return value is a string consisting 
of the characters '5', '.', '4', and '4'.

Returns a string representing the float value.																			String.valueOf(floatVal)
Returns a string representing the int value.																				String.valueOf(intVal)
Returns a string representing the long value.																			String.valueOf(longVal)
Returns a string representing the boolean value.																		String.valueOf(boolVal)
 */

/* 10.7: FORMATTING STRINGS:
 * The String class contains the static format method to return a formatted string. The syntax to invoke this method is:
String.format(format, item1, item2, ..., itemk)
This method is similar to the printf method except that the format method RETURNS a formatted string, whereas the 
printf method DISPLAYS a formatted string. 
For example,
 String s = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
  System.out.println(s);
displays
__45.56____14AB__
 */


public class Ch10_09_10_BigInt_BigDec_String_Classes
{

	public static void main(String[] args)
	{
		//REPLACE
		//System.out.println("My Name Is".replace("y", "ah")); 				//Mah Name Is
		//System.out.println("Welcome to Java".replaceFirst("o", "u"));	//Welcume to Java
		
		//SPLIT
		String [] split = "MondayTuesdayThursdayFridaySunday".split("day");		
		//System.out.println(split.length);				5 (there are 5 "day"s to split)
		for (int i = 0; i <split.length; i++)
		{
			System.out.print(split[i] + ", ");			//Mon, Tues, Thurs, Fri, Sun,
		}
		
		//MATCHES
		System.out.println();
		System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));			//backslash NOT //
		System.out.println("514-552-5030".matches("\\d{3}-\\d{4}-\\d{4}"));		//false cuz middle group isn't 4 digs
		
		//REPLACEALL
		System.out.println("ab$c^d#&".replaceAll("[$^#&]", "ERROR"));		//abERRORcERRORdERRORERROR
		//System.out.println("Welcome To Java".replaceAll("Java", "HTML"));
		
		//STRING TO ARRAY (char array)]
		String msg = "ABCDEFGH";
		char [] msgArr = msg.toCharArray();			//you create a char array using the method StringName.toCharArray();
		
		//w/o ref var...char [] chars = "StringMsgHere".toCharArray() would also put the StringMsgHere into a char array
		
		for (char e: msgArr)
		{
			System.out.print(e);			//msgArr[0] now would be A and so on.
		}
		
		//REPLACING VALUES (chars) FROM AN ARRAY
		//getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		char [] address = {'J', 'U', 'L','I','E','T','T','E', '2', '1', '0', '3'};			//say I wanna replae the 2103 with 7651
		"7651".getChars(0, 4, address, 8);
		
		System.out.println();
		for (char add: address)
		{
			System.out.print(add);							//Juliette7651
		}
		//Now say I wanna make it 7615 instead of 7651
		
		"15".getChars(0, 2, address, 10);
		
		System.out.println();
		
		for (char add: address)
		{
			System.out.print(add);				//Juliette7615
		}
		
		System.out.println();
		
		//CHAR ARRAY TO STRING
		//So right now the address is a char array, say I wanna convert that to string
		//I have to create a new object of String and put the array in the constructor
		
		String myAddress = new String (address);
		
		System.out.println(myAddress);  			//Juliette7615
		//Or if you wanna create a new char array and pass it to the constructor and have it as a string
		String lastMovie = new String (new char [] {'J', 'o', 'h', 'n', 'W', 'i', 'c', 'k'});
		System.out.println(lastMovie); 	//JohnWick
		
		//System.out.println(String.valueOf(address [address.length - 1]));		//5
		//System.out.println(String.valueOf('d'));					//d as str
	}

}
