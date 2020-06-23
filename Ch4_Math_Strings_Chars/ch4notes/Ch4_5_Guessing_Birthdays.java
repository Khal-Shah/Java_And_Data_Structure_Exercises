package ch4notes;
import java.util.Scanner;

public class Ch4_5_Guessing_Birthdays

		// Chapter 4.5: Case studies...First we'll look at how we can guess a birthday. 
{
	static Scanner kb = new Scanner (System.in);
	
	//5 sets...all numbers, so to store them we have to use String (since they're not just whole numbers that we're storing)
	
	static final String SET_1 = " 1\t\t3\t\t5\t\t7\n"
			+ 									   "9\t\t11\t\t13\t\t15\n"
			+ 										"17\t\t19\t\t21\t\t23\n"
			+ 										"25\t\t27\t\t29\t\t31";
	
	static final String SET_2 = " 2\t\t3\t\t6\t\t7\n"
			+ 									   "10\t\t11\t\t14\t\t15\n"
			+ 										"18\t\t19\t\t22\t\t23\n"
			+ 										"26\t\t27\t\t30\t\t31";
	
	static final String SET_3 = " 4\t\t5\t\t6\t\t7\n"
			+ 									   "12\t\t13\t\t14\t\t15\n"
			+ 										"20\t\t21\t\t22\t\t23\n"
			+ 										"28\t\t29\t\t30\t\t31";
	
	static final String SET_4 = " 8\t\t9\t\t10\t\t11\n"
			+ 									   "12\t\t13\t\t14\t\t15\n"
			+ 										"24\t\t25\t\t26\t\t27\n"
			+ 										"28\t\t29\t\t30\t\t31";
	
	static final String SET_5 = "16\t\t17\t\t18\t\t19\n"
			+ 									   "20\t\t21\t\t22\t\t23\n"
			+ 										"24\t\t25\t\t26\t\t27\n"
			+ 										"28\t\t29\t\t30\t\t31";
			

	public static void main(String[] args)
	
	// 1) Birthdays: We can guess someone's bday  (day only, not month or year) by asking if the date belongs to each
	// of the 5 sets. The date will be the sum of the first number of each set that the day belongs to. 
	{
		String userChoice = "";
		int dateOfDay = 0;
		System.out.println("You have to indicate whether your birthday is in the each of the 5 sets that will be shown to you."
				+ "\nIs your birthday in the following set?\n" + SET_1);
		System.out.print("Enter Yes or No: ");
		userChoice = kb.nextLine();
		
		if (userChoice.equalsIgnoreCase("yes"))
		{
			dateOfDay = 1;
		}
		
		System.out.println("What about this set below?\n" + SET_2);
		System.out.print("Enter Yes or No: ");
		userChoice = kb.nextLine();
		
		if (userChoice.equalsIgnoreCase("yes"))
		{
			dateOfDay += 2;
		}
		
		System.out.println("Is it in set 3 below?\n" + SET_3);
		System.out.print("Enter Yes or No: ");
		userChoice = kb.nextLine();
		
		if (userChoice.equalsIgnoreCase("yes"))
		{
			dateOfDay += 4;
		}
		
		System.out.println("What about this set?\n" + SET_4);
		System.out.print("Enter Yes or No: ");
		userChoice = kb.nextLine();
		
		if (userChoice.equalsIgnoreCase("yes"))
		{
			dateOfDay += 8;
		}
		
		System.out.println("Now answer if it belongs in this last set:\n" + SET_5);
		System.out.print("Enter Yes or No: ");
		userChoice = kb.nextLine();
		
		if (userChoice.equalsIgnoreCase("yes"))
		{
			dateOfDay += 16;
		}
		
		String suffix = "";
		
		switch (dateOfDay)
		{
			case 1: suffix = "st";
			break;
			case 2: suffix = "nd";
			break;
			case 3: suffix = "rd";
			break;
			case 21: suffix = "st";
			break;
			case 22: suffix = "nd";
			break;
			case 31: suffix = "st";
			break;
			default: suffix = "th";
		}
		
		System.out.println("\nYour birthday is on the " + dateOfDay + suffix + "!");
		
	}

}
