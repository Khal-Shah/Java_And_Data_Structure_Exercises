package ch3notes;
import java.util.Scanner;

	/* Boolean data type: The result of the comparison is a Boolean value: true or false. 
	 * Comparison: == means equal to in java (= is when you ASSIGN a value to a variable)...!= is NOT EQUAL TO
	 * A variable that holds a Boolean value is known as a Boolean variable. The boolean data type is used to declare 
	 * Boolean variables. A boolean variable can hold one of the two values: true or false. For example, the following 
	 * statement assigns true to the variable lightsOn:
		boolean lightsOn = true;	true and false are literals, just like a number such as 10. They are treated as reserved 
		words and cannot be used as identifiers in the program.
		Those 6 comparison operators (==, !=, >, =>, <, <=) ARE boolean ops (will return true/false
		Also don't forget the XOR (Exclusive or) which is used by "^"....p1 ^ p2 means for expression to be T, p1 and p2
		have to have diff values. if p1 and p2 are both T or F = false. Notice p1 ^ p2 is the same as p1 != p2.
		
		//Generating random number: You can use Math.random() to obtain a random double value between 0.0 and 1.0, 
		 * excluding 1.0. Invoking this method returns a random double value d such that 0.0 <= d < 1.0
		 * Thus, (int)(Math.random() * 10) returns a random single-digit integer (i.e., a number between 0 and 9).
		 * 50 + (int)(Math.random() * 50) ====> number between 50 and 99
		 * a + Math.random() * b Returns a random number BETWEEN a and (a + b), excluding (a + b).
		 * 
		 * CONDITIONAL EXPRESSION SYNTAX (for simple if else): (boolean-expression)? expression1 : expression2;
The result of this conditional expression is expression1 if boolean-expression is true; otherwise the result is expression2.
Suppose you want to assign the larger number of variable num1 and num2 to max. You can simply write a statement 
using the conditional expression:  max = (num1 > num2) ? num1 : num2;

	Operator Precedence and Associativity: 
	The logical operators have lower precedence than the relational operators and the relational operators have 
	lower precedence than the arithmetic operators.
	
	In decreasing order of precedence (highest on top, lowest in bottom):
	var++ and var–– (Postfix)
	+, – (Unary plus and minus), ++var and ––var (Prefix) (type) (Casting)
	!(Not)
	 *, /, % (Multiplication, division, and remainder)
	+, – (Binary addition and subtraction)
	<, <=, >, >= (Relational)
	==, != (Equality)
	^ (Exclusive OR)
	&& (AND)
	|| (OR)
	=, +=, –=, *=, /=, %= (Assignment operator)
	
	If operators with the same precedence are next to each other, their associativity determines the order of evaluation. 
	All binary operators except assignment operators are left associative. Ex: a + b + c + d ===== ((a + b) + c) - d
	
	Assignment operators are right associative. Therefore, the expression a + b += c = 5
	is equivalent to a = (b += (c = 5))...Suppose a, b, and c are 1 before the assignment
	after the whole expression is evaluated, a becomes 6, b becomes 6, and c becomes 5.
	 */

public class Ch3_Boolean_If
{
	static Scanner kb = new Scanner(System.in);
	//Generate 2 numbers using time class, ask to add them and display true/false based on result.
//	static int num1 = (int) System.currentTimeMillis() % 10;
//	static int num2 = (int) System.currentTimeMillis() / 7 % 20;
	
	public static void main(String[] args)
	{
//		System.out.print("What is " + num1 + " + " + num2 + " = ");
//		int sum = kb.nextInt();
////		boolean result = true;
//		
//		while (sum != (num1 + num2))
//		{
//			System.out.print(sum + " is wrong. Perform the addition and enter the result again."
//					+ "\n" + num1 + " + " + num2 + " = ");
//			sum = kb.nextInt();
//		}
		
//		System.out.println(num1 + " + " + num2 + " = " + sum + " is " + (num1 + num2 == sum));
		
		//gives a program that prompts the user to enter an integer. If the number is a multiple of 5, the program displays 
		//HiFive. If the number is divisible by 2, it displays HiEven
//		
//		System.out.print("Enter an integer: ");
//		int userNum = kb.nextInt();
//		
//		if ((userNum % 2) == 0)
//		{
//			System.out.println("HiEven!");
//		}
//		
//		else
//		{
//			System.out.println("HiFive!");
//		}
		
		/* Suppose you want to develop a program for a first-grader to practice subtraction. The program randomly 
		 * generates two single-digit integers, number1 and number2, with number1 >= number2, and it displays to 
		 * the student a question such as “What is 9 - 2?” After the student enters the answer, the program displays a 
		 * message indicating whether it is correct.
		 */
		
//		int num1 = (int) (10* Math.random());
//		int num2 = (int) (10* Math.random());
//		
//		if (num2 > num1)
//		{
//			int temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
//		
//		System.out.print("Perform the following subtraction: " + num1+ " - " + num2 + " = " );
//		int difference = kb.nextInt();
//		
//		System.out.println(num1+ " - " + num2 + " = " + difference + " is " + (num1 - num2 == difference));
		
		// Leap year: A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
		System.out.print("Enter a year: ");
		int year = kb.nextInt();
		
		boolean leapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
		
		if (leapYear)
		{
			System.out.println(year + " is a leap year.");
		}
		
		else
		{
			System.out.println(year + " is not a leap year.");
		}
		
	}

}
