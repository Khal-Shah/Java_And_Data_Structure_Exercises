package ch4notes;
import java.util.Scanner;

public class Ch4_4_String_Type
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	{
		/* STRING METHODS:
		 * length()														Returns the number of characters in this string.
			charAt(index)											Returns the character at the specified index from this string.
			concat(s1)													Returns a new string that concatenates this string with string s1.
			toUpperCase()											Returns a new string with all letters in uppercase.
			toLowerCase()											Returns a new string with all letters in lowercase
			trim()															Returns a new string with whitespace characters trimmed on both sides.
			
			Strings are objects in Java. The methods above can only be invoked from a specific string instance. 
			For this reason, these methods are called instance methods. A non-instance method is called a static method. 
			A static method can be invoked without using an object. All the methods defined in the Math class are static 
			methods. They are not tied to a specific object instance. 
			
			The syntax to invoke an instance method is reference-Variable.methodName(arguments). 
			A method may have many arguments or no arguments. For example, the charAt(index) method has one argument, 
			but the length() method has no arguments. 
			Recall that the syntax to invoke a static method is ClassName .methodName(arguments). 
			For example, the pow method in the Math class can be invoked usingMath.pow(2, 2.5).
		 */
		
		String message = "Welcome to Java";
//		System.out.println("The message \"" + message + "\" has " + message.length() + " characters."); //15
		//	The message.charAt(index) method can be used to retrieve a specific character in the string, where the index 
		// is between 0 and message.length() – 1. For example, message.charAt(0) returns the character W.
		//Note that the index for the first character in the string is 0.				(0 index like arrays)
		
		// CONCATENATION: 
		String myString = message + " and " + " HTML";
//		System.out.println(myString);		//Welcome to Java and HTML
		
		message += " and Java is fun.";
//		System.out.println(message);			//Welcome to Java and Java is fun.
		
		// If i = 1 and j = 2, what is the output of the following statement?
//		System.out.println("i + j is " + i + j);							The output is "i + j is 12"						do (i + j) to actually add 1+2

		
		/*
 * Converting Strings
The toLowerCase() method returns a new string with all lowercase letters and the toUpperCase() method returns a new 
string with all uppercase letters. For example, 
"Welcome".toLowerCase() returns a new string welcome. 
"Welcome".toUpperCase() returns a new string WELCOME.
The trim() method returns a new string by eliminating whitespace characters from both ends of the string. 
The characters ' ', \t, \f, \r, or \n are known as whitespace characters. For example,
"\t Good Night \n".trim() returns a new string Good Night.
 */
		
		/* 4.4.5 Reading a String from the Console
To read a string from the console, invoke the next() method on a Scanner object.
The next() method reads a string that ends with a whitespace character. You can use the nextLine() method to read an 
entire line of text. The nextLine() method reads a string that ends with the Enter key pressed.
		 * So next() for one character/word...nextLine if String includes space
		 */
		
		
		/* 4.4.7 Comparing Strings
The String class contains the methods as shown below for comparing two strings.
equals(s1)																				Returns true if this string is equal to string s1.
equalsIgnoreCase(s1)															Returns true if this string is equal to string s1; it is case insensitive.
compareTo(s1)																	Returns an integer greater than 0, equal to 0, or less than 0 to indicate 
																								whether this string is greater than, equal to, or less than s1.
compareToIgnoreCase(s1)												Same as compareTo except that the comparison is case insensitive.
startsWith(prefix)																	Returns true if this string starts with the specified prefix.
endsWith(suffix)																	Returns true if this string ends with the specified suffix.
contains(s1)																			Returns true if s1 is a substring in this string.
		 * 
		 * For example, the following statements display true and then false.
String s1 = "Welcome to Java";
String s2 = "Welcome to Java";
String s3 = "Welcome to C++"; 
System.out.println(s1.equals(s2)); 				// true
 System.out.println(s1.equals(s3)); 				// false
 
 "Welcome to Java".startsWith("We") returns true. 
"Welcome to Java".startsWith("we") returns false. 
"Welcome to Java".endsWith("va") returns true.
"Welcome to Java".endsWith("v") returns false. 
"Welcome to Java".contains("to") returns true. 
"Welcome to Java".contains("To") returns false.
 
The compareTo method can also be used to compare two strings. For example, consider the following code:
  s1.compareTo(s2)
The method returns the value 0 if s1 is equal to s2, a value less than 0 if s1 is lexicographically (i.e., in terms of Unicode 
ordering) less than s2, and a value greater than 0 if s1 is lexicographically greater than s2.

The actual value returned from the compareTo method depends on the offset of the first two distinct characters in s1 and 
s2 from left to right. For example, suppose s1 is abc and s2 is abg, and s1.compareTo(s2) returns -4. 
The first two characters (a vs. a) from s1 and s2 are compared. Because they are equal, the second two characters (b vs. b) 
are compared. Because they are also equal, the third two characters (c vs. g) are compared. 
Since the character c is 4 less than g, the comparison returns -4.
Caution
Syntax errors will occur if you compare strings by using relational operators >, >=, <, or <=. Instead, 
you have to use s1.compareTo(s2).
		 */
		
		System.out.print("Enter the first city: "); 
		String city1 = kb.nextLine(); 
		
		System.out.print("Enter the second city: ");
		String city2 = kb.nextLine();
		
		System.out.println((city1.compareTo(city2) < 0)? "The cities in alphabetical order are " + city1 + ", " + city2 : 
			"The cities in alphabetical order are " + city2 + ", " + city1);;
			
			/* The program reads two strings for two cities. If kb.nextLine() is replaced by kb.next(), you cannot enter a string 
			 * with spaces for city1. Since a city name may contain multiple words separated by spaces, the program uses the 
			 * nextLine method to read a string. Invoking city1.compareTo(city2) compares two strings city1 with city2. 
			 * A negative return value indicates that city1 is less than city2.
			 * 
			 * So basically: you can use kb.next() when you know the string won't have multiple words (no space).
			 * And kb.nextLine() must be used when you know the input will have space (many words)/
			 */
			
			/*
			 * 4.4.8 Obtaining Substrings
You can obtain a single character from a string using the charAt method. You can also obtain a substring from a string 
using the substring method in the String class.
For example,
String message = "Welcome to Java";
String message = message.substring(0, 11) + "HTML"; The string message now becomes Welcome to HTML.
			 */

//			String msg = "Welcome to Java";
//			msg = msg.substring(0) + " and HTML";			msg.substring(0) means start from index 0, go to end (end not spec)
//			System.out.println(msg);		//Welcome to Java and HTML
			
			/*
			 * substring(beginIndex)							Returns this string’s substring that begins with the character at the specified 
			 * 																	beginIndex and extends to the end of the string,
			 * substring(beginIndex, endIndex) 		Returns this string’s substring that begins at the specified beginIndex and 
			 * 																	extends to the character at index endIndex – 1
			 * 																	Note that the character at endIndex is not part of the substring
			 */
			
			/*
			 * 4.4.9 Finding a Character or a Substring in a String	(through finding index)
The String class provides several versions of indexOf and lastIndexOf methods to find a character or a substring in a 
string, as shown below:
index(ch)										Returns the index of the first occurrence of ch in the string. Returns -1 if not matched.
"Welcome to Java".indexOf('W') 	returns 0. 
"Welcome to Java".indexOf('o') 	returns 4. 

indexOf(ch, fromIndex)				Returns the index of the first occurrence of ch after fromIndex in the string. Returns -1 if not 
														matched.
"Welcome to Java".indexOf('o', 5)	returns 9. 
														
indexOf(s)										Returns the index of the first occurrence of string s in this string. Returns -1 if not matched.
"Welcome to Java".indexOf("come")		returns3 . 

indexOf(s, fromIndex)					Returns the index of the first occurrence of string s in this string after fromIndex. 
														Returns -1 if not matched.
"Welcome to Java".indexOf("Java", 5)		returns 11. 
"Welcome to Java".indexOf("java", 5)		returns -1.

lastIndexOf(ch)								Returns the index of the last occurrence of ch in the string. Returns -1 if not matched.
	"Welcome to Java".lastIndexOf('W')		returns 0. 
	"Welcome to Java".lastIndexOf('o')		returns 9. 

lastIndexOf(ch, fromIndex)		Returns the index of the last occurrence of ch before fromIndex in this string. Returns -1 if 
														not matched.
	"Welcome to Java".lastIndexOf('o', 5)	returns4. 

lastIndexOf(s)								Returns the index of the last occurrence of string s. Returns -1 if not matched.
"Welcome to Java".lastIndexOf("come")	returns3. 

lastIndexOf(s, fromIndex)			Returns the index of the last occurrence of string s BEFORE fromIndex. 
														Returns -1 if not matched.
	"Welcome to Java".lastIndexOf("Java", 5)	returns -1. 
	"Welcome to Java".lastIndexOf("Java")		returns 11.
	
	Suppose a string s contains the first name and last name separated by a space. 					// Kim Jones
	You can use the following code to extract the first name and last name from the string:
int k = s.indexOf(' ');									// k = 3 (until space)
String firstName = s.substring(0, k); 		Kim
String lastName = s.substring(k + 1);		Jones
			 */
			
			/*
			 * 4.4.10 Conversion between Strings and Numbers (String TO Int or String TO double)
You can convert a numeric string into a number. To convert a string into an int value, use the Integer.parseInt method, 
as follows:
int intValue = Integer.parseInt(intString);
where intString is a numeric string such as "123".
To convert a string into a double value, use the Double.parseDouble method, as
follows:
double doubleValue = Double.parseDouble(doubleString);
where doubleString is a numeric string such as "123.45".
If the string is not a numeric string, the conversion would cause a runtime error. The
Integer and Double classes are both included in the java.lang package, and thus they are automatically imported.
You can convert a number into a string, simply use the string concatenating operator as follows:
Integer.parseInt method
Double.parseDouble
method
   String s = number + "";
			 */
	}

}
