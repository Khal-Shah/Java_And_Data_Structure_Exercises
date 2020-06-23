package ch5_exercises;
import java.util.*;

/* Chapter 5 - Exercise 31:
 * (Financial application: compute CD value) 
 * Suppose you put $10,000 into a CD with an annual percentage yield of 5.75%. After one month, the CD is worth
                    10000 + 10000 * 5.75 / 1200 = 10047.92
After two months, the CD is worth
                 10047.91 + 10047.91 * 5.75 / 1200 = 10096.06
After three months, the CD is worth
                 10096.06 + 10096.06 * 5.75 / 1200 = 10144.44
and so on.
Write a program that prompts the user to enter an amount (e.g., 10000), the annual percentage yield (e.g., 5.75), 
and the number of months (e.g., 18) and displays a table as shown in the sample run.

Enter the initial deposit amount: 10000
Enter annual percentage yield: 5.75
Enter maturity period (number of months): 18
Month  CD Value
1 10047.92
2 10096.06
...
17 10846.57
18 10898.54
 */
		//By Khaled Shah

public class Ch5_31_CD_Values
{
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter the initial deposit amount: ");
		double iAmount = kb.nextDouble();
		
		System.out.print("Enter annual percentage yield: ");
		double annualYieldP = kb.nextDouble();
		
		System.out.print("Enter maturity period (number of months): ");
		double months = kb.nextDouble();
		
		double futureWorth = iAmount;
		
		System.out.println("\nMonth\tCD Value");
		
		for (int i = 1; i <= months; i++)
		{
			futureWorth +=  (futureWorth * annualYieldP / (100 * 12));
			System.out.printf("  %d \t\t$%.2f\n", i, futureWorth);
		}

	}

}
