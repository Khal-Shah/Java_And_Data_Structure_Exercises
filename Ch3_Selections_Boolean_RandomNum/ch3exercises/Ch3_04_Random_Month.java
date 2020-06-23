package ch3exercises;
import java.util.Scanner;

		/* Chapter 3 - Exercise 4:
		 * (Random month) Write a program that randomly generates an integer between 1 and 12 and displays the 
		 * English month name January, February, ..., December for the number 1, 2, ..., 12, accordingly.
		 */
				//By Khaled Shah

public class Ch3_04_Random_Month
{
	static Scanner kb = new Scanner(System.in);
	static int monthNumber = (int) (1 + Math.random() * 12);

	public static void main(String[] args)
	{
		System.out.print("The month number " + monthNumber + " corresponds to the month ");
		
		String monthName = "name";
		
		/* The switch-expression must yield a value of char, byte, short, int, or String type and must always be enclosed in 
		 * parentheses. 

		■ The value1, . . ., and valueN (cases) must have the same data type as the value of the switch- expression. Note that value1, . . ., 
			and valueN are constant expressions, meaning that they cannot contain variables, such as 1 + x.
			
		■ When the value in a case statement matches the value of the switch-expression, the statements starting from this case 
			are executed until either a break statement or the end of the switch statement is reached.
			
		■ The default case, which is optional, can be used to perform actions when none of the specified cases matches the 
			switch-expression.

		■ The keyword break is optional. The break statement immediately ends the switch statement.
		*/
		
		switch (monthNumber)
		{
			case 1: monthName = "January";
			break;
			case 2: monthName = "February";
			break;
			case 3: monthName = "March";
			break;
			case 4: monthName = "April";
			break;
			case 5: monthName = "May";
			break;
			case 6: monthName = "June";
			break;
			case 7: monthName = "July";
			break;
			case 8: monthName = "August";
			break;
			case 9: monthName = "September";
			break;
			case 10: monthName = "October";
			break;
			case 11: monthName = "November";
			break;
			case 12: monthName = "December";
		}
		System.out.println(monthName + ".");
	}

}
