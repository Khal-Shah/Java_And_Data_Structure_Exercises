package ch2notes;
import java.util.*;

	/* a named constant, or simply constant, represents permanent data that never changes.

	 * final datatype CONSTANTNAME = value;
	 *  Capitalize every letter in a constant, and use underscores between words—for exam- ple, the constants PI 
	 *  and MAX_VALUE.
	 *  
	 *  The % operator, known as remainder or modulo operator, yields the remainder after division. 
	 *  The operand on the left is the dividend and the operand on the right is the divisor. 
	 *  Therefore, 7 % 3 yields 1, 3 % 7 yields 3, 12 % 4 yields 0, 26 % 8 yields 2, and 20 % 13 yields 7.
	 *  
	 *  The % operator is often used for positive integers, but it can also be used with negative integers and floating-point 
	 *  values. The remainder is negative only if the dividend is negative. For example, -7 % 3 yields -1, -12 % 4 yields 0, 
	 *  -26 % -8 yields -2, and 20 % -13 yields 7.
	 */

		/* Time: Get minutes and seconds remaining from total seconds
		 * 
		 */

public class Conventions_DataTypes_Time
{
	static final double PI = Math.PI;
	static Scanner input = new Scanner(System.in);
	

	public static void main(String[] args)
	{
////		System.out.println(PI);
//		System.out.print("Enter an integer for seconds: ");
//		int seconds = input.nextInt();
//		
//		System.out.print(seconds + " seconds has " );
////		int hours = seconds / 3600;				// seconds * (1 hr/ 3600 seconds) = hr
//		int minutes = seconds / 60; 			// seconds * (1 min / 60 seconds) = min
//		seconds %= 60;
		
//		System.out.println(minutes + " minutes and " + seconds + " seconds.");
		long totalMilliseconds = System.currentTimeMillis();
		//You can use this method to obtain the current time, and then compute the current second, minute, and hour.
		//You now have total MILLISECONDS, so to get total seconds: ms * (s / ms)
		long totalSeconds = (totalMilliseconds / 1000); //total secs since midnight Jan 1 1970
		long currentSeconds = totalSeconds % 60; 
		//to get total minutes: total seconds * (1 min / 60 seconds)
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
//		long total hours = totalSeconds / 3600;	or totalMinutes / 60 (min * 1hr/60min)
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		System.out.printf("Current time is %d:%d:%d GMT", currentHour, currentMinute, currentSeconds);

	}
	/* 
		You can invoke System.currentTimeMillis() to return the current time. (has to be long)
	 * The currentTimeMillis method in the System class returns the current time in milliseconds elapsed since midnight, 
	 * January 1, 1970 GMT
	 */
	
	/* An integer literal is assumed to be of the int type, whose value is between -2^31 (-2147483648) and 2^31 - 1 
	 * (2147483647). To denote an integer literal of the long type, append the letter L or l to it. For example, 
	 * to write integer 2147483648 in a Java program, you have to write it as 2147483648L 
	 * or 2147483648l, because 2147483648 exceeds the range for the int value. L is preferred because l (lowercase L) 
	 * can easily be confused with 1 (the digit one).
	 * 
	 * By default, an integer literal is a decimal integer number. To denote a binary integer literal, use a leading 0b or 0B 
	 * (zero B), to denote an octal integer literal, use a leading 0 (zero), and to denote a hexadecimal integer literal, use a 
	 * leading 0x or 0X (zero X). For example,
		System.out.println(0B1111); // Displays 15 
		System.out.println(07777); // Displays 4095 
		System.out.println(0XFFFF); // Displays 65535
		
		A special syntax is used to write scientific notation numbers. For example, 1.23456 * 10^2 is written as 1.23456E2 
		or 1.23456E+2 and 1.23456 * 10^-2 as 1.23456E-2. E (or e) represents an exponent and can be in either 
		lowercase or uppercase.
	 */

}
