package ch5_exercises;
import java.util.*;

/* Chapter 5 - Exercise 5
 * (Conversion from kilograms to pounds and pounds to kilograms) 
 * Write a program that displays the following two tables side by side:
Kilograms 		Pounds 		| 		Pounds 			Kilograms 
1 							2.2			|		20 						9.09
all the way up to:
199					  437.8		|		515						234.09
(kg jumps in 2 and pounds in 5)
 */
	//By Khaled Shah

public class Ch5_05_Mass_Conversions
{

	public static void main(String[] args)
	{
		double kgToPounds = 2.2;
		double poundsToKg = (1/2.2);
		int shownKg = 1;
		int shownPounds = 20;
		
		System.out.println("Kilograms \t Pounds \t | \t Pounds \t Kilograms" );
		
		do 
		{
			System.out.printf("%d \t\t\t %.2f \t | \t %d \t\t %.2f \n", shownKg, (shownKg * kgToPounds), shownPounds, 
					(shownPounds * poundsToKg) );
			shownKg += 2;
			shownPounds += 5;
		} while (shownKg <=199 || shownPounds <= 515);

	}

}
