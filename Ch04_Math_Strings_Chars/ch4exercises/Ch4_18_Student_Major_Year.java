package ch4exercises;
import java.util.Scanner;

public class Ch4_18_Student_Major_Year

		/* Chapter 4 - Exercise 18:
		 * (Student major and status) Write a program that prompts the user to enter two characters and displays the 
		 * major and status represented in the characters. The first character indicates the major and the second is number 
		 * character 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. 
		 * 
		 * Suppose the following characters are used to denote the majors:
		 * 
			M: Mathematics
			C: Computer Science
			I: Information Technology

			Here is a sample run:
			Enter two characters: M1
			Mathematics Freshman
			
			Enter two characters: C3
			Computer Science Junior
			
			Enter two characters: T3
			Invalid input
		 */
				// By Khaled Shah
{
	static Scanner kb = new Scanner (System.in);

	public static void main(String[] args)
	
	{
		System.out.print("Enter a character, indicating your major (M for Mathematics, C for Computer Science and"
				+ " I for Information Technology).\nAnd another indicating your year "
				+ "(1 for freshmen, 2 for sophmore, 3 for junior and 4 for senior): ");
		String userInput = kb.nextLine();
		
		char majorFirstLetter = userInput.charAt(0);
		majorFirstLetter = Character.toUpperCase(majorFirstLetter);
		String extractYear = "" + userInput.charAt(1);
		int year = Integer.parseInt(extractYear);				//converts string to int
		String major = "";
		String status = "";
		
		kb.close();
		
		switch (majorFirstLetter)
		{
			case 'M': major = "Mathematics";
			break;
			case 'C': major = "Computer Science";
			break;
			case 'I': major = "Information Technology";
			break;
			default: 
			System.out.println("Invalid input. Restart the program");
			System.exit(0);
		}
		
		switch (year)
		{
			case 1: status = "Freshman";
			break;
			case 2: status = "Sophmore";
			break;
			case 3: status = "Junior";
			break;
			case 4: status = "Senior";
			break;
			default: 
			System.out.println("Invalid input. Restart the program");
			System.exit(0);
		}
		
		System.out.println(major + " " + status);

	}

}
